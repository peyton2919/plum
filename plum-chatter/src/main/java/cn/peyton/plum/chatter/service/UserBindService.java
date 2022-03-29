package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.UserBindParam;
import cn.peyton.plum.chatter.param.UserInfoParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.pojo.UserBind;

import java.util.List;

/**
 * <h3>用户绑定 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface UserBindService {

    /**
     * <h4>判断 第三方账号 是否被 他人绑定</h4>
     *
     * @param userId 用户编号
     * @param type   账号类型 {qq,weixin,xinaweibo}
     * @param openId 第三方账号
     * @return true 表示 可用 没有绑定过; false 表示 取反;
     */
    boolean isBindOther(int userId, String openId, String type);

    /**
     * <h4>插入 用户绑定</h4>
     * @param param 用户绑定传参对象
     * @return true 表示 插入成功; false表示 取反;
     */
    boolean insert(UserBindParam param);

    /**
     * <h>根据用户编号 查找 用户绑定对象</h>
     * @param id 用户编号
     * @return
     */
    List<UserBindParam> findByUserId(Integer id);


}
