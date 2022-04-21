package cn.peyton.plum.mall.service;

import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.pojo.GoodsSkuCard;
import cn.peyton.plum.mall.vo.GoodsHotVo;

import java.util.List;

/**
 * <h3> 商品信息 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public interface GoodsService {

    /**
     * <h4>查找热门商品对象集合</h4>
     * @param categoryId categoryId >0 时,表示 查找条件含 分类ID
     * @param page 分页对象
     * @return
     */
    List<GoodsHotVo> findByHot(Integer categoryId, PageQuery page);

    /**
     * <h4>查找热门商品对象集合{随机获取前几条}</h4>
     * @param categoryId categoryId categoryId >0 时,表示 查找条件含 分类ID
     * @param row 需要返回的条数
     * @return 品对象集合
     */
    List<GoodsHotVo> findByHotAndRandTopNumber(Integer categoryId,Integer row);

    /**
     * <h4>根据Id根据对象</h4>
     * @param id
     * @return
     */
    Goods findById(Long id);

    /**
     * <h4>关联查找 根据商品ID 找 商品规格</h4>
     * @param goodsId 商品ID
     * @return 商品规格集合
     */
    List<GoodsSkuCard> findJoinByGoodsId(Long goodsId);


    /**
     * <h4>根据商品ID 查找 好评数和平均分</h4>
     * @param id 商品ID
     * @return 好评数量{reviewCount}和平均分{rating}
     */
    Goods findCommentGoodRateAndTotalById(Long id);

    /**
     * <h4>多条件查找</h4>
     * @param keyword 关键字
     * @param type 类型: all综合; sale 销量; price 价格;
     * @param order 排序: 默认asc 升序 asc; 降序 desc;
     * @param page 分页对象
     * @return 商品集合
     */
    List<GoodsHotVo> findByMulti(String keyword,String type,String order,PageQuery page);
}
