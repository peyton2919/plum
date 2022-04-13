package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.CartService;
import cn.peyton.plum.mall.mapper.CartMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 购物车 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
@Service("cartService")
public class CartServiceImpl implements CartService {
	@Resource
	private CartMapper cartMapper;

}
