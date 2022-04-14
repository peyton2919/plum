package cn.peyton.plum.mall.pojo;

import cn.peyton.plum.core.utils.BigDecimalUtil;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 商品信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Goods implements Serializable {
	/**   */
	private Long id;
	/** 商品名称  */
	private String title;
	/** 分类id  */
	private Integer categoryId;
	/** 商品封面图  */
	private String cover;
	/** 平均评分  */
	private Float rating;
	/** 总销量  */
	private Integer saleCount;
	/** 评论数  */
	private Integer reviewCount;
	/** 最低sku价格  */
	private BigDecimal minSkuPrice;
	/** 最低原始价格  */
	private BigDecimal minPrice;
	/** 商品描述  */
	private String desc;
	/** 单位  */
	private String unit;
	/** 库存  */
	private Integer stock;
	/** 库存预警  */
	private Integer minStock;
	/** 是否审核 0审核中 1通过 2拒绝  */
	private Integer ischeck;
	/** 状态 0仓库1上架  */
	private Integer status;
	/** 库存显示 0隐藏 1显示  */
	private Integer stockDisplay;
	/** 运费模板id  */
	private Integer expressId;
	/** sku类型：0单一，1多规格  */
	private Integer skuType;
	/** 单一规格值  */
	private String skuValue;
	/** 商品详情  */
	private String content;
	/** 折扣设置  */
	private Float discount;
	/** 创建时间  */
	private Date createTime;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 品牌编号  */
	private Integer brandId;

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
	 * @param title 商品名称 
	 */ 
	public void setTitle(String title){
		this.title = title;
	}

	/** 
	 * @return 商品名称 
	 */ 
	public String getTitle(){
		return title;
	}

	/** 
	 * @param categoryId 分类id 
	 */ 
	public void setCategoryId(Integer categoryId){
		this.categoryId = categoryId;
	}

	/** 
	 * @return 分类id 
	 */ 
	public Integer getCategoryId(){
		return categoryId;
	}

	/** 
	 * @param cover 商品封面图 
	 */ 
	public void setCover(String cover){
		this.cover = cover;
	}

	/** 
	 * @return 商品封面图 
	 */ 
	public String getCover(){
		return cover;
	}

	/** 
	 * @param rating 平均评分 
	 */ 
	public void setRating(Float rating){
		this.rating = rating;
	}

	/** 
	 * @return 平均评分 
	 */ 
	public Float getRating(){
		return rating;
	}

	/** 
	 * @param saleCount 总销量 
	 */ 
	public void setSaleCount(Integer saleCount){
		this.saleCount = saleCount;
	}

	/** 
	 * @return 总销量 
	 */ 
	public Integer getSaleCount(){
		return saleCount;
	}

	/** 
	 * @param reviewCount 评论数 
	 */ 
	public void setReviewCount(Integer reviewCount){
		this.reviewCount = reviewCount;
	}

	/** 
	 * @return 评论数 
	 */ 
	public Integer getReviewCount(){
		return reviewCount;
	}

	/** 
	 * @param minSkuPrice 最低sku价格 
	 */ 
	public void setMinSkuPrice(BigDecimal minSkuPrice){
		this.minSkuPrice = minSkuPrice;
	}

	/** 
	 * @return 最低sku价格 
	 */ 
	public BigDecimal getMinSkuPrice(){

	    return BigDecimalUtil.format(this.minSkuPrice);
	}

	/** 
	 * @param minPrice 最低原始价格 
	 */ 
	public void setMinPrice(BigDecimal minPrice){
		this.minPrice = minPrice;
	}

	/** 
	 * @return 最低原始价格 
	 */ 
	public BigDecimal getMinPrice(){
		return BigDecimalUtil.format(minPrice);
	}

	/** 
	 * @param desc 商品描述 
	 */ 
	public void setDesc(String desc){
		this.desc = desc;
	}

	/** 
	 * @return 商品描述 
	 */ 
	public String getDesc(){
		return desc;
	}

	/** 
	 * @param unit 单位 
	 */ 
	public void setUnit(String unit){
		this.unit = unit;
	}

	/** 
	 * @return 单位 
	 */ 
	public String getUnit(){
		return unit;
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
	 * @param minStock 库存预警 
	 */ 
	public void setMinStock(Integer minStock){
		this.minStock = minStock;
	}

	/** 
	 * @return 库存预警 
	 */ 
	public Integer getMinStock(){
		return minStock;
	}

	/** 
	 * @param ischeck 是否审核 0审核中 1通过 2拒绝 
	 */ 
	public void setIscheck(Integer ischeck){
		this.ischeck = ischeck;
	}

	/** 
	 * @return 是否审核 0审核中 1通过 2拒绝 
	 */ 
	public Integer getIscheck(){
		return ischeck;
	}

	/** 
	 * @param status 状态 0仓库1上架 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态 0仓库1上架 
	 */ 
	public Integer getStatus(){
		return status;
	}

	/** 
	 * @param stockDisplay 库存显示 0隐藏 1显示 
	 */ 
	public void setStockDisplay(Integer stockDisplay){
		this.stockDisplay = stockDisplay;
	}

	/** 
	 * @return 库存显示 0隐藏 1显示 
	 */ 
	public Integer getStockDisplay(){
		return stockDisplay;
	}

	/** 
	 * @param expressId 运费模板id 
	 */ 
	public void setExpressId(Integer expressId){
		this.expressId = expressId;
	}

	/** 
	 * @return 运费模板id 
	 */ 
	public Integer getExpressId(){
		return expressId;
	}

	/** 
	 * @param skuType sku类型：0单一，1多规格 
	 */ 
	public void setSkuType(Integer skuType){
		this.skuType = skuType;
	}

	/** 
	 * @return sku类型：0单一，1多规格 
	 */ 
	public Integer getSkuType(){
		return skuType;
	}

	/** 
	 * @param skuValue 单一规格值 
	 */ 
	public void setSkuValue(String skuValue){
		this.skuValue = skuValue;
	}

	/** 
	 * @return 单一规格值 
	 */ 
	public String getSkuValue(){
		return skuValue;
	}

	/** 
	 * @param content 商品详情 
	 */ 
	public void setContent(String content){
		this.content = content;
	}

	/** 
	 * @return 商品详情 
	 */ 
	public String getContent(){
		return content;
	}

	/** 
	 * @param discount 折扣设置 
	 */ 
	public void setDiscount(Float discount){
		this.discount = discount;
	}

	/** 
	 * @return 折扣设置 
	 */ 
	public Float getDiscount(){
		return discount;
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
	 * @param seq 排序: 数值越大越靠前 
	 */ 
	public void setSeq(Integer seq){
		this.seq = seq;
	}

	/** 
	 * @return 排序: 数值越大越靠前 
	 */ 
	public Integer getSeq(){
		return seq;
	}

	/** 
	 * @param brandId 品牌编号 
	 */ 
	public void setBrandId(Integer brandId){
		this.brandId = brandId;
	}

	/** 
	 * @return 品牌编号 
	 */ 
	public Integer getBrandId(){
		return brandId;
	}

}
