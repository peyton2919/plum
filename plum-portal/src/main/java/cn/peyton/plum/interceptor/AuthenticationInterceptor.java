package cn.peyton.plum.interceptor;

import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.controller.PROPERTY;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.base.JsonMapper;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.token.TokenUtil;
import cn.peyton.plum.core.utils.HttpServletResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.interceptor.child.UserInfoInterceptor.java
 * @create date: 2021/11/7 22:45
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Slf4j
public class AuthenticationInterceptor implements HandlerInterceptor {

    /**
     * <h3>拦截请求，访问Controller 之前</h3>
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        //如果不是映射到方法直接通过，可以访问资源
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        //
        HttpSession session = request.getSession();
        Object _obj = session.getAttribute(PROPERTY.SESSION_USER);
        if (null == _obj) {
            HttpServletResponseUtil.returnJson(response, JsonMapper.toJSon(
                    JSONResult.error(StatusCode.NEED_LOGIN)));
            return false;
        }
        UserParam _param = (UserParam) _obj;
        TokenUtil _tokenUtil = new TokenUtil();
        //判断 token 是否是服务 签发的
        if (!_tokenUtil.verify(_param.getToken())) {
            HttpServletResponseUtil.returnJson(response, JsonMapper.toJSon(JSONResult.fail(StatusCode.ILLEGAL_TOKEN)));
            return false;
        }

        /**
         * false:请求被拦截
         * true: 请求放行，可以继续访问后面的 controller.
         */
        return true;
    }

    /**
     * <h3>请求访问到 controller 之后，渲染视图之前</h3>
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * <h3>请求访问到 controller 之后，渲染视图之后</h3>
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
