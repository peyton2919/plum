package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 品牌信息 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class Brand implements Serializable {
	/** 编号  */
	private Integer id;
	/** 供应商编号  */
	private Long supId;
	/** 品牌LOGO 图片大小120px*60px  */
	private String logo;
	/** 品牌名称  */
	private String name;
	/** 所属地区  */
	private String area;
	/** 排序 从小到大  */
	private Integer seq;
	/** 状态，1为可用，0不可用，2为删除, 默认为1  */
	private Integer status;
	/** 品牌描述  */
	private String explain;

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
	 * @param supId 供应商编号 
	 */ 
	public void setSupId(Long supId){
		this.supId = supId;
	}

	/** 
	 * @return 供应商编号 
	 */ 
	public Long getSupId(){
		return supId;
	}

	/** 
	 * @param logo 品牌LOGO 图片大小120px*60px 
	 */ 
	public void setLogo(String logo){
		this.logo = logo;
	}

	/** 
	 * @return 品牌LOGO 图片大小120px*60px 
	 */ 
	public String getLogo(){
		return logo;
	}

	/** 
	 * @param name 品牌名称 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 品牌名称 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param area 所属地区 
	 */ 
	public void setArea(String area){
		this.area = area;
	}

	/** 
	 * @return 所属地区 
	 */ 
	public String getArea(){
		return area;
	}

	/** 
	 * @param seq 排序 从小到大 
	 */ 
	public void setSeq(Integer seq){
		this.seq = seq;
	}

	/** 
	 * @return 排序 从小到大 
	 */ 
	public Integer getSeq(){
		return seq;
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

	/** 
	 * @param explain 品牌描述 
	 */ 
	public void setExplain(String explain){
		this.explain = explain;
	}

	/** 
	 * @return 品牌描述 
	 */ 
	public String getExplain(){
		return explain;
	}

}
