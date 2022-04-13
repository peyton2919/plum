package cn.peyton.plum.chatter.param;

import cn.peyton.plum.chatter.bo.PostBo;
import cn.peyton.plum.chatter.pojo.Images;
import cn.peyton.plum.chatter.pojo.Post;
import cn.peyton.plum.chatter.pojo.User;
import cn.peyton.plum.core.utils.Lists;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import cn.peyton.plum.core.validator.constraints.Size;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <h3>文章 参数 传递类[用来展示数据]类 .param</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class PostParam implements Serializable {
	/** 编号  */
	private Integer id;
	/** 发布人  */
	private UserParam userParam;
	/** 标题  */
	private String title;
	/** 标题图片  */
	private String titlePic;
	/** 内容  */
	@NotBlank(message = "内容不能为空！")
	private String content;
	/** 分享数  */
	private Integer shareNum;
	/** 路径  */
	private String path;
	/** 0 图文 1分享  */
	private Integer type;
	/** 创建时间  */
	private Date createTime;
	/** post类型编号  */
	private Integer postClassId;
	/** 分享文章对象 当type类型为1时,在查找文章  */
	private PostParam sharePostParam;
	/** 1开放，0仅自己可见  */
	@NotBlank(message = "可见方式不能为空！")
    @Size(min = 0,max = 1,message = "数字超出限制范围!")
	private Integer isOpen;
    /** 图片集合 */
    private List<Images> imageList;
    /** 评论数 */
    private Integer commentCount;
    /** 顶  */
    private Integer ding;
    /** 踩  */
    private Integer cai;

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
	 * @param userParam 发布人
	 */
    public void setUserParam(UserParam userParam) {
        this.userParam = userParam;
    }

	/** 
	 * @return 发布人 
	 */
    public UserParam getUserParam() {
        return userParam;
    }

    /**
	 * @param title 标题 
	 */ 
	public void setTitle(String title){
		this.title = title;
	}

	/** 
	 * @return 标题 
	 */ 
	public String getTitle(){
		return title;
	}

	/** 
	 * @param titlePic 标题图片 
	 */ 
	public void setTitlePic(String titlePic){
		this.titlePic = titlePic;
	}

	/** 
	 * @return 标题图片 
	 */ 
	public String getTitlePic(){
		return titlePic;
	}

	/** 
	 * @param content 内容 
	 */ 
	public void setContent(String content){
		this.content = content;
	}

	/** 
	 * @return 内容 
	 */ 
	public String getContent(){
		return content;
	}

	/** 
	 * @param shareNum 分享数 
	 */ 
	public void setShareNum(Integer shareNum){
		this.shareNum = shareNum;
	}

	/** 
	 * @return 分享数 
	 */ 
	public Integer getShareNum(){
		return shareNum;
	}

	/** 
	 * @param path 路径 
	 */ 
	public void setPath(String path){
		this.path = path;
	}

	/** 
	 * @return 路径 
	 */ 
	public String getPath(){
		return path;
	}

	/** 
	 * @param type 0 图文 1分享 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 0 图文 1分享 
	 */ 
	public Integer getType(){
		return type;
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
	 * @param postClassId post类型编号 
	 */ 
	public void setPostClassId(Integer postClassId){
		this.postClassId = postClassId;
	}

	/** 
	 * @return post类型编号 
	 */ 
	public Integer getPostClassId(){
		return postClassId;
	}

	/** 
	 * @param sharePostParam 分享文章对象 当type类型为1时,在查找文章
	 */
    public void setSharePostParam(PostParam sharePostParam) {
        this.sharePostParam = sharePostParam;
    }

    /**
	 * @return 分享文章对象 当type类型为1时,在查找文章
	 */
    public PostParam getSharePostParam() {
        return sharePostParam;
    }

    /**
	 * @param isOpen 1开放，0仅自己可见 
	 */ 
	public void setIsOpen(Integer isOpen){
		this.isOpen = isOpen;
	}

	/** 
	 * @return 1开放，0仅自己可见 
	 */ 
	public Integer getIsOpen(){
		return isOpen;
	}

    /**
     * @return 图片集合
     */
    public List<Images> getImageList() {
        return imageList;
    }

    /**
     * @param imageList 图片集合
     */
    public void setImageList(List<Images> imageList) {
        if (null == imageList){ imageList= Lists.newArrayList(); }
        this.imageList = imageList;
    }

    /**
     * @return 顶
     */
    public Integer getDing() {
        return ding;
    }

    /**
     * @param ding 顶
     */
    public void setDing(Integer ding) {
        this.ding = ding;
    }
    /**
     * @return 踩
     */
    public Integer getCai() {
        return cai;
    }

    /**
     * @param cai 踩
     */
    public void setCai(Integer cai) {
        this.cai = cai;
    }

    /**
     * @return 评论数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount 评论数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
	 * <h4>对象转成Post对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,userId,title,titlePic,content,shareNum,path,type,createTime,postClassId,shareId,isOpen]
	 * </pre>
	 */
	public Post convert(){
		Post post = new Post();
		post.setId(id);
		post.setUser(userParam.convert());
		post.setTitle(title);
		post.setTitlePic(titlePic);
		post.setContent(content);
		post.setShareNum(shareNum);
		post.setPath(path);
		post.setType(type);
		post.setCreateTime(createTime);
		post.setPostClassId(postClassId);
		post.setSharePost(new PostBo().convert(getSharePostParam()));
		post.setIsOpen(isOpen);
		// post.setImageList(imageList);
		return post;
	} 
	/**
	 * <h4>Post对象转成PostParam对象<h4> 
	 * <pre>
	 * 	 转换字段如下:
	 * 	 [id,userId,title,titlePic,content,shareNum,path,type,createTime,postClassId,shareId,isOpen]
	 * </pre>
	 */
	public PostParam compat(Post post){
		if(null == post){
			return new PostParam();
		}
		this.setId(post.getId());
		this.setUserParam(new UserParam().compat(post.getUser()));
		this.setTitle(post.getTitle());
		this.setTitlePic(post.getTitlePic());
		this.setContent(post.getContent());
		this.setShareNum(post.getShareNum());
		this.setPath(post.getPath());
		this.setType(post.getType());
		this.setCreateTime(post.getCreateTime());
		this.setPostClassId(post.getPostClassId());
		this.setSharePostParam(new PostBo().compat(post.getSharePost()));
		this.setIsOpen(post.getIsOpen());
		// this.setImageList(post.getImageList());
		return this;
	} 
}
