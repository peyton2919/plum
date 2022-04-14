package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.CommentImage;
import cn.peyton.plum.mall.service.CommentImageService;
import cn.peyton.plum.mall.mapper.CommentImageMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 商品评论图片 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
@Service("commentImageService")
public class CommentImageServiceImpl implements CommentImageService {
	@Resource
	private CommentImageMapper commentImageMapper;

    @Override
    public List<CommentImage> findByCommentId(Long commentId) {
        return commentImageMapper.findByCommentId(commentId);
    }
}
