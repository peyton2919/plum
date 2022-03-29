package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.TopicBo;
import cn.peyton.plum.chatter.mapper.TopicMapper;
import cn.peyton.plum.chatter.param.TopicParam;
import cn.peyton.plum.chatter.service.TopicService;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>话题 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("topicService")
public class TopicServiceImpl implements TopicService {
	@Resource
	private TopicMapper topicMapper;

    @Override
    public List<TopicParam> findByTopicId(int topicClassId, PageQuery page) {
        return new TopicBo().adapter(topicMapper.findByTopicClassId(topicClassId,page));
    }

    @Override
    public List<TopicParam> findByHot(int topicClassId, PageQuery page) {
        return new TopicBo().adapter(topicMapper.findByHot(topicClassId,page));
    }

    @Override
    public List<TopicParam> search(String keyword, PageQuery page) {
        return new TopicBo().adapter(topicMapper.search(keyword,page));
    }

}
