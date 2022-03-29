package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.AdsenseParam;
import cn.peyton.plum.chatter.pojo.Adsense;
import cn.peyton.plum.core.mybatis.utils.PageQuery;

import java.util.List;

/**
 * <h3> 广告 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface AdsenseService {

    /**
     * <h4>根据 类型 查找 广告对象集合</h4>
     * @param type 类型
     * @param page 分页对象
     * @return
     */
    List<AdsenseParam> findByType(Integer type, PageQuery page);

}
