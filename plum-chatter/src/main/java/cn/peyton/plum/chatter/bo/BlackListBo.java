package cn.peyton.plum.chatter.bo;

import cn.peyton.plum.chatter.param.BlackListParam;
import cn.peyton.plum.chatter.pojo.BlackList;
import cn.peyton.plum.core.base.BaseConvertBo;

/**
 * <h3>拉黑 转换类 .bo</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.chatter.bo.BlackListBo.java
 * @create date: 2022/3/30 22:11
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class BlackListBo extends BaseConvertBo<BlackListParam, BlackList> {
    @Override
    public BlackListParam compat(BlackList info) {
        return new BlackListParam().compat(info);
    }

    @Override
    public BlackList convert(BlackListParam info) {
        return info.convert();
    }
}
