package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 优惠券会员(关联优惠券与会员) 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class CouponMember implements Serializable {
	/**   */
	private Long id;
	/** 优惠券id  */
	private Coupon coupon;
	/** 会员id  */
	private Member member;
	/** 创建时间  */
	private Date createTime;
	/** 更新时间  */
	private Date updateTime;
	/** 是否已使用 0未使用 1已使用  */
	private Integer used;
	/** 是否可用,1：可用;0:不可用;2:删除;  */
	private Integer status;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id  
	 */ 
	public void setId(Long id){
		this.id = id;
	}

	/** 
	 * @return  
	 */ 
	public Long getId(){
		return id;
	}

	/** 
	 * @param coupon 优惠券id 
	 */ 
	public void setCoupon(Coupon coupon){
		this.coupon = coupon;
	}

	/** 
	 * @return 优惠券id 
	 */ 
	public Coupon getCoupon(){
		return coupon;
	}

	/** 
	 * @param member 会员id 
	 */ 
	public void setMember(Member member){
		this.member = member;
	}

	/** 
	 * @return 会员id 
	 */ 
	public Member getMember(){
		return member;
	}

	/** 
	 * @param createTime 创建时间 
	 */ 
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	/** 
	 * @return 创建时间 
	 */ 
	public Date getCreateTime(){
		return createTime;
	}

	/** 
	 * @param updateTime 更新时间 
	 */ 
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	/** 
	 * @return 更新时间 
	 */ 
	public Date getUpdateTime(){
		return updateTime;
	}

	/** 
	 * @param used 是否已使用 0未使用 1已使用 
	 */ 
	public void setUsed(Integer used){
		this.used = used;
	}

	/** 
	 * @return 是否已使用 0未使用 1已使用 
	 */ 
	public Integer getUsed(){
		return used;
	}

	/** 
	 * @param status 是否可用,1：可用;0:不可用;2:删除; 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 是否可用,1：可用;0:不可用;2:删除; 
	 */ 
	public Integer getStatus(){
		return status;
	}

}
