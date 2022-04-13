package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.RoleRuleService;
import cn.peyton.plum.mall.mapper.RoleRuleMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 角色规则(关联角色与规则) Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("roleRuleService")
public class RoleRuleServiceImpl implements RoleRuleService {
	@Resource
	private RoleRuleMapper roleRuleMapper;

}
