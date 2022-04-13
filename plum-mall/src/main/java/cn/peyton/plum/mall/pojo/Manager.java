package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 管理员 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Manager implements Serializable {
	/** 主键  */
	private Integer id;
	/** 角色id  */
	private Integer roleId;
	/** 0禁用1启用2删除  */
	private Integer status;
	/** 创建时间  */
	private Date createTime;
	/** 用户名  */
	private String username;
	/** 密码  */
	private String password;
	/** 头像  */
	private String avatar;
	/** 是否是超级管理员  */
	private Integer isAdmin;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id 主键 
	 */ 
	public void setId(Integer id){
		this.id = id;
	}

	/** 
	 * @return 主键 
	 */ 
	public Integer getId(){
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
	 * @param status 0禁用1启用2删除 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 0禁用1启用2删除 
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

	/** 
	 * @param username 用户名 
	 */ 
	public void setUsername(String username){
		this.username = username;
	}

	/** 
	 * @return 用户名 
	 */ 
	public String getUsername(){
		return username;
	}

	/** 
	 * @param password 密码 
	 */ 
	public void setPassword(String password){
		this.password = password;
	}

	/** 
	 * @return 密码 
	 */ 
	public String getPassword(){
		return password;
	}

	/** 
	 * @param avatar 头像 
	 */ 
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	/** 
	 * @return 头像 
	 */ 
	public String getAvatar(){
		return avatar;
	}

	/** 
	 * @param isAdmin 是否是超级管理员 
	 */ 
	public void setIsAdmin(Integer isAdmin){
		this.isAdmin = isAdmin;
	}

	/** 
	 * @return 是否是超级管理员 
	 */ 
	public Integer getIsAdmin(){
		return isAdmin;
	}

}
