package cn.peyton.plum.chatter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3>意见反馈 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class Feedback implements Serializable {
	/** 编号  */
	private Integer id;
	/** 接受id  */
	private Integer toId;
	/** 发送id  */
	private Integer fromId;
	/** 数据  */
	private String data;
	/** 创建时间  */
	private Date createTime;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id 编号 
	 */ 
	public void setId(Integer id){
		this.id = id;
	}

	/** 
	 * @return 编号 
	 */ 
	public Integer getId(){
		return id;
	}

	/** 
	 * @param toId 接受id 
	 */ 
	public void setToId(Integer toId){
		this.toId = toId;
	}

	/** 
	 * @return 接受id 
	 */ 
	public Integer getToId(){
		return toId;
	}

	/** 
	 * @param fromId 发送id 
	 */ 
	public void setFromId(Integer fromId){
		this.fromId = fromId;
	}

	/** 
	 * @return 发送id 
	 */ 
	public Integer getFromId(){
		return fromId;
	}

	/** 
	 * @param data 数据 
	 */ 
	public void setData(String data){
		this.data = data;
	}

	/** 
	 * @return 数据 
	 */ 
	public String getData(){
		return data;
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
