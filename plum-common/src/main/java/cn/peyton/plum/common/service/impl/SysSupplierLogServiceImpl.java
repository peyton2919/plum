package cn.peyton.plum.common.service.impl;

import cn.peyton.plum.common.mapper.SysSupplierLogMapper;
import cn.peyton.plum.common.service.SysSupplierLogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 供应商日志 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 10:05:56
 * @version 1.0.0
 * </pre>
*/
@Service("sysSupplierLogService")
public class SysSupplierLogServiceImpl implements SysSupplierLogService {
	@Resource
	private SysSupplierLogMapper sysSupplierLogMapper;

}
