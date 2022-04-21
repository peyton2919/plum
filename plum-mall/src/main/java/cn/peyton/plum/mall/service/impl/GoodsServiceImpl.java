package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.mall.mapper.GoodsSkuCardMapper;
import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.pojo.GoodsSkuCard;
import cn.peyton.plum.mall.service.GoodsService;
import cn.peyton.plum.mall.mapper.GoodsMapper;
import cn.peyton.plum.mall.vo.GoodsHotVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 商品信息 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	@Resource
    GoodsSkuCardMapper goodsSkuCardMapper;

    @Override
    public List<GoodsHotVo> findByHot(Integer categoryId, PageQuery page) {
        return goodsMapper.findByHot(categoryId,page);
    }

    @Override
    public List<GoodsHotVo> findByHotAndRandTopNumber(Integer categoryId, Integer row) {
        return goodsMapper.findByHotAndRandTopNumber(categoryId,row);
    }

    @Override
    public Goods findById(Long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsSkuCard> findJoinByGoodsId(Long goodsId) {
        return goodsSkuCardMapper.findByGoodsId(goodsId);
    }

    @Override
    public Goods findCommentGoodRateAndTotalById(Long id) {
        return goodsMapper.findCommentGoodRateAndTotalById(id);
    }

    @Override
    public List<GoodsHotVo> findByMulti(String keyword, String type, String order, PageQuery page) {
        return goodsMapper.findByMulti(keyword,type,order,page);
    }
}
