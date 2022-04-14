package cn.peyton.plum.mall.pojo;

import java.util.Date;

import java.io.Serializable;
/**
 * <h3> 商品评论图片 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
public class CommentImage implements Serializable {
	/**   */
	private Long id;
	/** 商品评论ID  */
	private Long commentId;
	/** 图片地址  */
	private String src;
	/** 创建时间  */
	private Date createTime;

	//================================== Constructor =======================================//

	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id  
	 */ 
	public void setId(Long id){
		this.id = id;
	}

	/** 
	 * @return  
	 */ 
	public Long getId(){
		return id;
	}

	/** 
	 * @param commentId 商品评论ID 
	 */ 
	public void setCommentId(Long commentId){
		this.commentId = commentId;
	}

	/** 
	 * @return 商品评论ID 
	 */ 
	public Long getCommentId(){
		return commentId;
	}

	/** 
	 * @param src 图片地址 
	 */ 
	public void setSrc(String src){
		this.src = src;
	}

	/** 
	 * @return 图片地址 
	 */ 
	public String getSrc(){
		return src;
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
