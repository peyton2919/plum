package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.TopicParam;
import cn.peyton.plum.chatter.pojo.Topic;
import cn.peyton.plum.core.mybatis.utils.PageQuery;

import java.util.List;

/**
 * <h3>话题 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface TopicService {

    /**
     * <h4>获取指定话题分类下的话题列表</h4>
     * @param topicClassId 话题分类编号
     * @param page 分页对象
     * @return
     */
    List<TopicParam> findByTopicId(int topicClassId, PageQuery page);

    /**
     * <h4>获取 热门的话题 </h4>
     * @param topicClassId 话题分类编号
     * @param page 分页对象
     * @return
     */
    List<TopicParam> findByHot(int topicClassId,PageQuery page);

    /**
     * <h4>搜索话题</h4>
     * @param keyword 关键字
     * @param page 分页对象
     * @return
     */
    List<TopicParam> search(String keyword,PageQuery page);

}
