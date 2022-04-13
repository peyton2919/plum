package cn.peyton.plum.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 快递费用 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class ExpressValue implements Serializable {
	/**   */
	private Integer id;
	/** 配送模板id  */
	private Integer expressId;
	/** 可配送区域  */
	private String region;
	/** 首件(个)/首重(Kg)  */
	private Double first;
	/** 运费(元)  */
	private BigDecimal firstPrice;
	/** 续件/续重  */
	private Double add;
	/** 续费(元)  */
	private BigDecimal addPrice;
	/** 创建时间  */
	private Date createTime;

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
	 * @param expressId 配送模板id 
	 */ 
	public void setExpressId(Integer expressId){
		this.expressId = expressId;
	}

	/** 
	 * @return 配送模板id 
	 */ 
	public Integer getExpressId(){
		return expressId;
	}

	/** 
	 * @param region 可配送区域 
	 */ 
	public void setRegion(String region){
		this.region = region;
	}

	/** 
	 * @return 可配送区域 
	 */ 
	public String getRegion(){
		return region;
	}

	/** 
	 * @param first 首件(个)/首重(Kg) 
	 */ 
	public void setFirst(Double first){
		this.first = first;
	}

	/** 
	 * @return 首件(个)/首重(Kg) 
	 */ 
	public Double getFirst(){
		return first;
	}

	/** 
	 * @param firstPrice 运费(元) 
	 */ 
	public void setFirstPrice(BigDecimal firstPrice){
		this.firstPrice = firstPrice;
	}

	/** 
	 * @return 运费(元) 
	 */ 
	public BigDecimal getFirstPrice(){
		return firstPrice;
	}

	/** 
	 * @param add 续件/续重 
	 */ 
	public void setAdd(Double add){
		this.add = add;
	}

	/** 
	 * @return 续件/续重 
	 */ 
	public Double getAdd(){
		return add;
	}

	/** 
	 * @param addPrice 续费(元) 
	 */ 
	public void setAddPrice(BigDecimal addPrice){
		this.addPrice = addPrice;
	}

	/** 
	 * @return 续费(元) 
	 */ 
	public BigDecimal getAddPrice(){
		return addPrice;
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

}
