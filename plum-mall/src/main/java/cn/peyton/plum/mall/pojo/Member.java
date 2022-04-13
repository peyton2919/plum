package cn.peyton.plum.mall.pojo;

import java.util.Date;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 会员 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Member implements Serializable {
	/**   */
	private Long id;
	/** 会员级别  */
	private Integer memberLevelId;
	/** 会员名称  */
	private String username;
	/** 会员密码  */
	private String password;
	/** 会员头像  */
	private String avatar;
	/** 会员昵称  */
	private String nickname;
	/** 会员手机  */
	private String phone;
	/** 会员邮箱  */
	private String email;
	/** 最后登录IP  */
	private String lastIp;
	/** 每登录一次加1  */
	private Integer loginCount;
	/** 最后登录时间  */
	private Date lastLoginTime;
	/** 状态：0禁用1启用2删除  */
	private Integer status;
	/** 创建时间  */
	private Date createTime;
	/** 更新时间  */
	private Date updateTime;

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
	 * @param memberLevelId 会员级别 
	 */ 
	public void setMemberLevelId(Integer memberLevelId){
		this.memberLevelId = memberLevelId;
	}

	/** 
	 * @return 会员级别 
	 */ 
	public Integer getMemberLevelId(){
		return memberLevelId;
	}

	/** 
	 * @param username 会员名称 
	 */ 
	public void setUsername(String username){
		this.username = username;
	}

	/** 
	 * @return 会员名称 
	 */ 
	public String getUsername(){
		return username;
	}

	/** 
	 * @param password 会员密码 
	 */ 
	public void setPassword(String password){
		this.password = password;
	}

	/** 
	 * @return 会员密码 
	 */ 
	public String getPassword(){
		return password;
	}

	/** 
	 * @param avatar 会员头像 
	 */ 
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	/** 
	 * @return 会员头像 
	 */ 
	public String getAvatar(){
		return avatar;
	}

	/** 
	 * @param nickname 会员昵称 
	 */ 
	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	/** 
	 * @return 会员昵称 
	 */ 
	public String getNickname(){
		return nickname;
	}

	/** 
	 * @param phone 会员手机 
	 */ 
	public void setPhone(String phone){
		this.phone = phone;
	}

	/** 
	 * @return 会员手机 
	 */ 
	public String getPhone(){
		return phone;
	}

	/** 
	 * @param email 会员邮箱 
	 */ 
	public void setEmail(String email){
		this.email = email;
	}

	/** 
	 * @return 会员邮箱 
	 */ 
	public String getEmail(){
		return email;
	}

	/** 
	 * @param lastIp 最后登录IP 
	 */ 
	public void setLastIp(String lastIp){
		this.lastIp = lastIp;
	}

	/** 
	 * @return 最后登录IP 
	 */ 
	public String getLastIp(){
		return lastIp;
	}

	/** 
	 * @param loginCount 每登录一次加1 
	 */ 
	public void setLoginCount(Integer loginCount){
		this.loginCount = loginCount;
	}

	/** 
	 * @return 每登录一次加1 
	 */ 
	public Integer getLoginCount(){
		return loginCount;
	}

	/** 
	 * @param lastLoginTime 最后登录时间 
	 */ 
	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	/** 
	 * @return 最后登录时间 
	 */ 
	public Date getLastLoginTime(){
		return lastLoginTime;
	}

	/** 
	 * @param status 状态：0禁用1启用2删除 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态：0禁用1启用2删除 
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
	 * @param updateTime 更新时间 
	 */ 
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	/** 
	 * @return 更新时间 
	 */ 
	public Date getUpdateTime(){
		return updateTime;
	}

}
