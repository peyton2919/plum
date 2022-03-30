package cn.peyton.plum.common;

import cn.peyton.plum.core.utils.Lists;
import cn.peyton.plum.interceptor.ParameterInterceptor;
import cn.peyton.plum.interceptor.TokenInterceptor;
import cn.peyton.plum.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * <h3>配置 web config</h3>
 * <pre>
 *     ParameterInterceptor: 参数验证拦截器
 *     TokenInterceptor: token 拦截器
 *     AuthenticationInterceptor: 用户登录拦截器 {判断session 中是否存有用户信息}
 * </pre>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.config.MyWebConfig.java
 * @create date: 2022/3/21 0:04
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    /**
     * <pre>
     *     解决本地访问跨域问题
     * </pre>
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("http://192.168.3.2:8080")
                .allowedMethods("*")
                .allowedHeaders("*");
    }

    //添加视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    /**
     * <h4>资源映射路径</h4>
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**/imgs/**")
                .addResourceLocations("classpath:/static/imgs");
                // .addResourceLocations("file:" +System.getProperty("user.dir") +"/");//映射真实路径;最后必须加"/"，不然映射不到
                // .addResourceLocations("file:e:/temp/imgs");
    }

    //注册自定义的国际化组件
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

    /**
     * <h4>添加 拦截器</h4>
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePath = Lists.newArrayList();
        //排除拦截，除了注册登录(此时还没token)，其他都拦截
        excludePath.add("/user/register");  //登录
        excludePath.add("/user/login");     //注册
        excludePath.add("/static/**");  //静态资源
        excludePath.add("/assets/**");  //静态资源
        excludePath.add("/index.html");
        excludePath.add("/");
        excludePath.add("/css/*");
        excludePath.add("/js/*");
        excludePath.add("/img/*");

        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**/user/**"); //拦截规则

        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(parameterInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(excludePath);

        registry.addInterceptor(tokenInterceptor())
                .addPathPatterns("/**/token/**");


    }

    /**
     * <pre>
     *     解决 拦截器中注入bean 失败情况出现
     *     addArgumentResolvers方法中 添加
     *     argumentResolvers.add(currentUserMethodArgumentResolver());
     * </pre>
     * @return
     */
    @Bean
    public HandlerInterceptor tokenInterceptor() {
        return new TokenInterceptor();
    }

    /**
     * <h4>参数 验证 拦截器</h4>
     * @return HandlerInterceptor
     */
    @Bean
    public HandlerInterceptor parameterInterceptor() {
        return new ParameterInterceptor();
    }

    /**
     * <h4>验证 用户 是否登录 拦截器</h4>
     * @return
     */
    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
}
