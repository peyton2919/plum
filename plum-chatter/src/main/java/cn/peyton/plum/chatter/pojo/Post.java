package cn.peyton.plum.chatter.pojo;

import cn.peyton.plum.core.utils.Lists;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <h3>文章 实体类 .pojo</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public class Post implements Serializable {
	/** 编号  */
	private Integer id;
	/** 发布人  */
	private User user;
	/** 标题  */
	private String title;
	/** 标题图片  */
	private String titlePic;
	/** 内容  */
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
	private Post sharePost;
	/** 1开放，0仅自己可见  */
	private Integer isOpen;
    /** 图片集合 */
	private List<Images> imageList;

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
	 * @param user 发布人
	 */ 
	public void setUser(User user){
		this.user = user;
	}

	/** 
	 * @return 发布人 
	 */ 
	public User getUser(){
		return user;
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
	 * @param sharePost 分享文章对象 当type类型为1时,在查找文章
	 */
    public void setSharePost(Post sharePost) {
        this.sharePost = sharePost;
    }

    /**
	 * @return 共享编号 分享文章对象 当type类型为1时,在查找文章
	 */
    public Post getSharePost() {
        return sharePost;
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
}
