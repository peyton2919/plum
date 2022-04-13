package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 快递模板 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class Express implements Serializable {
	/**   */
	private Integer id;
	/** 运费模板名称  */
	private String name;
	/** 计费方式(0按件数 1按重量)  */
	private Integer type;
	/** 排序: 数值越大越靠前  */
	private Integer seq;

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
	 * @param name 运费模板名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 运费模板名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param type 计费方式(0按件数 1按重量) 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 计费方式(0按件数 1按重量) 
	 */ 
	public Integer getType(){
		return type;
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
