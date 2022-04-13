package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 首页数据 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class AppIndexData implements Serializable {
	/**   */
	private Long id;
	/** 类型  */
	private String type;
	/** 数据集  */
	private String data;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/**   */
	private AppIndexCategory appIndexCategory;

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
	 * @param type 类型 
	 */ 
	public void setType(String type){
		this.type = type;
	}

	/** 
	 * @return 类型 
	 */ 
	public String getType(){
		return type;
	}

	/** 
	 * @param data 数据集 
	 */ 
	public void setData(String data){
		this.data = data;
	}

	/** 
	 * @return 数据集 
	 */ 
	public String getData(){
		return data;
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
	 * @param appIndexCategory  
	 */ 
	public void setAppIndexCategory(AppIndexCategory appIndexCategory){
		this.appIndexCategory = appIndexCategory;
	}

	/** 
	 * @return  
	 */ 
	public AppIndexCategory getAppIndexCategory(){
		return appIndexCategory;
	}

}
