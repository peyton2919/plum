package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 商品规格 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Sku implements Serializable {
	/**   */
	private Integer id;
	/** 规格分类名称  */
	private String name;
	/** 规格类型 0无 1颜色 2图片  */
	private Integer type;
	/** 创建时间  */
	private Date createTime;
	/** 状态：0禁用1启用  */
	private Integer status;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 可存放对象集  */
	private String explain;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id  
	 */ 
	public void setId(Integer id){
		this.id = id;
	}

	/** 
	 * @return  
	 */ 
	public Integer getId(){
		return id;
	}

	/** 
	 * @param name 规格分类名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 规格分类名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param type 规格类型 0无 1颜色 2图片 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 规格类型 0无 1颜色 2图片 
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

	/** 
	 * @param status 状态：0禁用1启用 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态：0禁用1启用 
	 */ 
	public Integer getStatus(){
		return status;
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
	 * @param explain 可存放对象集 
	 */ 
	public void setExplain(String explain){
		this.explain = explain;
	}

	/** 
	 * @return 可存放对象集 
	 */ 
	public String getExplain(){
		return explain;
	}

}
