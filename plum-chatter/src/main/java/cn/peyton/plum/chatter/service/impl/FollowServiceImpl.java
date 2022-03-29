package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.FollowBo;
import cn.peyton.plum.chatter.mapper.FollowMapper;
import cn.peyton.plum.chatter.param.FollowParam;
import cn.peyton.plum.chatter.pojo.Follow;
import cn.peyton.plum.chatter.service.FollowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>粉丝关注 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("followService")
public class FollowServiceImpl implements FollowService {
	@Resource
	private FollowMapper followMapper;

    @Override
    public List<FollowParam> findByUserId(int userId) {
        return new FollowBo().adapter(followMapper.findByUserId(userId));
    }

    @Override
    public boolean isFollow(int followId, int userId) {
        return followMapper.checkFollow(followId, userId) > 0 ? true : false;
    }

    @Override
    public boolean save(int userId,int followId) {
        Follow _follow = new Follow();
        _follow.getFollowUser().setId(followId);
        _follow.setUserId(userId);
        return followMapper.insertSelective(_follow) > 0 ? true : false;
    }

    @Override
    public boolean delete(int userId, int followId) {
        return followMapper.deleteByUserIdAndFollowId(userId, followId) > 0 ? true : false;
    }
}
