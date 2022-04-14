package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.CommentImage;

import java.util.List;

/**
 * <h3> 商品评论图片 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
public interface CommentImageService {

    /**
     * <h4>根据评论 查找 图片集合</h4>
     * @param commentId 评论ID
     * @return 评论图片集合
     */
    List<CommentImage> findByCommentId(Long commentId);

}
