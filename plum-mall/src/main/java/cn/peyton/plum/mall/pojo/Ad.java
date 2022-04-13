package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 广告信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 10:16:09
 * @version 1.0.0
 * </pre>
*/
public class Ad implements Serializable {
	/** 编号  */
	private Long id;
	/** 标题: 可用于导航栏  */
	private String title;
	/**  广告图片地址  */
	private String src;
	/** 广告图片点击跳转链接  */
	private String url;
	/** 类型: 0:one 单图; 1:three 三图; 2:swiper: 轮播图; 3:导航：nav;  */
	private Integer type;
	/**
     * <pre>
     * location: 只在类型 type 三图 three 和导航 nav 时有作用
     *  1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *  2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
     */
	private Integer location;
	/** 热度: 值越大越靠前  */
	private Integer hot;
	/** 点击数,每点击一次加1  */
	private Integer clickNum;
	/** 创建时间  */
	private Date createTime;
	/** 状态，1为可用，0不可用，2为删除, 默认为1  */
	private Integer status;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id 编号 
	 */ 
	public void setId(Long id){
		this.id = id;
	}

	/** 
	 * @return 编号 
	 */ 
	public Long getId(){
		return id;
	}

	/** 
	 * @param title 标题: 可用于导航栏 
	 */ 
	public void setTitle(String title){
		this.title = title;
	}

	/** 
	 * @return 标题: 可用于导航栏 
	 */ 
	public String getTitle(){
		return title;
	}

	/** 
	 * @param src  广告图片地址 
	 */ 
	public void setSrc(String src){
		this.src = src;
	}

	/** 
	 * @return  广告图片地址 
	 */ 
	public String getSrc(){
		return src;
	}

	/** 
	 * @param url 广告图片点击跳转链接 
	 */ 
	public void setUrl(String url){
		this.url = url;
	}

	/** 
	 * @return 广告图片点击跳转链接 
	 */ 
	public String getUrl(){
		return url;
	}

	/** 
	 * @param type 类型: 0:one 单图; 1:three 三图; 2:swiper: 轮播图; 3:导航：nav; 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 类型: 0:one 单图; 1:three 三图; 2:swiper: 轮播图; 3:导航：nav; 
	 */ 
	public Integer getType(){
		return type;
	}

	/**
     * <pre>
     *   location: 只在类型 type 三图 three 和导航 nav 时有作用
     *      1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *      2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
	 * @param
	 */ 
	public void setLocation(Integer location){
		this.location = location;
	}

	/**
     * <pre>
     *   location: 只在类型 type 三图 three 和导航 nav 时有作用
     *      1. type = three 位置默认: 0; location：0: 左边大图: left; 1:右边上图: up; 2:右边下图: down;
     *      2. type = nav location 值用来排序，值越大越靠前;
     * </pre>
	 * @return
	 */ 
	public Integer getLocation(){
		return location;
	}

	/** 
	 * @param hot 热度: 值越大越靠前 
	 */ 
	public void setHot(Integer hot){
		this.hot = hot;
	}

	/** 
	 * @return 热度: 值越大越靠前 
	 */ 
	public Integer getHot(){
		return hot;
	}

	/** 
	 * @param clickNum 点击数,每点击一次加1 
	 */ 
	public void setClickNum(Integer clickNum){
		this.clickNum = clickNum;
	}

	/** 
	 * @return 点击数,每点击一次加1 
	 */ 
	public Integer getClickNum(){
		return clickNum;
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
	 * @param status 状态，1为可用，0不可用，2为删除, 默认为1 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 状态，1为可用，0不可用，2为删除, 默认为1 
	 */ 
	public Integer getStatus(){
		return status;
	}

}
