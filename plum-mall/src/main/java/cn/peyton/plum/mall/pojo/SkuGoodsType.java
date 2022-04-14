package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 规格商品类型 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 20:36:28
 * @version 1.0.0
 * </pre>
*/
public class SkuGoodsType implements Serializable {
	/**   */
	private Long id;
	/** 商品规格ID  */
	private Integer skuId;
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
	 * @param skuId 商品规格ID 
	 */ 
	public void setSkuId(Integer skuId){
		this.skuId = skuId;
	}

	/** 
	 * @return 商品规格ID 
	 */ 
	public Integer getSkuId(){
		return skuId;
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
