package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.GoodsSkuCardValue;

import java.util.List;

/**
 * <h3> 商品规格卡片值 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public interface GoodsSkuCardValueService {

    /**
     * <h4>根据商品规格卡ID 查找商品属性</h4>
     * @param goodsSkuCardId 商品规格卡ID
     * @return 商品规格卡
     */
    List<GoodsSkuCardValue> findByGoodsSkuCardId(Long goodsSkuCardId);

}
