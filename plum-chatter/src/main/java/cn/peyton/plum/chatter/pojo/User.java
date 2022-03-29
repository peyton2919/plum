package cn.peyton.plum.chatter.pojo;

import cn.peyton.plum.core.utils.Lists;
import cn.peyton.plum.core.validator.constraints.Email;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import cn.peyton.plum.core.validator.constraints.Phone;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <h3>用户 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class User implements Serializable {
	/** 编号  */
	private Integer id;
	/** 名字  */
	@NotBlank(message = "用户名称不能为空")
	private String username;
	/** 头像  */
	private String userPic;
	/** 密码  */
	@NotBlank(message = "密码不能为空")
	private String password;
	/** 手机  */
	@Phone
	private String phone;
	/** 邮箱  */
	@Email
	private String email;
	/** 0 禁用 1启用  */
	private Integer status;
	/** 创建时间  */
	private Date createTime;
    /** 用户扩展信息 对象 */
    private UserInfo userInfo;
    /** 用户绑定对象 */
    private List<UserBind> userBinds;

	//================================== Constructor =======================================//
    public User(){
        if (null == userInfo) {
            userInfo = new UserInfo();
        }
        if (null == userBinds) {
            userBinds = Lists.newArrayList();
        }
    }

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
	 * @param username 名字 
	 */ 
	public void setUsername(String username){
		this.username = username;
	}

	/** 
	 * @return 名字 
	 */ 
	public String getUsername(){
		return username;
	}

	/** 
	 * @param userPic 头像 
	 */ 
	public void setUserPic(String userPic){
		this.userPic = userPic;
	}

	/** 
	 * @return 头像 
	 */ 
	public String getUserPic(){
		return userPic;
	}

	/** 
	 * @param password 密码 
	 */ 
	public void setPassword(String password){
		this.password = password;
	}

	/** 
	 * @return 密码 
	 */ 
	public String getPassword(){
		return password;
	}

	/** 
	 * @param phone 手机 
	 */ 
	public void setPhone(String phone){
		this.phone = phone;
	}

	/** 
	 * @return 手机 
	 */ 
	public String getPhone(){
		return phone;
	}

	/** 
	 * @param email 邮箱 
	 */ 
	public void setEmail(String email){
		this.email = email;
	}

	/** 
	 * @return 邮箱 
	 */ 
	public String getEmail(){
		return email;
	}

	/** 
	 * @param status 0 禁用 1启用 
	 */ 
	public void setStatus(Integer status){
		this.status = status;
	}

	/** 
	 * @return 0 禁用 1启用 
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

    /**
     * @return 用户扩展信息 对象
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * @param userInfo 用户扩展信息 对象
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * @return 用户绑定对象
     */
    public List<UserBind> getUserBinds() {
        return userBinds;
    }

    /**
     * @param userBinds 用户绑定对象
     */
    public void setUserBinds(List<UserBind> userBinds) {
        this.userBinds = userBinds;
    }
}
