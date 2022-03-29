package cn.peyton.plum.core.exception.child;

import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.base.JsonMapper;
import cn.peyton.plum.core.utils.HttpServletResponseUtil;

import javax.servlet.http.HttpServletResponse;

/**
 * <h3>全局 异常类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @create date: 2018/11/16 15:12
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public class GlobalException extends RuntimeException {

    public GlobalException() {
        super();
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalException(Throwable cause) {
        super(cause);
    }

    protected GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * <h4>验证异常 PrintWriter 写出信息</h4>
     * @param response response 对象
     * @param jsonResult jsonResult 对象{封装的数据}
     */
    public GlobalException(HttpServletResponse response, JSONResult jsonResult) {
        HttpServletResponseUtil.returnJson(
                response, JsonMapper.toJSon(jsonResult));
    }
}
