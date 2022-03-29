package cn.peyton.plum.chatter.dto;

import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.core.utils.StringUtil;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.dto.UserDto.java
 * @create date: 2021/12/14 23:00
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Component
public class UserDto implements Serializable {

    /**
     * <h4>登录验证</h4>
     * <pre>
     *
     * </pre>
     * @param param 用户对象
     * @param errorMap 验证错误的集合
     * @return 返回 false 为验证不通过
     */
    public static boolean loginValidate(UserParam param, Map<String,String> errorMap) {

        if (StringUtil.isEmpty(param.getUsername())) {
            errorMap.put("username", "请输入用户名称！");
            return false;
        }
        if (StringUtil.isEmpty(param.getPassword())) {
            errorMap.put("password", "请输入用户密码！");
            return false;
        }
        return true;
    }
}
