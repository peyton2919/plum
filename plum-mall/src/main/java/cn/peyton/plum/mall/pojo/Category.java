package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 分类信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class Category implements Serializable {
	/**   */
	private Integer id;
	/** 父级分类id; 默认为0表示最高父级  */
	private Integer parentId;
	/** 分类名称  */
	private String name;
	/** 分类状态: 1为可用;0不可用;默认为1可用  */
	private Integer status;
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
	 * @param parentId 父级分类id; 默认为0表示最高父级 
	 */ 
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}

	/** 
	 * @return 父级分类id; 默认为0表示最高父级 
	 */ 
	public Integer getParentId(){
		return parentId;
	}

	/** 
	 * @param name 分类名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 分类名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param status 分类状态: 1为可用;0不可用;默认为1可用 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 分类状态: 1为可用;0不可用;默认为1可用 
	 */ 
	public Integer getStatus(){
		return status;
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
