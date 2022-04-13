package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.GoodsBanner;
import cn.peyton.plum.mall.service.GoodsBannerService;
import cn.peyton.plum.mall.mapper.GoodsBannerMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 轮播图 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Service("goodsBannerService")
public class GoodsBannerServiceImpl implements GoodsBannerService {
	@Resource
	private GoodsBannerMapper goodsBannerMapper;


    @Override
    public List<GoodsBanner> findByGoodsId(Long goodsId) {
        return goodsBannerMapper.findByGoodsId(goodsId);
    }
}
