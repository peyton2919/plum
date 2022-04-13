package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.ImagesParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.pojo.Images;
import cn.peyton.plum.chatter.service.ImagesService;
import cn.peyton.plum.controller.PROPERTY;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.img.ImageProcessing;
import cn.peyton.plum.core.utils.Lists;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * <h3>图片 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.ImageController.java
 * @create date: 2022/3/28 10:30
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class ImagesController extends ChatterApiRoutineController<ImagesParam, Images> {

    private final String TEMP_BASE_PATH = "E:/workspaces/idea2022/plum/plum-portal/imgs/";
    @Resource
    private ImagesService imagesService;

    // 上传单图或多图
    @PostMapping(value = "/user/imgs/uploadmore")
    public JSONResult<List<ImagesParam>> uploadMore(MultipartFile[] files, HttpServletRequest request) throws IOException {
        HttpSession session = request.getSession();
        UserParam _userParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        List<ImagesParam> _list = Lists.newArrayList();
        ImagesParam _p = null;
        if (null != files) {
            for (MultipartFile file : files) {
                String _path = ImageProcessing.execute(file.getInputStream(),
                        file.getOriginalFilename(), TEMP_BASE_PATH, null);
                _p = new ImagesParam();
                _p.setUserId(_userParam.getId());
                _p.setUrl(_path);
                _list.add(_p);
            }
            List<ImagesParam> _results = imagesService.insertBatch(_list);
            return JSONResult.success(_results);
        }
        return JSONResult.fail(StatusCode.FAIL_OPERATE_UPDATE);
    }
}
