package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.mapper.SupportMapper;
import cn.peyton.plum.chatter.service.SupportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3>顶踩 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("supportService")
public class SupportServiceImpl implements SupportService {
	@Resource
	private SupportMapper supportMapper;

}
