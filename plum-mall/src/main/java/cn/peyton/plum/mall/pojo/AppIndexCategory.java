package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 首页分类 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class AppIndexCategory implements Serializable {
	/**   */
	private Long id;
	/** 名称  */
	private String name;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 模板  */
	private String template;

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
	 * @param template 模板 
	 */ 
	public void setTemplate(String template){
		this.template = template;
	}

	/** 
	 * @return 模板 
	 */ 
	public String getTemplate(){
		return template;
	}

}
