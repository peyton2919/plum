package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 收藏信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:51:56
 * @version 1.0.0
 * </pre>
*/
public class Collect implements Serializable {
	/** 编号  */
	private Long id;
	/** 商品规则编号  */
	private Long goodsSkuId;
	/** 会员编号  */
	private Long memberId;
	/** 收藏状态 1为收藏,0不收藏,默认1  */
	private Integer status;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id 编号 
	 */ 
	public void setId(Long id){
		this.id = id;
	}

	/** 
	 * @return 编号 
	 */ 
	public Long getId(){
		return id;
	}

	/** 
	 * @param goodsSkuId 商品规则编号 
	 */ 
	public void setGoodsSkuId(Long goodsSkuId){
		this.goodsSkuId = goodsSkuId;
	}

	/** 
	 * @return 商品规则编号 
	 */ 
	public Long getGoodsSkuId(){
		return goodsSkuId;
	}

	/** 
	 * @param memberId 会员编号 
	 */ 
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	/** 
	 * @return 会员编号 
	 */ 
	public Long getMemberId(){
		return memberId;
	}

	/** 
	 * @param status 收藏状态 1为收藏,0不收藏,默认1 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 收藏状态 1为收藏,0不收藏,默认1 
	 */ 
	public Integer getStatus(){
		return status;
	}

}
