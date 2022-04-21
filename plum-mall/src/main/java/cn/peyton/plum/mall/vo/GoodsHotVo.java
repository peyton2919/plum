package cn.peyton.plum.mall.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <h3>热门商品视图类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mall.vo.GoodsHotVo.java
 * @create date: 2022-04-12 18:18
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class GoodsHotVo implements Serializable {

    /**   */
    private Long id;
    /** 商品名称  */
    private String title;
    /** 商品封面图  */
    private String cover;
    /** 最低sku价格  */
    private String minSkuPrice;
    /** 最低原始价格  */
    private String minPrice;
    /** 商品描述  */
    private String desc;
    /** 平均评分  */
    private Float rating;
    /** 评论数  */
    private Integer reviewCount;

    /**
     * @param id
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * @return
     */
    public Long getId(){
        return id;
    }

    /**
     * @param title 商品名称
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * @return 商品名称
     */
    public String getTitle(){
        return title;
    }
    /**
     * @param cover 商品封面图
     */
    public void setCover(String cover){
        this.cover = cover;
    }

    /**
     * @return 商品封面图
     */
    public String getCover(){
        return cover;
    }
    /**
     * @param minSkuPrice 最低sku价格
     */
    public void setMinSkuPrice(String minSkuPrice){
        this.minSkuPrice = minSkuPrice;
    }

    /**
     * @return 最低sku价格
     */
    public String getMinSkuPrice(){
        return minSkuPrice;
    }

    /**
     * @param minPrice 最低原始价格
     */
    public void setMinPrice(String minPrice){
        this.minPrice = minPrice;
    }

    /**
     * @return 最低原始价格
     */
    public String getMinPrice(){
        return minPrice;
    }

    /**
     * @param desc 商品描述
     */
    public void setDesc(String desc){
        this.desc = desc;
    }

    /**
     * @return 商品描述
     */
    public String getDesc(){
        return desc;
    }
    /**
     * @param rating 平均评分
     */
    public void setRating(Float rating){
        this.rating = rating;
    }

    /**
     * @return 平均评分
     */
    public Float getRating(){
        return rating;
    }

    /**
     * @param reviewCount 评论数
     */
    public void setReviewCount(Integer reviewCount){
        this.reviewCount = reviewCount;
    }

    /**
     * @return 评论数
     */
    public Integer getReviewCount(){
        return reviewCount;
    }
}
