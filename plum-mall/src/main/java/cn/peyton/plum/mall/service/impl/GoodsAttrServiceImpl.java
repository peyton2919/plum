package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.GoodsAttr;
import cn.peyton.plum.mall.service.GoodsAttrService;
import cn.peyton.plum.mall.mapper.GoodsAttrMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 商品属性 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
@Service("goodsAttrService")
public class GoodsAttrServiceImpl implements GoodsAttrService {
	@Resource
	private GoodsAttrMapper goodsAttrMapper;

    @Override
    public List<GoodsAttr> findByGoodsId(Long goodsId) {
        return goodsAttrMapper.findByGoodsId(goodsId);
    }
}
