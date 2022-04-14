package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.mall.service.SkuGoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

/**
 * <h3> 规格商品类型 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 20:36:28
 * @version 1.0.0
 * </pre>
*/
@Controller
@RequestMapping("/")
public class SkuGoodsTypeController {

	@Resource
	private SkuGoodsTypeService skuGoodsTypeService;

}
