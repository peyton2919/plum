package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.controller.route.MallApiRoutineController;

import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.utils.Lists;
import cn.peyton.plum.core.utils.Maps;
import cn.peyton.plum.mall.pojo.AppIndexCategory;
import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.service.AdService;
import cn.peyton.plum.mall.service.AppIndexCategoryService;
import cn.peyton.plum.mall.service.AppIndexDataService;
import cn.peyton.plum.mall.service.GoodsService;
import cn.peyton.plum.mall.vo.AdVo;
import cn.peyton.plum.mall.vo.GoodsHotVo;
import cn.peyton.plum.mall.vo.LayoutVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * <h3> 首页分类 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
@RestController
public class AppIndexCategoryController extends MallApiRoutineController {

	@Resource
	private AppIndexCategoryService appIndexCategoryService;
	@Resource
    AppIndexDataService appIndexDataService;
	@Resource
    AdService adService;
	@Resource
    GoodsService goodsService;

	@GetMapping("/indexcategory")
	public JSONResult index(int pageNo){

        List<AppIndexCategory> categorys = appIndexCategoryService.finds();
        // List<AppIndexData> indexDatas = appIndexDataService.findByAppIndexCategoryId(1);
        Map<String,Object> map = Maps.createHashMap();
        map.put("category",categorys);

        //调用广告方法
        String[] _types = {"one", "three", "swiper", "nav"};
        adService.getAds(map,2,10,_types);
        // 数据
        List<GoodsHotVo> _goods = goodsService.findByHot(0,new PageQuery(pageNo));

        map.put("goods", _goods);
	    return JSONResult.success(map);
    }

    @GetMapping("/indexhot")
    public JSONResult findByHot(Integer categoryId,int pageNo) {
        Map<String, Object> _map = Maps.createHashMap();
        _map.put("goods", goodsService.findByHot(categoryId, new PageQuery(pageNo)));
        return JSONResult.success(_map);
    }

}
