package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.controller.route.MallApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.utils.Maps;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.constraints.Min;
import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.service.GoodsCommentService;
import cn.peyton.plum.mall.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <h3> 商品评论 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
@RestController
public final class GoodsCommentController extends MallApiRoutineController {

	@Resource
	private GoodsCommentService goodsCommentService;
	@Resource
    GoodsService goodsService;

    @GetMapping("/comment/goodsid")
    @Valid
    public JSONResult findByGoodsId(
            @Min(message = "商品编号要大于0的数！")Long goodsId,
            @Min(message = "分页数要大于0的数！")Integer pageNo,String commentType) {

        Goods _goods = goodsService.findCommentGoodRateAndTotalById(goodsId);
        if (null == _goods) {
            return JSONResult.fail("商品ID出错了");
        }
        Map<String,Object> _map = Maps.createHashMap();
        _map.put("total", _goods.getReviewCount());
        _map.put("goodRate", _goods.getRating());
        _map.put("list", goodsCommentService.findByGoodsId(goodsId, commentType, new PageQuery(pageNo)));

        return JSONResult.success(_map);
    }


}
