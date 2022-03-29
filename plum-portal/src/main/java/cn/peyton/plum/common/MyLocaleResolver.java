package cn.peyton.plum.common;

import cn.peyton.plum.core.utils.StringUtil;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * <h3>自定义的国际化组件</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.config.MyLocaleResolver.java
 * @create date: 2021/12/26 21:46
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的语言参数
        String language = request.getParameter("lang");
        Locale locale = Locale.getDefault();
        if (!StringUtil.isEmpty(language)) {
            String[] split = language.split("_");
            if (split.length > 1) {
                locale = new Locale(split[0], split[1]);
            }
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
