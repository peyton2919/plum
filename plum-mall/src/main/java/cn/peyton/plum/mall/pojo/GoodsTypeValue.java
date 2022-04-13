package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 商品类型值 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class GoodsTypeValue implements Serializable {
	/**   */
	private Integer id;
	/** 商品类型属性名称  */
	private String name;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 表单类型:0:无,1:input,2:radio,3:checkbox  */
	private Integer type;
	/** 状态：0禁止1开启  */
	private Integer status;
	/** 默认值/选项值  */
	private String explain;
	/** 商品类型id  */
	private Integer goodsTypeId;

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
	 * @param name 商品类型属性名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 商品类型属性名称 
	 */ 
	public String getName(){
		return name;
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
	 * @param type 表单类型:0:无,1:input,2:radio,3:checkbox 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 表单类型:0:无,1:input,2:radio,3:checkbox 
	 */ 
	public Integer getType(){
		return type;
	}

	/** 
	 * @param status 状态：0禁止1开启 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态：0禁止1开启 
	 */ 
	public Integer getStatus(){
		return status;
	}

	/** 
	 * @param explain 默认值/选项值 
	 */ 
	public void setExplain(String explain){
		this.explain = explain;
	}

	/** 
	 * @return 默认值/选项值 
	 */ 
	public String getExplain(){
		return explain;
	}

	/** 
	 * @param goodsTypeId 商品类型id 
	 */ 
	public void setGoodsTypeId(Integer goodsTypeId){
		this.goodsTypeId = goodsTypeId;
	}

	/** 
	 * @return 商品类型id 
	 */ 
	public Integer getGoodsTypeId(){
		return goodsTypeId;
	}

}
