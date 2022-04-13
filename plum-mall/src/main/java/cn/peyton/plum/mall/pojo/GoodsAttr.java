package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 商品属性 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public class GoodsAttr implements Serializable {
	/**   */
	private Long id;
	/** 商品id  */
	private Long goodsId;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 属性值  */
	private String value;
	/** 商品类型属性名称  */
	private String name;
	/** 描述默认  */
	private String explain;
	/** 表单类型  */
	private String type;

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
	public void setGoodsId (Long goodsId){
		this.goodsId = goodsId;
	}

	/** 
	 * @return 商品id 
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
	 * @param value 属性值 
	 */ 
	public void setValue(String value){
		this.value = value;
	}

	/** 
	 * @return 属性值 
	 */ 
	public String getValue(){
		return value;
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
	 * @param explain 描述默认 
	 */ 
	public void setExplain(String explain){
		this.explain = explain;
	}

	/** 
	 * @return 描述默认 
	 */ 
	public String getExplain(){
		return explain;
	}

	/** 
	 * @param type 表单类型 
	 */ 
	public void setType(String type){
		this.type = type;
	}

	/** 
	 * @return 表单类型 
	 */ 
	public String getType(){
		return type;
	}

}
