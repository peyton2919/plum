package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.GoodsSkuCard;
import cn.peyton.plum.mall.service.GoodsSkuCardService;
import cn.peyton.plum.mall.mapper.GoodsSkuCardMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 商品规格卡片 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
@Service("goodsSkuCardService")
public class GoodsSkuCardServiceImpl implements GoodsSkuCardService {
	@Resource
	private GoodsSkuCardMapper goodsSkuCardMapper;

    @Override
    public List<GoodsSkuCard> findByGoodsId(Long goodsId) {
        return goodsSkuCardMapper.findByGoodsId(goodsId);
    }
}
