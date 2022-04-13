package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.FollowParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.FollowService;
import cn.peyton.plum.chatter.service.UserService;
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
    public JSONResult<FollowParam> follow(
            @Min(message = "数值不能小于1！", value = 1)
            int followId, HttpServletRequest request) {
        UserParam _userParam= UserUtil.getUserParam(request);
        int _userId = _userParam.getId();
        // 不能关注自己
        if (followId == _userId) {
            return JSONResult.fail(StatusCode.FAIL_NOT_OPERATE_SELF);
        }
        //判断用户是否存在
        if (!userService.isUserId(followId)) {
            return JSONResult.fail(StatusCode.USER_NOT_EXIST);
        }
        // 判断是否已经关注过
        if (followService.isFollow(followId, _userId)) {
            return JSONResult.fail(StatusCode.FAIL_FOLLOW);
        }

        // 保存对象
        if (followService.save(_userId, followId)) {
            return JSONResult.success(StatusCode.SUCCESS_OPERATE_UPDATE.getMsg());
        }
        return JSONResult.fail(StatusCode.FAIL_OPERATE_UPDATE);
    }
    // 用户取消关注
    @PostMapping("/user/unfollow")
    @Valid
    public JSONResult<FollowParam> unFollow(
            @Min(message = "数值不能小于1！", value = 1)
            int followId, HttpServletRequest request) {
        UserParam _userParam= UserUtil.getUserParam(request);
        int _userId = _userParam.getId();
        // 不能取消关注自己
        if (followId == _userId) {
            return JSONResult.fail(StatusCode.FAIL_NOT_CANCEL_OPERATE_SELF);
        }
        // 判断用户是否合法
        if (!userService.isUserId(followId)) {
            return JSONResult.fail(StatusCode.USER_NOT_EXIST);
        }
        // 判断是否已经关注过
        if (!followService.isFollow(followId, _userId)) {
            return JSONResult.fail(StatusCode.FAIL_NOT_FOLLOW);
        }
        // 删除 关注
        if (followService.delete(_userId, followId)) {
            return JSONResult.success(StatusCode.SUCCESS_OPERATE_UPDATE.getMsg());
        }
        return JSONResult.fail(StatusCode.FAIL_OPERATE_UPDATE);
    }

    // 互注列表
    @Valid
    @PostMapping("/user/friends")
    public JSONResult<List<FollowParam>> friends(
            @Min(message = "数值不能小于1！", value = 1)
                    Integer pageNo, HttpServletRequest request) {
        UserParam _user = UserUtil.getUserParam(request);
        return JSONResult.success(followService.friends(_user.getId(),new PageQuery(pageNo)));
    }

    // 粉丝列表
    @Valid
    @PostMapping("/user/fens")
    public JSONResult<List<FollowParam>> fens(
            @Min(message = "数值不能小于1！", value = 1)
            Integer pageNo, HttpServletRequest request) {
        UserParam _user = UserUtil.getUserParam(request);
        return JSONResult.success(followService.follows(_user.getId(),new PageQuery(pageNo),true));
    }

    // 关注列表
    @Valid
    @PostMapping("/user/follows")
    public JSONResult<List<FollowParam>> follows(
            @Min(message = "数值不能小于1！", value = 1)
                    Integer pageNo, HttpServletRequest request) {
        UserParam _user = UserUtil.getUserParam(request);

        return JSONResult.success(followService.follows(_user.getId(),new PageQuery(pageNo),false));
    }
}
