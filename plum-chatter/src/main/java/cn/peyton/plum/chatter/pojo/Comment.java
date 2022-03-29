package cn.peyton.plum.chatter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3>文章评论 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class Comment implements Serializable {
	/** 评论编号  */
	private Integer id;
	/** 发布人 用户对象userId  */
	private User user;
	/** 评论父编号 0表示一级评论 不是0表示回复 */
	private Integer fId;
	/** 这条评论被回复数数 ;用来判断有没有下级  */
	private Integer fnum;
	/** 数据  */
	private String data;
	/** 创建时间  */
	private Date createTime;
	/** 文章 postId  */
	private Integer postId;

    //================================== Constructor =======================================//
    public Comment() {
        if (null == user) {
            user = new User();
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
     * @return 发布人 用户对象userId
     */
    public User getUser() {
        return user;
    }
    /**
     * @param user 发布人 用户对象userId
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return  评论父编号 0表示一级评论 不是0表示回复
     */
    public Integer getFId() {
        return fId;
    }

    /**
     * @param fId 评论父编号 0表示一级评论 不是0表示回复
     */
    public void setFId(Integer fId) {
        this.fId = fId;
    }

    /**
	 * @param fnum 这条评论被回复数数 ;用来判断有没有下级
	 */ 
	public void setFnum(Integer fnum){
		this.fnum = fnum;
	}

	/** 
	 * @return 这条评论被回复数数 ;用来判断有没有下级
	 */ 
	public Integer getFnum(){
		return fnum;
	}

	/** 
	 * @param data 数据 
	 */ 
	public void setData(String data){
		this.data = data;
	}

	/** 
	 * @return 数据 
	 */ 
	public String getData(){
		return data;
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
     * @return 文章 postId
     */
    public Integer getPostId() {
        return postId;
    }
    /**
     * @param postId 文章 postId
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

}
