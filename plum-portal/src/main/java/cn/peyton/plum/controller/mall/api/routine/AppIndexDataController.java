package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.controller.route.MallApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.mall.service.AppIndexDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h3> 首页数据 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
@RestController
public class AppIndexDataController extends MallApiRoutineController {

	@Resource
	private AppIndexDataService appIndexDataService;

    @GetMapping("/indexdata")
    public JSONResult index(){
        return JSONResult.success(appIndexDataService.finds());
    }

}
