package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.PostBo;
import cn.peyton.plum.chatter.mapper.PostMapper;
import cn.peyton.plum.chatter.param.PostParam;
import cn.peyton.plum.chatter.pojo.Post;
import cn.peyton.plum.chatter.service.PostService;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>文章 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("postService")
public class PostServiceImpl implements PostService {

	@Resource
	private PostMapper postMapper;

    @Override
    public List<PostParam> findByClassId(int postClassId, PageQuery page) {
        //
        return new PostBo().adapter(postMapper.findByClassId(postClassId,page));
    }

    @Override
    public List<PostParam> search(String keyword, PageQuery page) {

        return new PostBo().adapter(postMapper.search(keyword,page));
    }

    @Override
    public PostParam findByPrimaryKey(Integer id) {
        return new PostBo().compat(postMapper.selectByPrimaryKey(id));
    }

    @Override
    public List<PostParam> findByTopicId(int topicId, PageQuery page) {
        return new PostBo().adapter(postMapper.findByTopicId(topicId,page));
    }

    @Override
    public List<PostParam> findByUserId(int userId, PageQuery page) {
        return new PostBo().adapter(postMapper.findByUserId(userId,page));
    }

    @Override
    public List<PostParam> findByPKUserId(int userId, PageQuery page) {
        return new PostBo().adapter(postMapper.findByPKUserId(userId,page));
    }
}
