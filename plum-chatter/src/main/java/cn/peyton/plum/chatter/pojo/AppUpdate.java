package cn.peyton.plum.chatter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3> 应用程序更新 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class AppUpdate implements Serializable {
	/** 编号  */
	private Integer id;
	/** 链接地址  */
	private String url;
	/** 版本号  */
	private String version;
	/** 0未上线 1上线  */
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
	 * @param url 链接地址 
	 */ 
	public void setUrl(String url){
		this.url = url;
	}

	/** 
	 * @return 链接地址 
	 */ 
	public String getUrl(){
		return url;
	}

	/** 
	 * @param version 版本号 
	 */ 
	public void setVersion(String version){
		this.version = version;
	}

	/** 
	 * @return 版本号 
	 */ 
	public String getVersion(){
		return version;
	}

	/** 
	 * @param status 0未上线 1上线 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 0未上线 1上线 
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

}
