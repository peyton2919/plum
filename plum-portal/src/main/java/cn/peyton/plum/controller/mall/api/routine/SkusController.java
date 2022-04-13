package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.mall.service.SkuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

/**
 * <h3> 商品规格 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
@Controller
@RequestMapping("/")
public class SkusController {

	@Resource
	private SkuService skuService;

}
