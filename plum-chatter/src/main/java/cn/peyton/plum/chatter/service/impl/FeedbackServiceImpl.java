package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.FeedbackBo;
import cn.peyton.plum.chatter.mapper.FeedbackMapper;
import cn.peyton.plum.chatter.param.FeedbackParam;
import cn.peyton.plum.chatter.service.FeedbackService;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>意见反馈 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService {
	@Resource
	private FeedbackMapper feedbackMapper;

    @Override
    public boolean create(FeedbackParam param) {
        return feedbackMapper.insertSelective(param.convert()) > 0 ? true : false;
    }

    @Override
    public List<FeedbackParam> finds(PageQuery page) {
        return new FeedbackBo().adapter(feedbackMapper.finds(page));
    }
}
