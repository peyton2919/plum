package cn.peyton.plum.mall.vo;

import cn.peyton.plum.core.utils.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * <h3></h3>
 * <pre>
 *   location: 只在类型 type 三图 three 和导航 nav 时有作用
 *      1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
 *      2. type = nav location 值用来排序，值越大越靠前;
 * </pre>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.vo.LayoutVo.java
 * @create date: 2022-04-11 21:17
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class LayoutVo implements Serializable {
    /**
     * <pre>
     *   location: 只在类型 type 三图 three 和导航 nav 时有作用
     *      1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *      2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     */
    private String type;
    /** 广告集合 */
    List<AdVo> ads;
    /** 广告对象: 当 type="one";创建广告对象 ad; */
    AdVo ad;

    /** 构造函数: 初始化 ads */
    public LayoutVo() {
        if (null == ads && !"one".equals(getType())) {
            ads = Lists.newArrayList();
        }
        if (null == ad && "one".equals(getType())) {
            ad = new AdVo();
        }
    }

    /**
     *  <pre>
     *   location: 只在类型 type 三图 three 和导航 nav 时有作用
     *      1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *      2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     * @return 类型: 0:one 单图; 1:three 三图; 2:swiper: 轮播图; 3:导航：nav;
     */
    public String getType() {
        return type;
    }

    /**
     * <pre>
     *   location: 只在类型 type 三图 three 和导航 nav 时有作用
     *      1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *      2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     *
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 广告集合
     */
    public List<AdVo> getAds() {
        return ads;
    }

    /**
     * @param ads 广告集合
     */
    public void setAds(List<AdVo> ads) {
        this.ads = ads;
    }

    public AdVo getAd() {
        return ad;
    }

    public void setAd(AdVo ad) {
        this.ad = ad;
    }

    public interface PROPERTY{
        /**
         * 字段名称: 导航分类 值为:nav;
         */
        String NAV = "nav";
        /**
         * 字段名称: 三图广告 值为:three;
         */
        String THREE = "three";
        /**
         * 字段名称: 单图广告 值为:one;
         */
        String ONE = "one";
        /**
         * 字段名称: 轮播图 值为:swiper;
         */
        String SWIPER = "swiper";
        /**
         * 字段名称: 分类 值为:category;
         */
        String CATEGORY = "category";
    }
}
