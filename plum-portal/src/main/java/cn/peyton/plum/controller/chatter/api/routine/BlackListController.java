package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.BlackListParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.BlackListService;
import cn.peyton.plum.chatter.service.UserService;
import cn.peyton.plum.common.UserUtil;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.constraints.Min;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <h3>黑名单 controller .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.BlackListController.java
 * @create date: 2022/3/30 18:15
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public final class BlackListController extends ChatterApiRoutineController<BlackListParam, Integer> {

    @Resource
    private UserService userService;
    @Resource
    private BlackListService blackListService;

    // 加入黑名单
    @PostMapping("/user/addblack")
    @Valid
    public JSONResult<BlackListParam> addBlack(
            @NotBlank(message = "用户不能为空")
            @Min(message = "数值不能小于1！", value = 1)
            Integer blackId, HttpServletRequest request) {
        UserParam _userParam = UserUtil.getUserParam(request);
        if (blackId == _userParam.getId()) {
            return JSONResult.fail("不能添加自己！");
        }
        //判断是否已经拉黑
        if (blackListService.isUserIdAndBlackId(_userParam.getId(), blackId)) {
            return JSONResult.fail("该用户已经被你拉黑过！");
        }
        // 判断用户是否合法
        if (!userService.isUserId(blackId)) {
            return JSONResult.fail("该用户不存在！");
        }
        // 添加黑名单
        BlackListParam _param = new BlackListParam();
        _param.setBlackId(blackId);
        _param.setUserId(_userParam.getId());
        if (blackListService.add(_param)) {
            return JSONResult.success("加入黑名单成功！");
        }
        return JSONResult.fail("加入黑名单失败!");
    }

    // 移除黑名单
    @PostMapping("/user/removeblack")
    @Valid
    public JSONResult<BlackListParam> removeBlack(
            @NotBlank(message = "用户不能为空")
            @Min(message = "数值不能小于1！", value = 1)
                    Integer blackId, HttpServletRequest request) {
        UserParam _userParam = UserUtil.getUserParam(request);
        if (blackId == _userParam.getId()) {
            return JSONResult.fail("不能操作自己！");
        }
        // 判断用户是否合法
        if (!userService.isUserId(blackId)) {
            return JSONResult.fail("该用户不存在！");
        }
        // 判断是否已经拉黑
        if (!blackListService.isUserIdAndBlackId(_userParam.getId(), blackId)) {
            return JSONResult.fail("该用户没被你拉黑过！");
        }
        if (blackListService.delete(_userParam.getId(), blackId)) {
            return JSONResult.success("移除黑名单成功！");
        }
        return JSONResult.fail("移除黑名单失败!");
    }


}
