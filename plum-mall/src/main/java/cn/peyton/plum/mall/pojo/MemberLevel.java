package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 会员等级 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class MemberLevel implements Serializable {
	/**   */
	private Integer id;
	/** 等级名称  */
	private String name;
	/** 等级权重  */
	private Integer level;
	/** 状态：0禁用1启用2删除  */
	private Integer status;
	/** 折扣  */
	private Integer discount;
	/** 消费满元  */
	private Integer maxPrice;
	/** 消费满次数  */
	private Integer maxTimes;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id  
	 */ 
	public void setId(Integer id){
		this.id = id;
	}

	/** 
	 * @return  
	 */ 
	public Integer getId(){
		return id;
	}

	/** 
	 * @param name 等级名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 等级名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param level 等级权重 
	 */ 
	public void setLevel(Integer level){
		this.level = level;
	}

	/** 
	 * @return 等级权重 
	 */ 
	public Integer getLevel(){
		return level;
	}

	/** 
	 * @param status 状态：0禁用1启用2删除 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态：0禁用1启用2删除 
	 */ 
	public Integer getStatus(){
		return status;
	}

	/** 
	 * @param discount 折扣 
	 */ 
	public void setDiscount(Integer discount){
		this.discount = discount;
	}

	/** 
	 * @return 折扣 
	 */ 
	public Integer getDiscount(){
		return discount;
	}

	/** 
	 * @param maxPrice 消费满元 
	 */ 
	public void setMaxPrice(Integer maxPrice){
		this.maxPrice = maxPrice;
	}

	/** 
	 * @return 消费满元 
	 */ 
	public Integer getMaxPrice(){
		return maxPrice;
	}

	/** 
	 * @param maxTimes 消费满次数 
	 */ 
	public void setMaxTimes(Integer maxTimes){
		this.maxTimes = maxTimes;
	}

	/** 
	 * @return 消费满次数 
	 */ 
	public Integer getMaxTimes(){
		return maxTimes;
	}

}
