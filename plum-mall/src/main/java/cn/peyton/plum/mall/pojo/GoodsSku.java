package cn.peyton.plum.mall.pojo;

import java.math.BigDecimal;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * <h3> 商品规格 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public class GoodsSku implements Serializable {
	/**   */
	private Long id;
	/**   */
	private String image;
	/** 销售价  */
	private BigDecimal retailPrice;
	/** 市场价  */
	private BigDecimal marketPrice;
	/** 成本价  */
	private BigDecimal costPrice;
	/** 库存  */
	private Integer stock;
	/** 体积  */
	private Float volume;
	/** 体重  */
	private Float weight;
	/** 编码  */
	private String code;
	/** 商品ID  */
	private Goods goods;
	/** 商品规格组合: 对应sku的id组合  */
	private String skus;
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
	 * @param image  
	 */ 
	public void setImage(String image){
		this.image = image;
	}

	/** 
	 * @return  
	 */ 
	public String getImage(){
		return image;
	}

	/** 
	 * @param retailPrice 销售价 
	 */ 
	public void setRetailPrice(BigDecimal retailPrice){
		this.retailPrice = retailPrice;
	}

	/** 
	 * @return 销售价 
	 */ 
	public BigDecimal getRetailPrice(){
		return retailPrice;
	}

	/** 
	 * @param marketPrice 市场价 
	 */ 
	public void setMarketPrice(BigDecimal marketPrice){
		this.marketPrice = marketPrice;
	}

	/** 
	 * @return 市场价 
	 */ 
	public BigDecimal getMarketPrice(){
		return marketPrice;
	}

	/** 
	 * @param costPrice 成本价 
	 */ 
	public void setCostPrice(BigDecimal costPrice){
		this.costPrice = costPrice;
	}

	/** 
	 * @return 成本价 
	 */ 
	public BigDecimal getCostPrice(){
		return costPrice;
	}

	/** 
	 * @param stock 库存 
	 */ 
	public void setStock(Integer stock){
		this.stock = stock;
	}

	/** 
	 * @return 库存 
	 */ 
	public Integer getStock(){
		return stock;
	}

	/** 
	 * @param volume 体积 
	 */ 
	public void setVolume(Float volume){
		this.volume = volume;
	}

	/** 
	 * @return 体积 
	 */ 
	public Float getVolume(){
		return volume;
	}

	/** 
	 * @param weight 体重 
	 */ 
	public void setWeight(Float weight){
		this.weight = weight;
	}

	/** 
	 * @return 体重 
	 */ 
	public Float getWeight(){
		return weight;
	}

	/** 
	 * @param code 编码 
	 */ 
	public void setCode(String code){
		this.code = code;
	}

	/** 
	 * @return 编码 
	 */ 
	public String getCode(){
		return code;
	}

	/** 
	 * @param goods 商品ID 
	 */ 
	public void setGoods(Goods goods){
		this.goods = goods;
	}

	/** 
	 * @return 商品ID 
	 */ 
	public Goods getGoods(){
		return goods;
	}

	/** 
	 * @param skus 商品规格组合: 对应sku的id组合 
	 */ 
	public void setSkus(String skus){
		this.skus = skus;
	}

	/** 
	 * @return 商品规格组合: 对应sku的id组合 
	 */ 
	public String getSkus(){
		return skus;
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
