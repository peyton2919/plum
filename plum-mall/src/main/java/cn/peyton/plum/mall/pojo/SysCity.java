package cn.peyton.plum.mall.pojo;


import java.io.Serializable;
/**
 * <h3> 城市 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public class SysCity implements Serializable {
	/**   */
	private Integer id;
	/** 省份ID  */
	private Integer sysProvinceId;
	/** 名称  */
	private String name;
	/** 邮编  */
	private String zip;
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
	 * @param sysProvinceId 省份ID 
	 */ 
	public void setSysProvinceId(Integer sysProvinceId){
		this.sysProvinceId = sysProvinceId;
	}

	/** 
	 * @return 省份ID 
	 */ 
	public Integer getSysProvinceId(){
		return sysProvinceId;
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
	 * @param zip 邮编 
	 */ 
	public void setZip(String zip){
		this.zip = zip;
	}

	/** 
	 * @return 邮编 
	 */ 
	public String getZip(){
		return zip;
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
