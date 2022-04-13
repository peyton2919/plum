package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.core.utils.Maps;
import cn.peyton.plum.mall.bo.AdBo;
import cn.peyton.plum.mall.pojo.Ad;
import cn.peyton.plum.mall.service.AdService;
import cn.peyton.plum.mall.mapper.AdMapper;
import cn.peyton.plum.mall.vo.AdVo;
import cn.peyton.plum.mall.vo.LayoutVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <h3> 广告信息 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 10:05:56
 * @version 1.0.0
 * </pre>
*/
@Service("adService")
public class AdServiceImpl implements AdService {
	@Resource
	private AdMapper adMapper;

    @Override
    public Boolean updateByHotAndClickNum(Long id) {
        return adMapper.updateByHotAndClickNum(id) > 0 ? true : false;
    }

    @Override
    public AdVo findByTypeAndOne() {
        List<Ad> _ads = adMapper.findAllByType(0,1);
        return (null != _ads && _ads.size() > 0) ? new AdBo().compat(_ads.get(0))  : null;
    }

    @Override
    public List<AdVo> findByTypeAndThree() {

        return new AdBo().adapter(adMapper.findAllByType(1,1));
    }

    @Override
    public List<AdVo> findByTypeAndSwiper(Integer row) {

        return new AdBo().adapter(adMapper.findAllByType(2,row));
    }

    @Override
    public List<AdVo> findByTypeAndNav(Integer row) {

        return new AdBo().adapter(adMapper.findAllByType(3,row));
    }

    @Override
    public void getAds(Map<String, Object> map, Integer swiperRow, Integer navRow, String... types) {
        if (null != types && types.length > 0) {
            if (null == map){
                Maps.createHashMap();
            }
            LayoutVo _vo = null;
            for (int i = 0; i < types.length; i++) {
                if (LayoutVo.PROPERTY.NAV.equals(types[i])) {
                    _vo = new LayoutVo();
                    _vo.setType(LayoutVo.PROPERTY.NAV);
                    _vo.setAds(findByTypeAndNav(navRow));
                    map.put(LayoutVo.PROPERTY.NAV, _vo);
                }else if (LayoutVo.PROPERTY.ONE.equals(types[i])) {
                    _vo = new LayoutVo();
                    _vo.setType(LayoutVo.PROPERTY.ONE);
                    _vo.setAd(findByTypeAndOne());
                    map.put(LayoutVo.PROPERTY.ONE, _vo);
                }else if (LayoutVo.PROPERTY.THREE.equals(types[i])) {
                    _vo = new LayoutVo();
                    _vo.setType(LayoutVo.PROPERTY.THREE);
                    _vo.setAds(findByTypeAndThree());
                    map.put(LayoutVo.PROPERTY.THREE, _vo);
                }else if (LayoutVo.PROPERTY.SWIPER.equals(types[i])) {
                    _vo = new LayoutVo();
                    _vo.setType(LayoutVo.PROPERTY.SWIPER);
                    _vo.setAds(findByTypeAndSwiper(swiperRow));
                    map.put(LayoutVo.PROPERTY.SWIPER, _vo);
                }
            }
        }

    }
}
