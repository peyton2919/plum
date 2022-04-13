package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 分类Item 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class AppCategoryItem implements Serializable {
	/**   */
	private Long id;
	/** 名称  */
	private String name;
	/** 图片  */
	private String cover;
	/** 分类id  */
	private Category category;
	/** 商品ID  */
	private Long goodsId;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/**   */
	private Date createTime;
	/**   */
	private Date updateTime;

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
	 * @param name 名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param cover 图片 
	 */ 
	public void setCover(String cover){
		this.cover = cover;
	}

	/** 
	 * @return 图片 
	 */ 
	public String getCover(){
		return cover;
	}

	/** 
	 * @param category 分类id 
	 */ 
	public void setCategory(Category category){
		this.category = category;
	}

	/** 
	 * @return 分类id 
	 */ 
	public Category getCategory(){
		return category;
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

	/** 
	 * @param updateTime  
	 */ 
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	/** 
	 * @return  
	 */ 
	public Date getUpdateTime(){
		return updateTime;
	}

}
