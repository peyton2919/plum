package cn.peyton.plum.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 订单项 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/15 00:09:56
 * @version 1.0.0
 * </pre>
*/
public class OrderItem implements Serializable {
	/**   */
	private Long id;
	/** 订单id  */
	private Order order;
	/** goods.skuType: 为0:商品ID,为1:商品规则ID  */
	private Long shopId;
	/** 商品ID  */
	private Long goodsId;
	/** 购买数量  */
	private Integer num;
	/** 购买价格  */
	private BigDecimal price;
	/** 评分  */
	private Integer rating;
	/** 评价  */
	private String review;
	/** 规格类型 0单规格 1多规格  */
	private Integer skuType;
	/** 商品数量  */
	private Integer goodsNum;
	/** 评价时间  */
	private Date reviewTime;
	/** 客服回复评论  */
	private String extra;
	/** 是否可用,1：可用;0:不可用;2:删除;  */
	private Integer status;
	/**   */
	private Date createTime;

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
	 * @param order 订单id 
	 */ 
	public void setOrder(Order order){
		this.order = order;
	}

	/** 
	 * @return 订单id 
	 */ 
	public Order getOrder(){
		return order;
	}

	/** 
	 * @param shopId goods.skuType: 为0:商品ID,为1:商品规则ID 
	 */ 
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	/** 
	 * @return goods.skuType: 为0:商品ID,为1:商品规则ID 
	 */ 
	public Long getShopId(){
		return shopId;
	}

	/** 
	 * @param goodsId 商品ID 
	 */ 
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}

	/** 
	 * @return 商品ID 
	 */ 
	public Long getGoodsId(){
		return goodsId;
	}

	/** 
	 * @param num 购买数量 
	 */ 
	public void setNum(Integer num){
		this.num = num;
	}

	/** 
	 * @return 购买数量 
	 */ 
	public Integer getNum(){
		return num;
	}

	/** 
	 * @param price 购买价格 
	 */ 
	public void setPrice(BigDecimal price){
		this.price = price;
	}

	/** 
	 * @return 购买价格 
	 */ 
	public BigDecimal getPrice(){
		return price;
	}

	/** 
	 * @param rating 评分 
	 */ 
	public void setRating(Integer rating){
		this.rating = rating;
	}

	/** 
	 * @return 评分 
	 */ 
	public Integer getRating(){
		return rating;
	}

	/** 
	 * @param review 评价 
	 */ 
	public void setReview(String review){
		this.review = review;
	}

	/** 
	 * @return 评价 
	 */ 
	public String getReview(){
		return review;
	}

	/** 
	 * @param skuType 规格类型 0单规格 1多规格 
	 */ 
	public void setSkuType(Integer skuType){
		this.skuType = skuType;
	}

	/** 
	 * @return 规格类型 0单规格 1多规格 
	 */ 
	public Integer getSkuType(){
		return skuType;
	}

	/** 
	 * @param goodsNum 商品数量 
	 */ 
	public void setGoodsNum(Integer goodsNum){
		this.goodsNum = goodsNum;
	}

	/** 
	 * @return 商品数量 
	 */ 
	public Integer getGoodsNum(){
		return goodsNum;
	}

	/** 
	 * @param reviewTime 评价时间 
	 */ 
	public void setReviewTime(Date reviewTime){
		this.reviewTime = reviewTime;
	}

	/** 
	 * @return 评价时间 
	 */ 
	public Date getReviewTime(){
		return reviewTime;
	}

	/** 
	 * @param extra 客服回复评论 
	 */ 
	public void setExtra(String extra){
		this.extra = extra;
	}

	/** 
	 * @return 客服回复评论 
	 */ 
	public String getExtra(){
		return extra;
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

	/** 
	 * @param createTime  
	 */ 
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	/** 
	 * @return  
	 */ 
	public Date getCreateTime(){
		return createTime;
	}

}
