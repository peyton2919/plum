package cn.peyton.plum.mall.service;

import cn.peyton.plum.mall.vo.AdVo;

import java.util.List;
import java.util.Map;

/**
 * <h3> 广告信息 Service 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 10:05:56
 * @version 1.0.0
 * </pre>
*/
public interface AdService {

    /**
     * <h4>更新点击数和热度数</h4>
     * @param id 广告ID
     * @return true 成功 false 失败
     */
    Boolean updateByHotAndClickNum(Long id);

    /**
     * <h4></h4>
     * @return 广告对象
     */
    AdVo findByTypeAndOne();

    /**
     * <h4></h4>
     * @return 广告对象集合
     */
    List<AdVo> findByTypeAndThree();

    /**
     * <h4></h4>
     * @param row 查找行数(返回几条数据)
     * @return 广告对象集合
     */
    List<AdVo> findByTypeAndSwiper(Integer row);

    /**
     * <h4></h4>
     * @param row 查找行数(返回几条数据)
     * @return 广告对象集合
     */
    List<AdVo> findByTypeAndNav(Integer row);

    /**
     * <h4>根据条件获取广告对象</h4>
     * @param map 接收的集合
     * @param swiperRow 轮播图的数量
     * @param navRow 导航栏的数量
     * @param types 需要查找的类型{one,three,nav,three,swiper},赋值在 map 集合中
     */
    void getAds(Map<String, Object> map, Integer swiperRow, Integer navRow, String... types);

}
