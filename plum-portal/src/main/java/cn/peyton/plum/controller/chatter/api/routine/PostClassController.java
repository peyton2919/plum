package cn.peyton.plum.controller.chatter.api.routine;


import cn.peyton.plum.chatter.param.PostClassParam;
import cn.peyton.plum.chatter.param.PostParam;
import cn.peyton.plum.chatter.pojo.PostClass;
import cn.peyton.plum.chatter.service.PostClassService;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>文章分类 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.controller.api.routine.PostClassController.java
 * @create date: 2022/3/17 17:08
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class PostClassController extends ChatterApiRoutineController<PostClassParam,Integer> {

    @Resource
    private PostClassService postClassService;

    // 获取所有文章分类
    @PostMapping("/postclass")
    public JSONResult<List<PostClassParam>> finds() {

        return JSONResult.success(postClassService.finds());
    }

    @Override
    public JSONResult<PostClassParam> index() {
        return null;
    }
}
