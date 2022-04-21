package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.GoodsCardValueService;
import cn.peyton.plum.mall.mapper.GoodsCardValueMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 商品规格卡值关联 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/16 18:19:42
 * @version 1.0.0
 * </pre>
*/
@Service("goodsCardValueService")
public class GoodsCardValueServiceImpl implements GoodsCardValueService {
	@Resource
	private GoodsCardValueMapper goodsCardValueMapper;

}
