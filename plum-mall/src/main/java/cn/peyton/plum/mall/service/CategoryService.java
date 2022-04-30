package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.Category;

import java.util.List;

/**
 * <h3> 分类信息 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
public interface CategoryService {

    /**
     * <h4>查找所有分类</h4>
     * @return 分类集合
     */
    List<Category> finds();
}
