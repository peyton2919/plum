package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.UserBo;
import cn.peyton.plum.chatter.mapper.UserMapper;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.pojo.User;
import cn.peyton.plum.chatter.service.UserService;
import cn.peyton.plum.core.base.BaseCipher;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>用户 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("userService")
public class UserServiceImpl implements UserService {

    /** MD5 加密 key */
    private final static String KEY_PASSWORD_ENCODER = "userControllerPassword";
	@Resource
	private UserMapper userMapper;

    @Override
    public String encryptPW(String pw) {
        return BaseCipher.encoderMD5(pw,KEY_PASSWORD_ENCODER);
    }

    @Override
    public UserParam reg(UserParam param) {
        // 密码加密
        param.setPassword(BaseCipher.encoderMD5(param.getPassword(),KEY_PASSWORD_ENCODER));
        User user = param.convert();
        int result = userMapper.insertSelective(user);
        //判断插入数据成功，给用户参数对象赋值，其中把密码 设 空
        if(result>0){
            param.setId(user.getId());
            param.setPassword("");
            param.setConfirmPwd("");
            //todo 并注册 userInfo

        }
        return (result>0)?param:null;
    }

    @Override
    public UserParam findByPhone(String phone) {
        User user = userMapper.findByPhone(phone);
        return (null != user) ? new UserParam().compat(user) : null;
    }

    @Override
    public UserParam login(String username, String password) {

        return new UserBo().compat(userMapper.login(username,
                BaseCipher.encoderMD5(password,KEY_PASSWORD_ENCODER)));
    }

    @Override
    public boolean isStatus(String keyword, String type,Integer status) {
        return userMapper.checkStatus(keyword,type,status) > 0 ? true : false;
    }

    @Override
    public boolean isRename(String username) {
        return userMapper.checkRename(username) > 0 ? true:false;
    }

    @Override
    public boolean isPassword(String username, String password) {
        return false;
    }

    @Override
    public boolean otherLoginIsBindPhone(UserParam param) {
        return false;
    }

    @Override
    public List<UserParam> search(String keyword, PageQuery page) {
        return new UserBo().adapter(userMapper.search(keyword,page));
    }

    @Override
    public boolean updatePhone(UserParam param) {
        return userMapper.updatePhone(param.convert()) > 0 ? true : false;
    }

    @Override
    public boolean updateEmail(UserParam param) {
        return userMapper.updateEmail(param.convert()) > 0 ? true : false;
    }

    @Override
    public boolean isBindPhone(Integer userId, String phone) {
        return userMapper.checkBindPhone(userId, phone) > 0 ? true : false;
    }

    @Override
    public boolean isBindEmail(Integer userId, String email) {
        return userMapper.checkBindEmail(userId,email) > 0 ? true : false;
    }

    @Override
    public boolean updateUserPic(Integer id, String userPic) {
        return userMapper.updateUserPic(id, userPic) > 0 ? true : false;
    }

    @Override
    public boolean updatePassword(Integer id, String password) {
        return userMapper.updatePassword(id, encryptPW(password)) > 0 ? true : false;
    }

    @Override
    public boolean isUserId(Integer userId) {
        return userMapper.checkUserId(userId) > 0 ? true : false;
    }

    @Override
    public String findPasswordById(Integer id,String oldPassword) {
        String _pw = userMapper.findPasswordById(id);
        if (null == _pw) { return null; }
        if (_pw.equals(BaseCipher.encoderMD5(oldPassword,KEY_PASSWORD_ENCODER))){
            return _pw;
        }
        return null;
    }


}
