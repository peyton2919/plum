package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.GoodsSkuCardValue;
import cn.peyton.plum.mall.service.GoodsSkuCardValueService;
import cn.peyton.plum.mall.mapper.GoodsSkuCardValueMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 商品规格卡片值 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
@Service("goodsSkuCardValueService")
public class GoodsSkuCardValueServiceImpl implements GoodsSkuCardValueService {
	@Resource
	private GoodsSkuCardValueMapper goodsSkuCardValueMapper;

    @Override
    public List<GoodsSkuCardValue> findByGoodsSkuCardId(Long goodsSkuCardId) {
        return goodsSkuCardValueMapper.findByGoodsSkuCardId(goodsSkuCardId);
    }
}
