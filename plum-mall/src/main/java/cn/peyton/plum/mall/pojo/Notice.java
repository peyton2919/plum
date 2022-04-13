package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 公告表 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Notice implements Serializable {
	/**   */
	private Long id;
	/** 管理员ID  */
	private Integer managerId;
	/** 公告标题  */
	private String title;
	/** 公告内容  */
	private String content;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 创建时间  */
	private Date createTime;
	/** 更新时间  */
	private Date updateTime;
	/** 是否可用,1：可用;0:不可用;2:删除;  */
	private Integer status;

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
	 * @param managerId 管理员ID 
	 */ 
	public void setManagerId(Integer managerId){
		this.managerId = managerId;
	}

	/** 
	 * @return 管理员ID 
	 */ 
	public Integer getManagerId(){
		return managerId;
	}

	/** 
	 * @param title 公告标题 
	 */ 
	public void setTitle(String title){
		this.title = title;
	}

	/** 
	 * @return 公告标题 
	 */ 
	public String getTitle(){
		return title;
	}

	/** 
	 * @param content 公告内容 
	 */ 
	public void setContent(String content){
		this.content = content;
	}

	/** 
	 * @return 公告内容 
	 */ 
	public String getContent(){
		return content;
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

	/** 
	 * @param status 是否可用,1：可用;0:不可用;2:删除; 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 是否可用,1：可用;0:不可用;2:删除; 
	 */ 
	public Integer getStatus(){
		return status;
	}

}
