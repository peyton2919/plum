package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 轮播图 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class GoodsBanner implements Serializable {
	/**   */
	private Long id;
	/** 商品ID  */
	private Long goodsId;
	/** 链接地址  */
	private String url;
	/** 创建时间  */
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
	 * @param url 链接地址 
	 */ 
	public void setUrl(String url){
		this.url = url;
	}

	/** 
	 * @return 链接地址 
	 */ 
	public String getUrl(){
		return url;
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
