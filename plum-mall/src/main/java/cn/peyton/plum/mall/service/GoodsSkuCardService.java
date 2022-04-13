package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.GoodsSkuCard;

import java.util.List;

/**
 * <h3> 商品规格卡片 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public interface GoodsSkuCardService {

    /**
     * <h4>根据商品ID 查找商品规格</h4>
     * @param goodsId 商品规格卡ID
     * @return 商品规格
     */
    List<GoodsSkuCard> findByGoodsId(Long goodsId);
}
