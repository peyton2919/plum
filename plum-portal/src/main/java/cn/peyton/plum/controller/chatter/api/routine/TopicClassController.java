package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.TopicClassParam;
import cn.peyton.plum.chatter.pojo.TopicClass;
import cn.peyton.plum.chatter.service.TopicClassService;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>话题分类 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.controller.api.routine.TopicClassController.java
 * @create date: 2022/3/18 22:44
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class TopicClassController extends ChatterApiRoutineController<TopicClassParam,Integer> {

    @Resource
    private TopicClassService topicClassService;

    // 获取所有话题分类
    @PostMapping("/topicclass")
    public JSONResult<List<TopicClassParam>> finds() {
        return JSONResult.success(topicClassService.finds());
    }

    @Override
    public JSONResult<TopicClassParam> index() {
        return null;
    }
}
