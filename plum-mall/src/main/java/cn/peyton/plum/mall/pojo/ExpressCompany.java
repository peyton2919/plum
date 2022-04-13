package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 快递公司 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
public class ExpressCompany implements Serializable {
	/**   */
	private Integer id;
	/** 名称  */
	private String name;
	/** 物流公司代码 (快递100)  */
	private String code;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
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
	 * @param code 物流公司代码 (快递100) 
	 */ 
	public void setCode(String code){
		this.code = code;
	}

	/** 
	 * @return 物流公司代码 (快递100) 
	 */ 
	public String getCode(){
		return code;
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
