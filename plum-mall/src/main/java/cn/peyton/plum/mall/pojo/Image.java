package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 相册 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Image implements Serializable {
	/**   */
	private Long id;
	/** 链接地址  */
	private String url;
	/** 图片名称  */
	private String name;
	/** 图片路径  */
	private String path;
	/** 创建时间  */
	private Date createTime;
	/** 相册分类id  */
	private Integer imageClassId;
	/** 每点一次加1  */
	private Integer clickCount;
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
	 * @param name 图片名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 图片名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param path 图片路径 
	 */ 
	public void setPath(String path){
		this.path = path;
	}

	/** 
	 * @return 图片路径 
	 */ 
	public String getPath(){
		return path;
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
	 * @param imageClassId 相册分类id 
	 */ 
	public void setImageClassId(Integer imageClassId){
		this.imageClassId = imageClassId;
	}

	/** 
	 * @return 相册分类id 
	 */ 
	public Integer getImageClassId(){
		return imageClassId;
	}

	/** 
	 * @param clickCount 每点一次加1 
	 */ 
	public void setClickCount(Integer clickCount){
		this.clickCount = clickCount;
	}

	/** 
	 * @return 每点一次加1 
	 */ 
	public Integer getClickCount(){
		return clickCount;
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
