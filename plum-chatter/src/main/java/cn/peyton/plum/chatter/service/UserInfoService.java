package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.UserInfoParam;

/**
 * <h3>用户基础 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface UserInfoService {

    /**
     *
     * @param param
     * @return
     */
    boolean updateUserInfo(UserInfoParam param);

}
