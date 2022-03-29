package cn.peyton.plum.chatter.param;

import cn.peyton.plum.chatter.pojo.PostClass;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3>文章分类 参数 传递类[用来展示数据]类 .param</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class PostClassParam implements Serializable {
	/** 编号  */
	private Integer id;
	/** 类型名称  */
	private String className;
	/** 0 禁用 1启用  */
	private Integer status;
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
	 * @param className 类型名称 
	 */ 
	public void setClassName(String className){
		this.className = className;
	}

	/** 
	 * @return 类型名称 
	 */ 
	public String getClassName(){
		return className;
	}

	/** 
	 * @param status 0 禁用 1启用 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 0 禁用 1启用 
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
	 * <h4>对象转成PostClass对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,className,status,createTime]
	 * </pre>
	 */
	public PostClass convert(){
		PostClass postClass = new PostClass(); 
		postClass.setId(id);
		postClass.setClassName(className);
		postClass.setStatus(status);
		postClass.setCreateTime(createTime);
		return postClass;
	} 
	/**
	 * <h4>PostClass对象转成PostClassParam对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,className,status,createTime]
	 * </pre>
	 */
	public PostClassParam compat(PostClass postClass){ 
		if(null == postClass){
			return new PostClassParam();
		}
		this.setId(postClass.getId());
		this.setClassName(postClass.getClassName());
		this.setStatus(postClass.getStatus());
		this.setCreateTime(postClass.getCreateTime());
		return this;
	} 
}
