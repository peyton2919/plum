package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.GoodsBanner;

import java.util.List;

/**
 * <h3> 轮播图 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public interface GoodsBannerService {

    /**
     * <h4>根据商品ID 查找轮播图 最多返回10条数据</h4>
     * @param goodsId 商品ID
     * @return 轮播图 最多返回10条数据
     */
    List<GoodsBanner> findByGoodsId(Long goodsId);

}
