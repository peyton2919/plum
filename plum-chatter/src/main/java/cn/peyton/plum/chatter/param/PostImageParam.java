package cn.peyton.plum.chatter.param;

import cn.peyton.plum.chatter.pojo.PostImage;

import java.io.Serializable;
import java.util.Date;

/**
 * <h3>文章图片关联 参数 传递类[用来展示数据]类 .param</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class PostImageParam implements Serializable {
	/** 编号  */
	private Integer id;
	/** 帖子id  */
	private Integer postId;
	/** 图片id  */
	private Integer imageId;
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
	 * @param imageId 图片id 
	 */ 
	public void setImageId(Integer imageId){
		this.imageId = imageId;
	}

	/** 
	 * @return 图片id 
	 */ 
	public Integer getImageId(){
		return imageId;
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
	 * <h4>对象转成PostImage对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,postId,imageId,createTime]
	 * </pre>
	 */
	public PostImage convert(){
		PostImage postImage = new PostImage(); 
		postImage.setId(id);
		postImage.setPostId(postId);
		postImage.setImageId(imageId);
		postImage.setCreateTime(createTime);
		return postImage;
	} 
	/**
	 * <h4>PostImage对象转成PostImageParam对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,postId,imageId,createTime]
	 * </pre>
	 */
	public PostImageParam compat(PostImage postImage){ 
		if(null == postImage){
			return new PostImageParam();
		}
		this.setId(postImage.getId());
		this.setPostId(postImage.getPostId());
		this.setImageId(postImage.getImageId());
		this.setCreateTime(postImage.getCreateTime());
		return this;
	} 
}
