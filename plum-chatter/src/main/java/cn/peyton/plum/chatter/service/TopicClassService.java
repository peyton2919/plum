package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.TopicClassParam;

import java.util.List;

/**
 * <h3>话题分类 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface TopicClassService {
    /**
     * <h4>获取话题分类</h4>
     * @return 话题对象集合
     */
    List<TopicClassParam> finds();

}
