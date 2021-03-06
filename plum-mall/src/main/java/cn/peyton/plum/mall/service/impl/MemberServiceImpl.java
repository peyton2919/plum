package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.MemberService;
import cn.peyton.plum.mall.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 会员 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 20:51:50
 * @version 1.0.0
 * </pre>
*/
@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Resource
	private MemberMapper memberMapper;

}
