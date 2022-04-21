package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 商品规格卡值关联 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/16 18:19:42
 * @version 1.0.0
 * </pre>
*/
public class GoodsCardValue implements Serializable {
	/**   */
	private Long id;
	/** 商品id  */
	private Long goodsId;
	/** 商品规格卡id  */
	private Long goodsSkuCardId;
	/** 商品规格卡值id  */
	private Long goodsSkuCardValueId;

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
	 * @param goodsId 商品id 
	 */ 
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}

	/** 
	 * @return 商品id 
	 */ 
	public Long getGoodsId(){
		return goodsId;
	}

	/** 
	 * @param goodsSkuCardId 商品规格卡id 
	 */ 
	public void setGoodsSkuCardId(Long goodsSkuCardId){
		this.goodsSkuCardId = goodsSkuCardId;
	}

	/** 
	 * @return 商品规格卡id 
	 */ 
	public Long getGoodsSkuCardId(){
		return goodsSkuCardId;
	}

	/** 
	 * @param goodsSkuCardValueId 商品规格卡值id 
	 */ 
	public void setGoodsSkuCardValueId(Long goodsSkuCardValueId){
		this.goodsSkuCardValueId = goodsSkuCardValueId;
	}

	/** 
	 * @return 商品规格卡值id 
	 */ 
	public Long getGoodsSkuCardValueId(){
		return goodsSkuCardValueId;
	}

}
