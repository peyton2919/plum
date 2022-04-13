package cn.peyton.plum.controller;

import org.yaml.snakeyaml.nodes.AnchorNode;

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

    /**
     * @return 获取 class目录
     */
    static String getLocation() {
        return Thread.currentThread().getContextClassLoader().getResource("").getPath();
    }
    /** 用户登录 类型为 账户 */
    String ACCOUNT = "account";
    /** 用户登录 类型为 手机 */
    String PHONE = "phone";
    /** 用户登录 类型为 第三方 */
    String OTHER = "other";
    /** 用户登录 类型为 邮箱 */
    String EMAIL = "email";
    /** 用户登录成功时，存在 session中的 用户传参对象 key */
    String SESSION_USER = "SESSION_USER_PARAM_2203231855";
    /** 产品图片 存放位置 */
    String PATH_IMG_PRODUCT = getLocation()+"static/images/product/";
    /** 广告图片 存放位置 */
    String PATH_IMG_AD = getLocation()+"static/images/ad/";
    /** 头像图片 存放位置 */
    String PATH_IMG_AVATAR = getLocation()+"static/images/avatar/";

    // ================================================== //
    /** 邮箱 */
    String NAME_EMAIL = "邮箱";
    /** 手机 */
    String NAME_PHONE = "手机";
    /** 状态 为 0 */
    Integer STATUS_0 = 0;
    /** 状态 为 1 */
    Integer STATUS_1 = 1;
    /** 状态 为 2 */
    Integer STATUS_2 = 2;
    /** 状态 为 3 */
    Integer STATUS_3 = 3;




}
