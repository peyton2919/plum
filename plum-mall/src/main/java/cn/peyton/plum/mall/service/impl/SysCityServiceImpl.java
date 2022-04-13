package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.SysCityService;
import cn.peyton.plum.mall.mapper.SysCityMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 城市 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("sysCityService")
public class SysCityServiceImpl implements SysCityService {
	@Resource
	private SysCityMapper sysCityMapper;

}
