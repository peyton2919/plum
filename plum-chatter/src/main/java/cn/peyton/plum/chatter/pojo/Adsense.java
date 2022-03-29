package cn.peyton.plum.chatter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3> 广告 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class Adsense implements Serializable {
	/** 编号  */
	private Integer id;
	/** 地址  */
	private String src;
	/** 链接地址  */
	private String url;
	/** 0 动态轮播图 1个人中心  */
	private Integer type;
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
	 * @param src 地址 
	 */ 
	public void setSrc(String src){
		this.src = src;
	}

	/** 
	 * @return 地址 
	 */ 
	public String getSrc(){
		return src;
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
	 * @param type 0 动态轮播图 1个人中心 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 0 动态轮播图 1个人中心 
	 */ 
	public Integer getType(){
		return type;
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
