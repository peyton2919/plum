package cn.peyton.plum.interceptor;

import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.base.JsonMapper;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.utils.HttpServletRequestUtil;
import cn.peyton.plum.core.utils.HttpServletResponseUtil;
import cn.peyton.plum.core.utils.Maps;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.Validation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;

/**
 * <h3>判断 [post,get,delete,update] 参数及参数校验</h3>
 * <pre>
 *     校验规则: 在该方法上标记 @Valid
 * </pre>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.commons.ParameterInterceptor.java
 * @create date: 2022/3/22 14:20
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Slf4j
public class ParameterInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        log.info("===============  进入拦截器{ParameterInterceptor}  ===============");
        //如果不是映射到方法直接通过，可以访问资源
        if (!(handler instanceof HandlerMethod)) { return true; }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method _method = handlerMethod.getMethod();
        //获取参数集合
        Class<?>[] _parameterTypes = _method.getParameterTypes();
        //判断 是否有参数; 如果 没有参数 就不做验证
        if (!(null != _parameterTypes && _parameterTypes.length > 0)){ return true; }

        //获取request [post,get] 请求参数 key value
        Map<String, String[]> _parameterMap = request.getParameterMap();

        // 判断基础类型参数
        Parameter[] _parameters = _method.getParameters();
        for (Parameter _p : _parameters) {
            String _filedType = _p.getType().getTypeName();
            //判断如果是 对象类型 这个拦截器则暂时不做处理
            if (!HttpServletRequestUtil.isBaseType(_filedType)) { continue; }
            String _filedName = _p.getName();
            String[] _strs = _parameterMap.get(_filedName);
            if (null == _strs||"".equals(_strs[0])) {
                String _errMsg = "入参异常: {" +
                        "拦截器: ["+ ParameterInterceptor.class.getName() +"]; "+
                        "类名称: [" + _method.getDeclaringClass().getName() +
                        "];  方法名称：[" + _method.getName() + "];  参数名称: [" + _filedName + "]不能为空值;}";

                HttpServletResponseUtil.returnJson(response
                        ,JsonMapper.toJSon(
                        JSONResult.error(10000,_errMsg,response.getStatus())));
                return false;
            }
        }

        //  ***************************************************************************  //
        //获取 是否标记 Valid 的方法
        Valid _validAnnotation = _method.getAnnotation(Valid.class);
        // 有 @Valid 注解，需要验证
        if (null != _validAnnotation && _validAnnotation.require()) {
            Map<String,String> _errMap = Maps.createLinkHashMap();
            //验证参数 true: 验证单个错误就返回当前错误信息; false: 验证全部完全后返回全部错误信息;
            boolean _single = _validAnnotation.single();
            //判断逻辑
            for (Parameter _pm : _parameters) {
                //Java 基础属性验证方法
                String _typeName = _pm.getType().getName();
                //去除不要request,response,session
                if (HttpServletRequestUtil.isExclude(_typeName)) {
                    continue;
                }
                String _filedName = _pm.getName();
                if (HttpServletRequestUtil.isBaseType(_typeName)) {
                    String _val = null;
                    String[] _strs = _parameterMap.get(_filedName);
                    if (null != _strs && _strs.length > 0) {
                        _val = _strs[0];
                    }
                    Annotation[] _annotations = _pm.getAnnotations();
                    //判断属性上是否有注解, 有标记注解 为 true
                    if (null != _annotations && _annotations.length>0) {
                        Validation.valid(_errMap, _annotations, _filedName, _typeName, _val, _single);
                    }
                } else {
                    //调用赋值方法，并验证
                    _errMap = Validation.valid(HttpServletRequestUtil.voluation(_parameterMap,_typeName), _validAnnotation.single());
                }
                //_single 为 true 时表示单一验证，有一个验证不通过就直接跳出
                if (_single && _errMap.size() >0) {
                    break;
                }
            }
            if (null != _errMap && _errMap.size() >0){
                HttpServletResponseUtil.returnJson(
                        response, JsonMapper.toJSon(JSONResult.success(StatusCode.VALID_ERROR,_errMap)));
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {

    }
}
