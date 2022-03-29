package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.mapper.CommentMapper;
import cn.peyton.plum.chatter.param.CommentParam;
import cn.peyton.plum.chatter.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
