package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.ExpressValueService;
import cn.peyton.plum.mall.mapper.ExpressValueMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 快递费用 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("expressValueService")
public class ExpressValueServiceImpl implements ExpressValueService {
	@Resource
	private ExpressValueMapper expressValueMapper;

}
