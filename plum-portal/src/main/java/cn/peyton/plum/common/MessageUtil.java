package cn.peyton.plum.common;

import cn.peyton.plum.core.utils.StringUtil;

import java.io.Serializable;

/**
 * <h3>消息模板 工具类 .util</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.common.Messageutil.java
 * @create date: 2022-04-01 10:07
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class MessageUtil implements Serializable {

    /**
     * <h4>创建短信模板</h4>
     * @param value
     * @return
     */
    public static String createSMSTemplate(String value) {
        if (StringUtil.isEmpty(value)) {
            return value;
        }
        StringBuilder _sb = new StringBuilder();
        _sb.append("[社区论坛]验证码: {");
        _sb.append(value);
        _sb.append("} 此验证码仅用手机登录 XXX 社区论坛。请忽将验证码提供给他人，否则可能导致资产损失。");
        return _sb.toString();
    }
}
