package cn.peyton.plum.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 订单 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Order implements Serializable {
	/**   */
	private Long id;
	/** 使用优惠券id  */
	private Integer couponMemberId;
	/** 用户id  */
	private Member member;
	/** 订单唯一流水号  */
	private String no;
	/** 收货地址  */
	private String address;
	/** 订单总价格  */
	private BigDecimal totalPrice;
	/** 备注  */
	private String remark;
	/** 支付时间  */
	private Date paidTime;
	/** 支付方式  */
	private String paymentMethod;
	/** 支付平台订单号  */
	private String paymentNo;
	/** 退款状态  */
	private String refundStatus;
	/** 退款单号  */
	private String refundNo;
	/** 是否关闭  */
	private Integer closed;
	/** 物流状态  */
	private String shipStatus;
	/** 物流数据  */
	private String shipData;
	/** 额外数据  */
	private String extra;
	/** 创建时间  */
	private Date createTime;
	/** 是否已评价  */
	private Integer reviewed;
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
	 * @param couponMemberId 使用优惠券id 
	 */ 
	public void setCouponMemberId(Integer couponMemberId){
		this.couponMemberId = couponMemberId;
	}

	/** 
	 * @return 使用优惠券id 
	 */ 
	public Integer getCouponMemberId(){
		return couponMemberId;
	}

	/** 
	 * @param member 用户id 
	 */ 
	public void setMember(Member member){
		this.member = member;
	}

	/** 
	 * @return 用户id 
	 */ 
	public Member getMember(){
		return member;
	}

	/** 
	 * @param no 订单唯一流水号 
	 */ 
	public void setNo(String no){
		this.no = no;
	}

	/** 
	 * @return 订单唯一流水号 
	 */ 
	public String getNo(){
		return no;
	}

	/** 
	 * @param address 收货地址 
	 */ 
	public void setAddress(String address){
		this.address = address;
	}

	/** 
	 * @return 收货地址 
	 */ 
	public String getAddress(){
		return address;
	}

	/** 
	 * @param totalPrice 订单总价格 
	 */ 
	public void setTotalPrice(BigDecimal totalPrice){
		this.totalPrice = totalPrice;
	}

	/** 
	 * @return 订单总价格 
	 */ 
	public BigDecimal getTotalPrice(){
		return totalPrice;
	}

	/** 
	 * @param remark 备注 
	 */ 
	public void setRemark(String remark){
		this.remark = remark;
	}

	/** 
	 * @return 备注 
	 */ 
	public String getRemark(){
		return remark;
	}

	/** 
	 * @param paidTime 支付时间 
	 */ 
	public void setPaidTime(Date paidTime){
		this.paidTime = paidTime;
	}

	/** 
	 * @return 支付时间 
	 */ 
	public Date getPaidTime(){
		return paidTime;
	}

	/** 
	 * @param paymentMethod 支付方式 
	 */ 
	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	/** 
	 * @return 支付方式 
	 */ 
	public String getPaymentMethod(){
		return paymentMethod;
	}

	/** 
	 * @param paymentNo 支付平台订单号 
	 */ 
	public void setPaymentNo(String paymentNo){
		this.paymentNo = paymentNo;
	}

	/** 
	 * @return 支付平台订单号 
	 */ 
	public String getPaymentNo(){
		return paymentNo;
	}

	/** 
	 * @param refundStatus 退款状态 
	 */ 
	public void setRefundStatus(String refundStatus){
		this.refundStatus = refundStatus;
	}

	/** 
	 * @return 退款状态 
	 */ 
	public String getRefundStatus(){
		return refundStatus;
	}

	/** 
	 * @param refundNo 退款单号 
	 */ 
	public void setRefundNo(String refundNo){
		this.refundNo = refundNo;
	}

	/** 
	 * @return 退款单号 
	 */ 
	public String getRefundNo(){
		return refundNo;
	}

	/** 
	 * @param closed 是否关闭 
	 */ 
	public void setClosed(Integer closed){
		this.closed = closed;
	}

	/** 
	 * @return 是否关闭 
	 */ 
	public Integer getClosed(){
		return closed;
	}

	/** 
	 * @param shipStatus 物流状态 
	 */ 
	public void setShipStatus(String shipStatus){
		this.shipStatus = shipStatus;
	}

	/** 
	 * @return 物流状态 
	 */ 
	public String getShipStatus(){
		return shipStatus;
	}

	/** 
	 * @param shipData 物流数据 
	 */ 
	public void setShipData(String shipData){
		this.shipData = shipData;
	}

	/** 
	 * @return 物流数据 
	 */ 
	public String getShipData(){
		return shipData;
	}

	/** 
	 * @param extra 额外数据 
	 */ 
	public void setExtra(String extra){
		this.extra = extra;
	}

	/** 
	 * @return 额外数据 
	 */ 
	public String getExtra(){
		return extra;
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
	 * @param reviewed 是否已评价 
	 */ 
	public void setReviewed(Integer reviewed){
		this.reviewed = reviewed;
	}

	/** 
	 * @return 是否已评价 
	 */ 
	public Integer getReviewed(){
		return reviewed;
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
