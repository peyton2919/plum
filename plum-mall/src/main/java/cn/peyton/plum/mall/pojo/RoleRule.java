package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 角色规则(关联角色与规则) 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class RoleRule implements Serializable {
	/**   */
	private Long id;
	/** 角色id  */
	private Integer roleId;
	/** 规则id  */
	private Integer ruleId;

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
	 * @param roleId 角色id 
	 */ 
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	/** 
	 * @return 角色id 
	 */ 
	public Integer getRoleId(){
		return roleId;
	}

	/** 
	 * @param ruleId 规则id 
	 */ 
	public void setRuleId(Integer ruleId){
		this.ruleId = ruleId;
	}

	/** 
	 * @return 规则id 
	 */ 
	public Integer getRuleId(){
		return ruleId;
	}

}
