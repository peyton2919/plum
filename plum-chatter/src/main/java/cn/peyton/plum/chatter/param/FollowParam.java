package cn.peyton.plum.chatter.param;

import cn.peyton.plum.chatter.bo.FollowBo;
import cn.peyton.plum.chatter.bo.UserBo;
import cn.peyton.plum.chatter.pojo.Follow;
import cn.peyton.plum.chatter.pojo.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <h3>粉丝关注 参数 传递类[用来展示数据]类 .param</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class FollowParam implements Serializable {
	/** 编号  */
	private Integer id;
	/** 被关注用户  */
	private UserParam followUserParam;
	/** 用户id  */
	private Integer userId;
	/** 创建时间  */
	private Date createTime;

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
     * @return 被关注用户
     */
     public UserParam getFollowUserParam() {
        return followUserParam;
    }

    /**
     * @param followUserParam 被关注用户
     */
     public void setFollowUserParam(UserParam followUserParam) {
        this.followUserParam = followUserParam;
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

	/**
	 * <h4>对象转成Follow对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,followId,userId,createTime]
	 * </pre>
	 */
	public Follow convert(){
		Follow follow = new Follow(); 
		follow.setId(id);
        // if (null != this.getFollowUserParams()) {
        //     follow.getFollowUsers().addAll(new UserBo().reverse(this.getFollowUserParams()));
        // }
        follow.setFollowUser(new UserBo().convert(this.getFollowUserParam()));
		follow.setUserId(userId);
		follow.setCreateTime(createTime);
		return follow;
	} 
	/**
	 * <h4>Follow对象转成FollowParam对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,followId,userId,createTime]
	 * </pre>
	 */
	public FollowParam compat(Follow follow){ 
		if(null == follow){
			return new FollowParam();
		}
		this.setId(follow.getId());
        // this.getFollowUserParams().addAll(new UserBo().adapter(follow.getFollowUsers()));
        this.setFollowUserParam(new UserBo().compat(follow.getFollowUser()));
        this.setUserId(follow.getUserId());
		this.setCreateTime(follow.getCreateTime());
		return this;
	} 
}
