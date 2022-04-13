package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 规则 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class Rule implements Serializable {
	/**   */
	private Integer id;
	/** 父级id 0为最高父级  */
	private Integer parentId;
	/** 名称  */
	private String name;
	/** 是否显示为菜单：0不显示1关闭  */
	private Integer menu;
	/** 前端路由name值  */
	private String desc;
	/** 前台路由注册路径  */
	private String frontpath;
	/** 条件  */
	private String condition;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 图标  */
	private String icon;
	/** 请求类型  */
	private String method;
	/** 状态0关闭1启用2删除  */
	private Integer status;
	/** 创建时间  */
	private Date createTime;

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
	 * @param parentId 父级id 0为最高父级 
	 */ 
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}

	/** 
	 * @return 父级id 0为最高父级 
	 */ 
	public Integer getParentId(){
		return parentId;
	}

	/** 
	 * @param name 名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param menu 是否显示为菜单：0不显示1关闭 
	 */ 
	public void setMenu(Integer menu){
		this.menu = menu;
	}

	/** 
	 * @return 是否显示为菜单：0不显示1关闭 
	 */ 
	public Integer getMenu(){
		return menu;
	}

	/** 
	 * @param desc 前端路由name值 
	 */ 
	public void setDesc(String desc){
		this.desc = desc;
	}

	/** 
	 * @return 前端路由name值 
	 */ 
	public String getDesc(){
		return desc;
	}

	/** 
	 * @param frontpath 前台路由注册路径 
	 */ 
	public void setFrontpath(String frontpath){
		this.frontpath = frontpath;
	}

	/** 
	 * @return 前台路由注册路径 
	 */ 
	public String getFrontpath(){
		return frontpath;
	}

	/** 
	 * @param condition 条件 
	 */ 
	public void setCondition(String condition){
		this.condition = condition;
	}

	/** 
	 * @return 条件 
	 */ 
	public String getCondition(){
		return condition;
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
	 * @param icon 图标 
	 */ 
	public void setIcon(String icon){
		this.icon = icon;
	}

	/** 
	 * @return 图标 
	 */ 
	public String getIcon(){
		return icon;
	}

	/** 
	 * @param method 请求类型 
	 */ 
	public void setMethod(String method){
		this.method = method;
	}

	/** 
	 * @return 请求类型 
	 */ 
	public String getMethod(){
		return method;
	}

	/** 
	 * @param status 状态0关闭1启用2删除 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态0关闭1启用2删除 
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
