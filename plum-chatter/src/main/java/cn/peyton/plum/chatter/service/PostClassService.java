package cn.peyton.plum.chatter.service;


import cn.peyton.plum.chatter.param.PostClassParam;

import java.util.List;

/**
 * <h3>文章分类 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface PostClassService {

    /**
     * <h4>查找所有文章分类</h4>
     * @return 文章分类传递类对象集合
     */
    List<PostClassParam> finds();


}
