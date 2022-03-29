package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.PostClassBo;
import cn.peyton.plum.chatter.mapper.PostClassMapper;
import cn.peyton.plum.chatter.param.PostClassParam;
import cn.peyton.plum.chatter.pojo.PostClass;
import cn.peyton.plum.chatter.service.PostClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>文章分类 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("postClassService")
public class PostClassServiceImpl implements PostClassService {
	@Resource
	private PostClassMapper postClassMapper;

    @Override
    public List<PostClassParam> finds() {
        return new PostClassBo().adapter(postClassMapper.finds());
    }
}
