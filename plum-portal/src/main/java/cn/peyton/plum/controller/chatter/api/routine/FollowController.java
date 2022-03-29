package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.FollowParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.FollowService;
import cn.peyton.plum.chatter.service.UserService;
import cn.peyton.plum.controller.PROPERTY;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.validator.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <h3>用户关注 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.FollowController.java
 * @create date: 2022/3/25 16:16
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class FollowController extends ChatterApiRoutineController<FollowParam, Integer> {

    @Resource
    private FollowService followService;
    @Resource
    private UserService userService;

    @Override
    public JSONResult<FollowParam> index() {
        return null;
    }

    // 用户关注
    @Valid
    @PostMapping("/user/follow")
    public JSONResult<FollowParam> follow(int followId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserParam _sessionUserParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        int _userId = _sessionUserParam.getId();
        // 不能关注自己
        if (followId == _userId) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "不能关注自己！");
        }
        // 判断是否已经关注过
        if (followService.isFollow(followId, _userId)) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "已经关注过！");
        }
        //判断用户是否存在
        if (userService.isUserId(_userId)) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "关注用户不存在！");
        }
        // 保存对象
        if (followService.save(_userId, followId)) {
            return JSONResult.success("关注成功!");
        }
        return JSONResult.fail(StatusCode.FAIL.getCode(), "关注失败！");
    }

    // 用户取消关注
    @PostMapping("/user/unfollow")
    @Valid
    public JSONResult<FollowParam> unFollow(int followId, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserParam _sessionUserParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        int _userId = _sessionUserParam.getId();
        // 不能取消关注自己
        if (followId == _userId) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "不能取消关注自己！");
        }
        // 判断是否已经关注过
        if (!followService.isFollow(followId, _userId)) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "该用户没关注过！");
        }
        // 删除 关注
        if (followService.delete(_userId, followId)) {
            return JSONResult.success("关注删除成功!");
        }

        return JSONResult.fail(StatusCode.FAIL.getCode(), "关注删除失败！");
    }
}
