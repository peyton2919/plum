package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.GoodsComment;

import java.util.List;

/**
 * <h3> 商品评论 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
public interface GoodsCommentService {


    /**
     * <h4>根据商品ID 查找 商品评论集合</h4>
     * @param goodsId 商品ID
     * @return 商品评论集合
     */
    List<GoodsComment> findByGoodsId(Long goodsId);
}
