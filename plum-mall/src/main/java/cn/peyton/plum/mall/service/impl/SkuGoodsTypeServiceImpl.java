package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.SkuGoodsTypeService;
import cn.peyton.plum.mall.mapper.SkuGoodsTypeMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 规格商品类型 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 20:36:28
 * @version 1.0.0
 * </pre>
*/
@Service("skuGoodsTypeService")
public class SkuGoodsTypeServiceImpl implements SkuGoodsTypeService {
	@Resource
	private SkuGoodsTypeMapper skuGoodsTypeMapper;

}
