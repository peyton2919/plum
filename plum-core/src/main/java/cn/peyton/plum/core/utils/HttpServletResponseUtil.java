package cn.peyton.plum.core.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.utils.HttpServletResponseUtils.java
 * @create date: 2022/3/21 22:55
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class HttpServletResponseUtil implements Serializable {

    /**
     * <h4>写出 response </h4>
     * @param response
     * @param json
     */
    public static void returnJson(HttpServletResponse response, String json) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        try {
            writer = response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            throw new RuntimeException("cn.peyton.plum.core.utils.HttpServletResponseUtils: " +
                    "{方法名：returnJson}; 写writer异常[IOException]");
        } finally {
            if (null != writer) {
                writer.close();
            }
        }
    }
}
