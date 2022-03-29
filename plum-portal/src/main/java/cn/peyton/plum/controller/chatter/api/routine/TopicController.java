package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.TopicParam;
import cn.peyton.plum.chatter.service.TopicService;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.validator.constraints.Min;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>话题 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.controller.api.routine.TopicController.java
 * @create date: 2022/3/18 23:14
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class TopicController extends ChatterApiRoutineController<TopicParam,Integer> {

    @Resource
    private TopicService topicService;

    // 获取热门话题
    @PostMapping("/hottopic")
    public JSONResult<List<TopicParam>> findByHot(
            @Min(message = "要大于0的数！") int topicClassId,
            @Min(message = "要大于0的数！") int pageNo) {

        return JSONResult.success(topicService.findByHot(topicClassId,new PageQuery(pageNo)));
    }

    // 获取指定话题分类下的话题列表
    @PostMapping("/topicclassid")
    public JSONResult<List<TopicParam>> topicByTopicClassId(
            @Min(message = "要大于0的数！") int topicClassId,
            @Min(message = "要大于0的数！") int pageNo) {

        List<TopicParam> topics = topicService.findByTopicId(topicClassId, new PageQuery(pageNo));
        return JSONResult.success(topics);
    }

    // 搜索话题
    @PostMapping("/topic/search")
    public JSONResult<List<TopicParam>> search(
            @NotBlank(message = "搜索字段不能为空！") String keyword,
            @Min(message = "要大于0的数！") int pageNo){

        return JSONResult.success(topicService.search(keyword,new PageQuery(pageNo)));
    }


}
