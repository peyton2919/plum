package cn.peyton.plum.common.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 供应商日志 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 10:05:56
 * @version 1.0.0
 * </pre>
*/
public class SysSupplierLog implements Serializable {
	/**   */
	private Long id;
	/** 会员编号  */
	private Long memberId;
	/** 旧值  */
	private String oldValue;
	/** 新值  */
	private String newValue;
	/** 最后一次更新者的ip地址  */
	private String operateIp;
	/** 创建时间  */
	private Date createTime;

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
	 * @param memberId 会员编号 
	 */ 
	public void setMemberId(Long memberId){
		this.memberId = memberId;
	}

	/** 
	 * @return 会员编号 
	 */ 
	public Long getMemberId(){
		return memberId;
	}

	/** 
	 * @param oldValue 旧值 
	 */ 
	public void setOldValue(String oldValue){
		this.oldValue = oldValue;
	}

	/** 
	 * @return 旧值 
	 */ 
	public String getOldValue(){
		return oldValue;
	}

	/** 
	 * @param newValue 新值 
	 */ 
	public void setNewValue(String newValue){
		this.newValue = newValue;
	}

	/** 
	 * @return 新值 
	 */ 
	public String getNewValue(){
		return newValue;
	}

	/** 
	 * @param operateIp 最后一次更新者的ip地址 
	 */ 
	public void setOperateIp(String operateIp){
		this.operateIp = operateIp;
	}

	/** 
	 * @return 最后一次更新者的ip地址 
	 */ 
	public String getOperateIp(){
		return operateIp;
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
