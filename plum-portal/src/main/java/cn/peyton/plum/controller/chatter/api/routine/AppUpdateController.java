package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.AppUpdateParam;
import cn.peyton.plum.chatter.pojo.AppUpdate;
import cn.peyton.plum.chatter.service.AppUpdateService;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.validator.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <h3>应用程序更新 controller .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.AppUpdateController.java
 * @create date: 2022-03-31 0:05
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public final class AppUpdateController extends ChatterApiRoutineController<AppUpdateParam, AppUpdate> {

    @Resource
    private AppUpdateService appUpdateService;

    // 检查更新
    @Valid
    @PostMapping("/update")
    public JSONResult<AppUpdateParam> update(AppUpdateParam param) {
        //查询 最新一条数据并 status =1
        AppUpdateParam _param = appUpdateService.findByNewApp();
        if (null == _param) {
            return JSONResult.fail(StatusCode.FAIL_NOT_UPDATE_APP);
        }
        if (_param.getVersion().equals(param.getVersion())) {
            return JSONResult.fail(StatusCode.FAIL_NOT_UPDATE_APP);
        }
        //todo 逻辑需要处理数值大小
        _param.setVersion(param.getVersion());
        _param.setCreateTime(new Date());
        if (appUpdateService.update(_param)) {
            return JSONResult.success(StatusCode.SUCCESS_OPERATE_UPDATE.getMsg());
        }

        return JSONResult.fail(StatusCode.FAIL_OPERATE_UPDATE);
    }
}
