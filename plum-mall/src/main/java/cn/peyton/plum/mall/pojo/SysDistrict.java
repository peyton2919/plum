package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 行政区 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class SysDistrict implements Serializable {
	/**   */
	private Integer id;
	/** 城市ID  */
	private Integer sysCityId;
	/** 名称  */
	private String name;
	/** 排序: 数值越大越靠前  */
	private Integer seq;

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
	 * @param sysCityId 城市ID 
	 */ 
	public void setSysCityId(Integer sysCityId){
		this.sysCityId = sysCityId;
	}

	/** 
	 * @return 城市ID 
	 */ 
	public Integer getSysCityId(){
		return sysCityId;
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

}
