package cn.peyton.plum.mall.pojo;

import cn.peyton.plum.core.utils.Lists;

import java.util.Date;

import java.io.Serializable;
import java.util.List;

/**
 * <h3> 商品评论 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
public class GoodsComment implements Serializable {
	/**   */
	private Long id;
	/** 评论父级ID,0为最高父级  */
	private Long parentId;
	/** 商品ID  */
	private Long goodsId;
	/** 会员ID  */
	private Member member;
	/** 评论数; 0为无评论  */
	private Integer commentNum;
	/** 评论内容  */
	private String content;
	/** 创建时间  */
	private Date createTime;
	/** 评论图片集合 */
	List<CommentImage> commentImages;

    //================================== Constructor =======================================//
    public GoodsComment() {
        if(null == commentImages){
            commentImages = Lists.newArrayList();
        }
    }
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
	 * @param parentId 评论父级ID,0为最高父级 
	 */ 
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	/** 
	 * @return 评论父级ID,0为最高父级 
	 */ 
	public Long getParentId(){
		return parentId;
	}

	/** 
	 * @param goodsId 商品ID 
	 */ 
	public void setGoodsId(Long goodsId){
		this.goodsId = goodsId;
	}

	/** 
	 * @return 商品ID 
	 */ 
	public Long getGoodsId(){
		return goodsId;
	}

	/** 
	 * @param member 会员ID 
	 */ 
	public void setMember(Member member){
		this.member = member;
	}

	/** 
	 * @return 会员ID 
	 */ 
	public Member getMember(){
		return member;
	}

	/** 
	 * @param commentNum 评论数; 0为无评论 
	 */ 
	public void setCommentNum(Integer commentNum){
		this.commentNum = commentNum;
	}

	/** 
	 * @return 评论数; 0为无评论 
	 */ 
	public Integer getCommentNum(){
		return commentNum;
	}

	/** 
	 * @param content 评论内容
	 */ 
	public void setContent(String content){
		this.content = content;
	}

	/** 
	 * @return 评论内容 
	 */ 
	public String getContent(){
		return content;
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
     * @return 评论图片集合
     */
    public List<CommentImage> getCommentImages() {
        return commentImages;
    }

    /**
     * @param commentImages 评论图片集合
     */
    public void setCommentImages(List<CommentImage> commentImages) {
        this.commentImages = commentImages;
    }
}
