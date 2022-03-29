package cn.peyton.plum.chatter.service.impl;


import cn.peyton.plum.chatter.bo.UserBindBo;
import cn.peyton.plum.chatter.mapper.UserBindMapper;
import cn.peyton.plum.chatter.param.UserBindParam;
import cn.peyton.plum.chatter.pojo.UserBind;
import cn.peyton.plum.chatter.service.UserBindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>用户绑定 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("userBindService")
public class UserBindServiceImpl implements UserBindService {
	@Resource
	private UserBindMapper userBindMapper;

    @Override
    public boolean isBindOther(int userId, String openId, String type) {

        return userBindMapper.checkBindOther(userId, openId, type) > 0 ? true : false;
    }

    @Override
    public boolean insert(UserBindParam param) {
        UserBind userBind = param.convert();
        return userBindMapper.insertSelective(userBind) > 0 ? true : false;
    }

    @Override
    public List<UserBindParam> findByUserId(Integer id) {
        return new UserBindBo().adapter(userBindMapper.findByUserId(id));
    }
}
