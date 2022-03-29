package cn.peyton.plum.controller;

/**
 * <h3>Controller 属性 与 key </h3>
 * <h3>登录类型</h3>
 * <pre>
 *     ACCOUNT: 账户密码 登录
 *     PHONE: 手机号码 登录
 *     OTHER: 其他方式 登录
 * </pre>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.PROPERTY.java
 * @create date: 2022/3/25 16:21
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public interface PROPERTY {
    String ACCOUNT = "account";
    String PHONE = "phone";
    String OTHER = "other";
    String EMAIL = "email";
    /** 用户登录成功时，存在 session中的 用户传参对象 key */
    String SESSION_USER = "SESSION_USER_PARAM_2203231855";
}
