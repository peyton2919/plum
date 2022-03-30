package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.mapper.UserInfoMapper;
import cn.peyton.plum.chatter.param.UserInfoParam;
import cn.peyton.plum.chatter.pojo.UserInfo;
import cn.peyton.plum.chatter.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3>用户基础 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoMapper userInfoMapper;

    @Override
    public boolean updateUserInfo(UserInfoParam param) {
        UserInfo userInfo = userInfoMapper.findByUserId(param.convert().getUserId());
        int result = 0;
        if (null == userInfo) {
            result = userInfoMapper.insertSelective(param.convert());
        }else {
            param.setId(userInfo.getId());
            result = userInfoMapper.updateByPrimaryKeySelective(param.convert());
        }
        return result > 0 ? true : false;
    }

    @Override
    public UserInfoParam findByUserId(Integer usrId) {
        return new UserInfoParam().compat(userInfoMapper.findByUserId(usrId));
    }
}
