package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.controller.route.MallApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.utils.Maps;
import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.pojo.GoodsAttr;
import cn.peyton.plum.mall.pojo.GoodsSkuCard;
import cn.peyton.plum.mall.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <h3> 商品信息 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@RestController
public class GoodsController extends MallApiRoutineController {

	@Resource
	private GoodsService goodsService;
	@Resource
    GoodsBannerService goodsBannerService;
	@Resource
    GoodsAttrService goodsAttrService;
	@Resource
    GoodsSkuCardService goodsSkuCardService;
	@Resource
    GoodsCommentService goodsCommentService;
	@Resource
    GoodsSkuService goodsSkuService;

	@GetMapping("/detail")
	public JSONResult detail(@RequestParam("goodsId") Long goodsId){
        Map<String,Object> map = Maps.createHashMap();
        Goods _goods = goodsService.findById(goodsId);
        if (null == _goods) {
            return JSONResult.fail("没找到商品");
        }
        map.put("goods", _goods);
        map.put("goodsComments", goodsCommentService.findByGoodsId(goodsId,"all",new PageQuery(1)));
        map.put("hotList",goodsService.findByHotAndRandTopNumber(_goods.getCategoryId(),4));
        map.put("goodsBanners", goodsBannerService.findByGoodsId(goodsId));
        // goodsSkus
        map.put("goodsSkus", goodsSkuService.findByGoodsId(goodsId));
        map.put("goodsSkuCards", goodsSkuCardService.findByGoodsId(goodsId));
        map.put("goodsAttrs", goodsAttrService.findByGoodsId(goodsId));
        // 少个goodsSkus

        return JSONResult.success(map);
    }

    @PostMapping("/goods/search")
    public JSONResult findByMulti(String keyword, String type, String order, Integer pageNo) {

        return JSONResult.success(goodsService.findByMulti(keyword, type, order, new PageQuery(pageNo)));
    }
}
