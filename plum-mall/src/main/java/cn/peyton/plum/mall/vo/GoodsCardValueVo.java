package cn.peyton.plum.mall.vo;

import cn.peyton.plum.mall.pojo.GoodsSkuCard;

import java.io.Serializable;
import java.util.List;

/**
 * <h3>商品规格卡值关联 视图类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mall.vo.goodsCardValueVO.java
 * @create date: 2022-04-16 18:21
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class GoodsCardValueVo implements Serializable {
    /**   */
    private Long id;
    /** 商品id  */
    private Long goodsId;
    /** 商品规格卡ID */
    private Long goodsSkuCardId;
    /** 商品规格卡 对象 */
    private List<GoodsSkuCard> goodsSkuCards;

    /**
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return 商品id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId 商品id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * @return 商品规格卡ID
     */
    public Long getGoodsSkuCardId() {
        return goodsSkuCardId;
    }

    /**
     * @param goodsSkuCardId 商品规格卡ID
     */
    public void setGoodsSkuCardId(Long goodsSkuCardId) {
        this.goodsSkuCardId = goodsSkuCardId;
    }

    /**
     * @return 商品规格卡 对象
     */
    public List<GoodsSkuCard> getGoodsSkuCards() {
        return goodsSkuCards;
    }

    /**
     * @param goodsSkuCards 商品规格卡 对象
     */
    public void setGoodsSkuCards(List<GoodsSkuCard> goodsSkuCards) {
        this.goodsSkuCards = goodsSkuCards;
    }
}
