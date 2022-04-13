package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.SysSettingService;
import cn.peyton.plum.mall.mapper.SysSettingMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 系统设置 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("sysSettingService")
public class SysSettingServiceImpl implements SysSettingService {
	@Resource
	private SysSettingMapper sysSettingMapper;

}
