package cn.peyton.plum.chatter.mapper;

import cn.peyton.plum.core.mybatis.utils.PageQuery;

import java.util.List;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.mapper.BaseMapper.java
 * @create date: 2022/3/17 17:46
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public interface BaseMapper<T,K> {

    List<T> finds(PageQuery pageQuery);
}
