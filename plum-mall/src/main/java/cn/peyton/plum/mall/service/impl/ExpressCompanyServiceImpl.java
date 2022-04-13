package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.ExpressCompanyService;
import cn.peyton.plum.mall.mapper.ExpressCompanyMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 快递公司 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
@Service("expressCompanyService")
public class ExpressCompanyServiceImpl implements ExpressCompanyService {
	@Resource
	private ExpressCompanyMapper expressCompanyMapper;

}
