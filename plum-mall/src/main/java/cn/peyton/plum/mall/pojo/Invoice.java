package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 发票 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Invoice implements Serializable {
	/**   */
	private Long id;
	/** 订单id  */
	private Long orderId;
	/** 用户id  */
	private Long memberId;
	/** 名称/公司名称  */
	private String name;
	/** 手机  */
	private String phone;
	/** 邮箱  */
	private String email;
	/** 税号  */
	private String code;
	/** 单位地址  */
	private String path;
	/** 开户行  */
	private String bankname;
	/** 银行账号  */
	private String bankno;
	/** 创建时间  */
	private Date createTime;
	/** 状态：0未开票1已开票  */
	private Integer status;
	/** 类型：0个人1企业  */
	private Integer type;

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
	 * @param orderId 订单id 
	 */ 
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	/** 
	 * @return 订单id 
	 */ 
	public Long getOrderId(){
		return orderId;
	}

	/** 
	 * @param memberId 用户id 
	 */ 
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	/** 
	 * @return 用户id 
	 */ 
	public Long getMemberId(){
		return memberId;
	}

	/** 
	 * @param name 名称/公司名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 名称/公司名称 
	 */ 
	public String getName(){
		return name;
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
	 * @param code 税号 
	 */ 
	public void setCode(String code){
		this.code = code;
	}

	/** 
	 * @return 税号 
	 */ 
	public String getCode(){
		return code;
	}

	/** 
	 * @param path 单位地址 
	 */ 
	public void setPath(String path){
		this.path = path;
	}

	/** 
	 * @return 单位地址 
	 */ 
	public String getPath(){
		return path;
	}

	/** 
	 * @param bankname 开户行 
	 */ 
	public void setBankname(String bankname){
		this.bankname = bankname;
	}

	/** 
	 * @return 开户行 
	 */ 
	public String getBankname(){
		return bankname;
	}

	/** 
	 * @param bankno 银行账号 
	 */ 
	public void setBankno(String bankno){
		this.bankno = bankno;
	}

	/** 
	 * @return 银行账号 
	 */ 
	public String getBankno(){
		return bankno;
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
	 * @param status 状态：0未开票1已开票 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态：0未开票1已开票 
	 */ 
	public Integer getStatus(){
		return status;
	}

	/** 
	 * @param type 类型：0个人1企业 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 类型：0个人1企业 
	 */ 
	public Integer getType(){
		return type;
	}

}
