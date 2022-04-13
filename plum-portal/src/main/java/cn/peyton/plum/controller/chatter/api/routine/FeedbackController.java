package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.FeedbackParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.FeedbackService;
import cn.peyton.plum.common.UserUtil;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.constraints.Min;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <h3>意见反馈 controller .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.FeedbackController.java
 * @create date: 2022/3/30 23:12
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public final class FeedbackController extends ChatterApiRoutineController<FeedbackParam,Integer> {

    @Resource
    private FeedbackService feedbackService;

    // 用户反馈
    @PostMapping("/user/feedback")
    @Valid
    public JSONResult<FeedbackParam> create(FeedbackParam param, HttpServletRequest request) {
        UserParam _userParam = UserUtil.getUserParam(request);
        param.setFromId(_userParam.getId());
        param.setToId(0);
        if (feedbackService.create(param)) {
            return JSONResult.success(StatusCode.SUCCESS_OPERATE_UPDATE.getMsg());
        }
        return JSONResult.fail(StatusCode.FAIL_OPERATE_UPDATE);
    }

    // 获取用户反馈列表
    @Valid
    @PostMapping("/user/feedbacklist")
    public JSONResult<List<FeedbackParam>> feedbackList(
            @Min(message = "数值不能小于1！", value = 1)
            Integer pageNo, HttpServletRequest request) {

        return JSONResult.success(feedbackService.finds(new PageQuery(pageNo)));
    }
}
