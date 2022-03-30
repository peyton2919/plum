package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.BlackListParam;

/**
 * <h3>拉黑 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface BlackListService {

    /**
     * <h4>添加黑名单</h4>
     * @param param 黑名单对象
     * @return true 表示 添加成功; false 表示 取反;
     */
    boolean add(BlackListParam param);

    /**
     * <h4>判断 是否已拉黑</h4>
     * @param userId 用户ID
     * @param blackId 拉黑用户ID
     * @return true 表示 已拉黑; false 表示 取反
     */
    boolean isUserIdAndBlackId(Integer userId, Integer blackId);

    /**
     * <h4>删除已拉黑</h4>
     * @param userId 用户ID
     * @param blackId 拉黑用户ID
     * @return true 表示 删除成功; false 表示 取反
     */
    boolean delete(Integer userId, Integer blackId);
}
