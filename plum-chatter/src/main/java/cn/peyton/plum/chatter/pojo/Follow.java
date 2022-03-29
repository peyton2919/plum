package cn.peyton.plum.chatter.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <h3>粉丝关注 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class Follow implements Serializable {
	/** 编号  */
	private Integer id;
	/** 被关注用户  */
	private User followUser;
	/** 用户id  */
	private Integer userId;
	/** 创建时间  */
	private Date createTime;

    //================================== Constructor =======================================//
    public Follow() {
        if (null == followUser) {
            followUser = new User();
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
     * @return 被关注用户
     */
    public User getFollowUser() {
        return followUser;
    }
    /**
     * @param followUser 被关注用户
     */
    public void setFollowUser(User followUser) {
        this.followUser = followUser;
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
