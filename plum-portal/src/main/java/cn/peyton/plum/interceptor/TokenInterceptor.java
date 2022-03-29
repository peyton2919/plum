package cn.peyton.plum.interceptor;

import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.token.Token;
import cn.peyton.plum.core.token.TokenUtil;
import cn.peyton.plum.core.utils.HttpServletResponseUtil;
import cn.peyton.plum.core.base.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.token.AuthHandlerInterceptor.java
 * @create date: 2022/3/20 22:17
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request
                , HttpServletResponse response, Object handler) throws Exception {
        log.info("===============  进入拦截器{TokenInterceptor}  ===============");
        //如果不是映射到方法直接通过，可以访问资源
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Token methodAnnotation = method.getAnnotation(Token.class);

        TokenUtil tokenUtil = new TokenUtil();
        // 有 @Token 注解，需要认证
        if (null != methodAnnotation) {
            response.setCharacterEncoding("UTF-8");
            String accessToken = request.getHeader(TokenUtil.Property.ACCESS_TOKEN);
            if (null == accessToken) {
                response.setStatus(200);

                HttpServletResponseUtil.returnJson(
                        response, JsonMapper.toJSon(JSONResult.error(StatusCode.ILLEGAL_TOKEN)));
                return false;
            } else {
                if (!tokenUtil.verify(accessToken)) {
                    //
                    response.setStatus(200);
                    HttpServletResponseUtil.returnJson(
                            response, JsonMapper.toJSon(JSONResult.error(StatusCode.TOKEN_EXPIRE)));
                    // response.setHeader("token",null);
                    return false;
                }
            }
        }
        return true;
    }


}
