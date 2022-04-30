package cn.peyton.plum.mall.pojo;

import cn.peyton.plum.core.base.BaseUser;

import java.util.Date;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 供应商信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Supplier implements Serializable {
	/** 编号  */
	private Long id;
	/** 供应商名称  */
	private String name;
	/** 供应商登录名  */
	private String loginName;
	/** 供应商头像地址  */
	private String avatar;
	/** 密码  */
	private String pwd;
	/** 电话  */
	private String tel;
	/** 手机  */
	private String phone;
	/** 地址  */
	private String add;
	/** qq  */
	private String qq;
	/** 传真  */
	private String fax;
	/** 邮箱  */
	private String email;
	/** 登录次数,每登录一次加1  */
	private Integer loc;
	/** 状态，1为可用，0不可用，2为删除, 默认为1  */
	private Integer status;
	/** 创建时间  */
	private Date createdTime;
	/** 最后登录时间  */
	private Date updatedTime;
	/** 加密串  */
	private String encrypt;
	/** 最后登录IP  */
	private String lastIp;
	/** 说明  */
	private String explain;
	/** 外接网址  */
	private String webSite;
	/** 连接外网标识码  */
	private String webCode;
	/** 创建时间  */
	private Date createTime;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id 编号 
	 */ 
	public void setId(Long id){
		this.id = id;
	}

	/** 
	 * @return 编号 
	 */ 
	public Long getId(){
		return id;
	}

	/** 
	 * @param name 供应商名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 供应商名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param loginName 供应商登录名 
	 */ 
	public void setLoginName(String loginName){
		this.loginName = loginName;
	}

	/** 
	 * @return 供应商登录名 
	 */ 
	public String getLoginName(){
		return loginName;
	}

	/** 
	 * @param avatar 供应商头像地址 
	 */ 
	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	/** 
	 * @return 供应商头像地址 
	 */ 
	public String getAvatar(){
		return avatar;
	}

	/** 
	 * @param pwd 密码 
	 */ 
	public void setPwd(String pwd){
		this.pwd = pwd;
	}

	/** 
	 * @return 密码 
	 */ 
	public String getPwd(){
		return pwd;
	}

	/** 
	 * @param tel 电话 
	 */ 
	public void setTel(String tel){
		this.tel = tel;
	}

	/** 
	 * @return 电话 
	 */ 
	public String getTel(){
		return tel;
	}

	/** 
	 * @param phone 手机 
	 */ 
	public void setPhone(String phone){
		this.phone = phone;
	}

	/** 
	 * @return 手机 
	 */ 
	public String getPhone(){
		return phone;
	}

	/** 
	 * @param add 地址 
	 */ 
	public void setAdd(String add){
		this.add = add;
	}

	/** 
	 * @return 地址 
	 */ 
	public String getAdd(){
		return add;
	}

	/** 
	 * @param qq qq 
	 */ 
	public void setQq(String qq){
		this.qq = qq;
	}

	/** 
	 * @return qq 
	 */ 
	public String getQq(){
		return qq;
	}

	/** 
	 * @param fax 传真 
	 */ 
	public void setFax(String fax){
		this.fax = fax;
	}

	/** 
	 * @return 传真 
	 */ 
	public String getFax(){
		return fax;
	}

	/** 
	 * @param email 邮箱 
	 */ 
	public void setEmail(String email){
		this.email = email;
	}

	/** 
	 * @return 邮箱 
	 */ 
	public String getEmail(){
		return email;
	}

	/** 
	 * @param loc 登录次数,每登录一次加1 
	 */ 
	public void setLoc(Integer loc){
		this.loc = loc;
	}

	/** 
	 * @return 登录次数,每登录一次加1 
	 */ 
	public Integer getLoc(){
		return loc;
	}

	/** 
	 * @param status 状态，1为可用，0不可用，2为删除, 默认为1 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态，1为可用，0不可用，2为删除, 默认为1 
	 */ 
	public Integer getStatus(){
		return status;
	}

	/** 
	 * @param createdTime 创建时间 
	 */ 
	public void setCreatedTime(Date createdTime){
		this.createdTime = createdTime;
	}

	/** 
	 * @return 创建时间 
	 */ 
	public Date getCreatedTime(){
		return createdTime;
	}

	/** 
	 * @param updatedTime 最后登录时间 
	 */ 
	public void setUpdatedTime(Date updatedTime){
		this.updatedTime = updatedTime;
	}

	/** 
	 * @return 最后登录时间 
	 */ 
	public Date getUpdatedTime(){
		return updatedTime;
	}

	/** 
	 * @param encrypt 加密串 
	 */ 
	public void setEncrypt(String encrypt){
		this.encrypt = encrypt;
	}

	/** 
	 * @return 加密串 
	 */ 
	public String getEncrypt(){
		return encrypt;
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
	 * @param explain 说明 
	 */ 
	public void setExplain(String explain){
		this.explain = explain;
	}

	/** 
	 * @return 说明 
	 */ 
	public String getExplain(){
		return explain;
	}

	/** 
	 * @param webSite 外接网址 
	 */ 
	public void setWebSite(String webSite){
		this.webSite = webSite;
	}

	/** 
	 * @return 外接网址 
	 */ 
	public String getWebSite(){
		return webSite;
	}

	/** 
	 * @param webCode 连接外网标识码 
	 */ 
	public void setWebCode(String webCode){
		this.webCode = webCode;
	}

	/** 
	 * @return 连接外网标识码 
	 */ 
	public String getWebCode(){
		return webCode;
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
