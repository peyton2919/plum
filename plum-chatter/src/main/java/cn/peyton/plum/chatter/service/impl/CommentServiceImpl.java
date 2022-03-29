package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.CommentBo;
import cn.peyton.plum.chatter.mapper.CommentMapper;
import cn.peyton.plum.chatter.param.CommentParam;
import cn.peyton.plum.chatter.pojo.Comment;
import cn.peyton.plum.chatter.service.CommentService;
import cn.peyton.plum.core.exception.child.TransactionalException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>文章评论 Service 实现类 .servic.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	@Resource
	private CommentMapper commentMapper;

    @Override
    public CommentParam findById(int id) {
        return new CommentParam().compat(commentMapper.selectByPrimaryKey(id));
    }

    @Override
    public boolean isCommentByFId(Integer fId) {
        return commentMapper.checkCommentByFId(fId) > 0 ? true : false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public CommentParam create(CommentParam param) {
        Comment _comment = param.convert();
        if ( commentMapper.insertSelective(_comment)> 0) {
            commentMapper.updateFnumInt(param.getFId());
            return new CommentParam().compat(_comment);
        }
        return null;
    }

    @Override
    public boolean isCommentByFIdAndPostId(Integer fId, Integer postId) {
        return commentMapper.checkCommentByFIdAndPostId(fId,postId) > 0 ? true : false;
    }

    @Override
    public boolean updateFnumInt(int id) {
        return commentMapper.updateFnumInt(id) > 0 ? true : false;
    }

    @Override
    public List<CommentParam> findByPostId(Integer postId) {
        return new CommentBo().adapter(commentMapper.findByPostId(postId));
    }
}
