package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 角色 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Role implements Serializable {
	/**   */
	private Integer id;
	/** 角色名称  */
	private String name;
	/** 描述  */
	private String desc;
	/** 状态：0禁用1启用  */
	private Integer status;
	/** 创建时间  */
	private Date createTime;

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
	 * @param name 角色名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 角色名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param desc 描述 
	 */ 
	public void setDesc(String desc){
		this.desc = desc;
	}

	/** 
	 * @return 描述 
	 */ 
	public String getDesc(){
		return desc;
	}

	/** 
	 * @param status 状态：0禁用1启用 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态：0禁用1启用 
	 */ 
	public Integer getStatus(){
		return status;
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
