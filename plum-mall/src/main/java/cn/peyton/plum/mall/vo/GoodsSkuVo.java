package cn.peyton.plum.mall.vo;

import cn.peyton.plum.mall.pojo.GoodsSkuCard;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <h3>商品规格视图类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mall.vo.GoodsSkuVo.java
 * @create date: 2022-04-13 20:56
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class GoodsSkuVo implements Serializable {

    /**   */
    private Long id;
    /**   */
    private String image;
    /** 销售价  */
    private String retailPrice;
    /** 市场价  */
    private String marketPrice;
    /** 成本价  */
    private String costPrice;

    /** 库存  */
    private Integer stock;
    /** 体重  */
    private Float weight;
    /** 编码  */
    private String code;

    /** 体积  */
    private Float volume;
    /**   */
    private Long goodsId;

    private List<GoodsSkuCard> skus;
}
