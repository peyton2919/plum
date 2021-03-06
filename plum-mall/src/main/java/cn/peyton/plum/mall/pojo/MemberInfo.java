package cn.peyton.plum.mall.pojo;

import java.util.Date;
import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 会员信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 20:51:50
 * @version 1.0.0
 * </pre>
*/
public class MemberInfo implements Serializable {
	/**   */
	private Long id;
	/** 会员id  */
	private Long memberId;
	/** 性别  */
	private Integer sex;
	/** 生日  */
	private Date birthday;
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
	 * @param memberId 会员id 
	 */ 
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	/** 
	 * @return 会员id 
	 */ 
	public Long getMemberId(){
		return memberId;
	}

	/** 
	 * @param sex 性别 
	 */ 
	public void setSex(Integer sex){
		this.sex = sex;
	}

	/** 
	 * @return 性别 
	 */ 
	public Integer getSex(){
		return sex;
	}

	/** 
	 * @param birthday 生日 
	 */ 
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	/** 
	 * @return 生日 
	 */ 
	public Date getBirthday(){
		return birthday;
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
