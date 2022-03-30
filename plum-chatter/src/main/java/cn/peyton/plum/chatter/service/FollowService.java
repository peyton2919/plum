package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.BlackListParam;
import cn.peyton.plum.chatter.param.FollowParam;
import cn.peyton.plum.core.mybatis.utils.PageQuery;

import java.util.List;

/**
 * <h3>粉丝关注 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface FollowService {


    /**
     * <h4>根据用户编号 查找 粉丝集合</h4>
     * @param userId 用户 编号
     * @return 粉丝集合
     */
    List<FollowParam> findByUserId(int userId);

    /**
     * <h4>判断是否关注过</h4>
     * @param followId 粉丝编号
     * @param userId 用户编号
     * @return true 表示 有关注过; false 表示 取反;
     */
    boolean isFollow(int followId, int userId);

    /**
     * <h4>保存 关注对象</h4>
     * @param userId
     * @param followId
     * @return true 表示 成功; false 表示 取反;
     */
    boolean save(int userId,int followId);
    /**
     * <h4>删除 关注对象</h4>
     * @param userId
     * @param followId
     * @return true 表示 成功; false 表示 取反;
     */
    boolean delete(int userId,int followId);

    /**
     * <h4>互关列表</h4>
     * @param userId 用户ID
     * @param page 分页对象
     * @return 互关列表
     */
    List<FollowParam> friends(Integer userId, PageQuery page);

    /**
     * <h4>粉丝、关注列表</h4>
     * <pre>
     *     fens = true
     *     where follow_id = #{userId}
     *     fens = false
     *     where user_id = #{userId}
     * </pre>
     *
     * @param userId 用户ID
     * @param page   分页对象
     * @param fens   true 表示 粉丝列表; false 表示 关注列表
     * @return 互关列表
     */
    List<FollowParam> follows(Integer userId, PageQuery page, boolean fens);
}
