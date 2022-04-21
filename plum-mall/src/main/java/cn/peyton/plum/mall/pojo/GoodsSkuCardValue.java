package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 商品规格卡片值 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public class GoodsSkuCardValue implements Serializable {
	/**   */
	private Long id;
	/** 值  */
	private String name;
	/** 扩展值  */
	private String value;
	/** 排序: 数值越大越靠前  */
	private Integer seq;

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
	 * @param name 值 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 值 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param value 扩展值 
	 */ 
	public void setValue(String value){
		this.value = value;
	}

	/** 
	 * @return 扩展值 
	 */ 
	public String getValue(){
		return value;
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

}
