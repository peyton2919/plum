package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.CommentParam;

/**
 * <h3>文章评论 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
 */
public interface CommentService {

    /**
     * <h4>根据 文章评论 ID</h4>
     * @param id
     * @return
     */
    CommentParam findById(int id);


}
