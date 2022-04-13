package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.OrderItemService;
import cn.peyton.plum.mall.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 订单项 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {
	@Resource
	private OrderItemMapper orderItemMapper;

}
