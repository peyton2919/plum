package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.GoodsSku;

import java.util.List;

/**
 * <h3> 商品规格 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
 */
public interface GoodsSkuService {


    /**
     * <h4>根据商品ID 查找 商品规格对象</h4>
     * @param goodsId 商品ID
     * @return 商品规格对象集合
     */
    List<GoodsSku> findByGoodsId(Long goodsId);

}
