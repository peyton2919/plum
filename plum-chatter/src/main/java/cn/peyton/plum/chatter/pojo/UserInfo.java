package cn.peyton.plum.chatter.pojo;

import java.io.Serializable;

/**
 * <h3>用户基础 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class UserInfo implements Serializable {
	/** 编号  */
	private Integer id;
	/** 用户id  */
	private Integer userId;
	/** 年龄  */
	private Integer age;
	/** 0 男 1女 2不限  */
	private Integer sex;
	/** 0不限  */
	private Integer qg;
	/** 工作  */
	private String job;
	/** 地址  */
	private String path;
	/** 生日 格式: yyyy-MM-dd  */
	private String birthday;

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
	 * @param userId 用户id 
	 */ 
	public void setUserId(Integer userId){
		this.userId = userId;
	}

	/** 
	 * @return 用户id 
	 */ 
	public Integer getUserId(){
		return userId;
	}

	/** 
	 * @param age 年龄 
	 */ 
	public void setAge(Integer age){
		this.age = age;
	}

	/** 
	 * @return 年龄 
	 */ 
	public Integer getAge(){
		return age;
	}

	/** 
	 * @param sex 0 男 1女 2不限 
	 */ 
	public void setSex(Integer sex){
		this.sex = sex;
	}

	/** 
	 * @return 0 男 1女 2不限 
	 */ 
	public Integer getSex(){
		return sex;
	}

	/** 
	 * @param qg 0不限 
	 */ 
	public void setQg(Integer qg){
		this.qg = qg;
	}

	/** 
	 * @return 0不限 
	 */ 
	public Integer getQg(){
		return qg;
	}

	/** 
	 * @param job 工作 
	 */ 
	public void setJob(String job){
		this.job = job;
	}

	/** 
	 * @return 工作 
	 */ 
	public String getJob(){
		return job;
	}

	/** 
	 * @param path 地址 
	 */ 
	public void setPath(String path){
		this.path = path;
	}

	/** 
	 * @return 地址 
	 */ 
	public String getPath(){
		return path;
	}

	/** 
	 * @param birthday 生日 格式: yyyy-MM-dd
	 */ 
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	/** 
	 * @return 生日  格式: yyyy-MM-dd
	 */ 
	public String getBirthday(){
		return birthday;
	}


}
