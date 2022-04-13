package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 规格商品类型 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class SkusGoodsType implements Serializable {
	/**   */
	private Long id;
	/** 商品规格ID  */
	private Integer skusId;
	/** 商品类型ID  */
	private Integer goodsTypeId;

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
	 * @param skusId 商品规格ID 
	 */ 
	public void setSkusId(Integer skusId){
		this.skusId = skusId;
	}

	/** 
	 * @return 商品规格ID 
	 */ 
	public Integer getSkusId(){
		return skusId;
	}

	/** 
	 * @param goodsTypeId 商品类型ID 
	 */ 
	public void setGoodsTypeId(Integer goodsTypeId){
		this.goodsTypeId = goodsTypeId;
	}

	/** 
	 * @return 商品类型ID 
	 */ 
	public Integer getGoodsTypeId(){
		return goodsTypeId;
	}

}
