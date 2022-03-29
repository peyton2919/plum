package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.AdsenseParam;
import cn.peyton.plum.chatter.pojo.Adsense;
import cn.peyton.plum.chatter.service.AdsenseService;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.validator.constraints.Min;
import cn.peyton.plum.core.validator.constraints.Size;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>广告 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.controller.api.routine.AdsenseController.java
 * @create date: 2022/3/18 23:17
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class AdsenseController extends ChatterApiRoutineController<AdsenseParam,Integer> {

    @Resource
    private AdsenseService adsenseService;

    @PostMapping("/adsense")
    public JSONResult<List<AdsenseParam>> findByType(
            @Size(min = 0,max=1,message = "数值超出限制范围！") Integer type,
            @Min(message = "要大于0的数！")Integer pageNo) {
        return JSONResult.success(adsenseService.findByType(type,new PageQuery(pageNo)));
    }

}
