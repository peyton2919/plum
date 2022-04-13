package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.SupportParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.PostService;
import cn.peyton.plum.chatter.service.SupportService;
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
 * <h3>文章顶踩 controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.SupportController.java
 * @create date: 2022/3/29 15:36
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public final class SupportController extends ChatterApiRoutineController<SupportParam,Integer> {

    @Resource
    private SupportService supportService;
    @Resource
    private PostService postService;

    // 用户顶踩
    @PostMapping("/user/support")
    @Valid
    public JSONResult<SupportParam> create(SupportParam supportParam, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserParam _userParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        SupportParam _param = supportService.isSupport(_userParam.getId(), supportParam.getPostId());
        //判断当前记录是否有操作过
        if (null != _param) {
            if (_param.getType() == supportParam.getType()) {
                return JSONResult.fail(StatusCode.NOT_REPEAT_OPERATION.getCode(),
                        ((supportParam.getType() == 0) ? "已经顶过了," : "已经踩过了,") + "不能重复操作!");
            }
            _param.setType(supportParam.getType());

            if (supportService.update(_param)){
                return JSONResult.success((_param.getType() == 0) ? "顶成功" : "踩成功");
            }
        }
        //判断文章是否存在
        if (!postService.isPost(supportParam.getPostId())) {
            return JSONResult.fail(StatusCode.FAIL_NOT_EXIST);
        }
        supportParam.setUserId(_userParam.getId());
        if (null != supportService.create(supportParam)){
            return JSONResult.success((supportParam.getType() == 0) ? "顶成功" : "踩成功");
        }
        return JSONResult.fail(StatusCode.FAIL_OPERATE_UPDATE);
    }
}
