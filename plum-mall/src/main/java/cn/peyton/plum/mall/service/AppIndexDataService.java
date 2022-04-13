package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.pojo.AppIndexData;

import java.util.List;

/**
 * <h3> 首页数据 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
public interface AppIndexDataService {

    List<AppIndexData> finds();

    List<AppIndexData> findByAppIndexCategoryId(int indexCategoryIe);

}
