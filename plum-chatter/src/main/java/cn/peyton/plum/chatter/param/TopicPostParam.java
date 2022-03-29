package cn.peyton.plum.chatter.param;

import cn.peyton.plum.chatter.pojo.TopicPost;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3>话题文章关联 参数 传递类[用来展示数据]类 .param</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class TopicPostParam implements Serializable {
	/** 编号  */
	private Integer id;
	/** 话题id  */
	private Integer topicId;
	/** 帖子id  */
	private Integer postId;
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
	 * @param topicId 话题id 
	 */ 
	public void setTopicId(Integer topicId){
		this.topicId = topicId;
	}

	/** 
	 * @return 话题id 
	 */ 
	public Integer getTopicId(){
		return topicId;
	}

	/** 
	 * @param postId 帖子id 
	 */ 
	public void setPostId(Integer postId){
		this.postId = postId;
	}

	/** 
	 * @return 帖子id 
	 */ 
	public Integer getPostId(){
		return postId;
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
	 * <h4>对象转成TopicPost对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,topicId,postId,createTime]
	 * </pre>
	 */
	public TopicPost convert(){
		TopicPost topicPost = new TopicPost(); 
		topicPost.setId(id);
		topicPost.setTopicId(topicId);
		topicPost.setPostId(postId);
		topicPost.setCreateTime(createTime);
		return topicPost;
	} 
	/**
	 * <h4>TopicPost对象转成TopicPostParam对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,topicId,postId,createTime]
	 * </pre>
	 */
	public TopicPostParam compat(TopicPost topicPost){ 
		if(null == topicPost){
			return new TopicPostParam();
		}
		this.setId(topicPost.getId());
		this.setTopicId(topicPost.getTopicId());
		this.setPostId(topicPost.getPostId());
		this.setCreateTime(topicPost.getCreateTime());
		return this;
	} 
}
