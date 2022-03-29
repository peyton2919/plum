package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.TopicClassBo;
import cn.peyton.plum.chatter.mapper.TopicClassMapper;
import cn.peyton.plum.chatter.param.TopicClassParam;
import cn.peyton.plum.chatter.pojo.TopicClass;
import cn.peyton.plum.chatter.service.TopicClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>话题分类 Service 实现类 .servie.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("topicClassService")
public class TopicClassServiceImpl implements TopicClassService {
	@Resource
	private TopicClassMapper topicClassMapper;

    @Override
    public List<TopicClassParam> finds() {
        return new TopicClassBo().adapter(topicClassMapper.finds());
    }
}
