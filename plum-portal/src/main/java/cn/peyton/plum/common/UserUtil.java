package cn.peyton.plum.common;

import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.controller.PROPERTY;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * <h3>用户工具类 .util</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.common.UserUtil.java
 * @create date: 2022/3/30 13:55
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class UserUtil implements Serializable {

    /**
     * <h4> 从 session 获取 用户对象</h4>
     * <pre>
     *     key默认为: PROPERTY.SESSION_USER
     * </pre>
     * @param request
     * @return 用户传递对象类
     */
    public final static UserParam getUserParam(HttpServletRequest request) {
        return UserUtil.getUserParam(request, null);
    }
    /**
     * <h4> 从 session 获取 用户对象</h4>
     * @param request
     * @param key
     * @return 用户传递对象类
     */
    public final static UserParam getUserParam(HttpServletRequest request, String key) {
        HttpSession session = request.getSession();
        if (key == null) {
            return (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        }
        return (UserParam) session.getAttribute(key);
    }
}
