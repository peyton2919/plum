package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.OrderService;
import cn.peyton.plum.mall.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 订单 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderMapper orderMapper;

}
