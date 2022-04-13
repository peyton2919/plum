package cn.peyton.plum.common.service.impl;

import cn.peyton.plum.common.mapper.SysLogMapper;
import cn.peyton.plum.common.service.SysLogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 日志信息 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:22:58
 * @version 1.0.0
 * </pre>
*/
@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {
	@Resource
	private SysLogMapper sysLogMapper;

}
