package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 购物车 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class Cart implements Serializable {
	/**   */
	private Long id;
	/** 用户id  */
	private Member member;
	/** 商品id/商品规则id  */
	private Long shopId;
	/** 规格类型 0单规格 1多规格  */
	private Integer skusType;
	/** 数量  */
	private Integer num;
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
	 * @param shopId 商品id/商品规则id 
	 */ 
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	/** 
	 * @return 商品id/商品规则id 
	 */ 
	public Long getShopId(){
		return shopId;
	}

	/** 
	 * @param skusType 规格类型 0单规格 1多规格 
	 */ 
	public void setSkusType(Integer skusType){
		this.skusType = skusType;
	}

	/** 
	 * @return 规格类型 0单规格 1多规格 
	 */ 
	public Integer getSkusType(){
		return skusType;
	}

	/** 
	 * @param num 数量 
	 */ 
	public void setNum(Integer num){
		this.num = num;
	}

	/** 
	 * @return 数量 
	 */ 
	public Integer getNum(){
		return num;
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
