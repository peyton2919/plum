package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.CouponMemberService;
import cn.peyton.plum.mall.mapper.CouponMemberMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 优惠券会员(关联优惠券与会员) Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
@Service("couponMemberService")
public class CouponMemberServiceImpl implements CouponMemberService {
	@Resource
	private CouponMemberMapper couponMemberMapper;

}
