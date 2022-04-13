package cn.peyton.plum.controller.mall.api.routine;

import cn.peyton.plum.controller.route.MallApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.utils.Maps;
import cn.peyton.plum.mall.service.AdService;
import cn.peyton.plum.mall.vo.AdVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <h3> 广告信息 Controller 类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:00
 * @version 1.0.0
 * </pre>
*/
@RestController
public final class AdController extends MallApiRoutineController<AdVo,Long> {

	@Resource
	private AdService adService;

    @Override
    @GetMapping("indexad")
    public JSONResult index() {
        Map<String,Object> map = Maps.createHashMap();
        //调用广告方法
        String[] _types = {"one", "three", "swiper", "nav"};
        adService.getAds(map,2,10,_types);
        return JSONResult.success(map);
    }
}
