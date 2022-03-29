package cn.peyton.plum.chatter.param;

import cn.peyton.plum.chatter.pojo.UserBind;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import cn.peyton.plum.core.validator.constraints.NotNull;

import java.io.Serializable;

/**
 * <h3>用户绑定 参数 传递类[用来展示数据]类 .param</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class UserBindParam implements Serializable {
	/** 编号  */
	private Integer id;
    /**
     * 类型 对应第三方的 provider
     */
    @NotBlank(message = "用户类型不能为空")
    private String type;
	/** 开放编号  */
	@NotBlank(message = "用户编号不能为空")
	private String openId;
	/** 用户编号  */
	private Integer userId;
	/** 昵称  */
	private String nickName;
	/** 头像地址  */
	private String avatarUrl;
	/** 过期时间 */
	private Long expiresIn;

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
	 * @param type 类型 对应第三方的 provider
	 */ 
	public void setType(String type){
		this.type = type;
	}

	/** 
	 * @return 类型 对应第三方的 provider
	 */ 
	public String getType(){
		return type;
	}

	/** 
	 * @param openId 开放编号 
	 */ 
	public void setOpenId(String openId){
		this.openId = openId;
	}

	/** 
	 * @return 开放编号 
	 */ 
	public String getOpenId(){
		return openId;
	}

	/** 
	 * @param userId 用户编号 
	 */ 
	public void setUserId(Integer userId){
		this.userId = userId;
	}

	/** 
	 * @return 用户编号 
	 */ 
	public Integer getUserId(){
		return userId;
	}

	/** 
	 * @param nickName 昵称 
	 */ 
	public void setNickName(String nickName){
		this.nickName = nickName;
	}

	/** 
	 * @return 昵称 
	 */ 
	public String getNickName(){
		return nickName;
	}

	/** 
	 * @param avatarUrl 头像地址 
	 */ 
	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	/** 
	 * @return 头像地址 
	 */ 
	public String getAvatarUrl(){
		return avatarUrl;
	}

    /**
     * @return 过期时间
     */
    public Long getExpiresIn() {
        return expiresIn;
    }

    /**
     * @param expiresIn 过期时间
     */
    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
	 * <h4>对象转成UserBind对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,type,openId,userId,nickName,avatarUrl]
	 * </pre>
	 */
	public UserBind convert(){
		UserBind userBind = new UserBind(); 
		userBind.setId(id);
		userBind.setType(type);
		userBind.setOpenId(openId);
		userBind.setUserId(userId);
		userBind.setNickName(nickName);
		userBind.setAvatarUrl(avatarUrl);
		return userBind;
	} 
	/**
	 * <h4>UserBind对象转成UserBindParam对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,type,openId,userId,nickName,avatarUrl]
	 * </pre>
	 */
	public UserBindParam compat(UserBind userBind){ 
		if(null == userBind){
			return new UserBindParam();
		}
		this.setId(userBind.getId());
		this.setType(userBind.getType());
		this.setOpenId(userBind.getOpenId());
		this.setUserId(userBind.getUserId());
		this.setNickName(userBind.getNickName());
		this.setAvatarUrl(userBind.getAvatarUrl());
		return this;
	} 
}
