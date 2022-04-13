package cn.peyton.plum.mall.vo;

import java.io.Serializable;

/**
 * <h3>广告视图类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.vo.AdVo.java
 * @create date: 2022-04-11 20:36
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class AdVo implements Serializable {
    /** ID */
    private String id;
    /** 广告图片地址 */
    private String src;
    /** 标题: 可用于导航栏 */
    private String title;
    /** 广告图片点击跳转链接 */
    private String url;
    /**
     * <pre>
     * location: 只在类型 type 三图 three 和导航 nav 时有作用
     *  1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *  2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     */
    private String location;


    /**
     * @return 这里定义 String 类型
     */
    public String getId() {
        return id;
    }

    /**
     * @param id 这里定义 String 类型
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return 广告图片地址
     */
    public String getSrc() {
        return src;
    }

    /**
     * @param src 广告图片地址
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * @return 标题: 可用于导航栏
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title 标题: 可用于导航栏
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return 广告图片点击跳转链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url 广告图片点击跳转链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <pre>
     * location: 只在类型 type 三图 three 和导航 nav 时有作用
     *  1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *  2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     * @return 只在类型 type 三图 three 和导航 nav 时有作用
     */
    public String getLocation() {
        return location;
    }

    /**
     * <pre>
     * location: 只在类型 type 三图 three 和导航 nav 时有作用
     *  1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *  2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     * @param location 只在类型 type 三图 three 和导航 nav 时有作用
     */
    public void setLocation(String location) {
        this.location = location;
    }


}
