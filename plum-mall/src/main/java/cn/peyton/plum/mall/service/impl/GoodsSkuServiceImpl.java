package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.mapper.GoodsSkuMapper;
import cn.peyton.plum.mall.service.GoodsSkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3> 商品规格 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
@Service("goodsSkuService")
public class GoodsSkuServiceImpl implements GoodsSkuService {
	@Resource
	private GoodsSkuMapper goodsSkuMapper;

}
