package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.CommentParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.CommentService;
import cn.peyton.plum.chatter.service.PostService;
import cn.peyton.plum.controller.PROPERTY;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.constraints.Min;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <h3>评论 controller .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.CommentController.java
 * @create date: 2022/3/29 20:35
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class CommentController extends ChatterApiRoutineController<CommentParam,Integer> {
    @Resource
    private CommentService commentService;
    @Resource
    private PostService postService;

    //用户评论
    @PostMapping("/user/comment")
    public JSONResult<CommentParam> create(CommentParam param, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserParam _userParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        // 判断 fid不为0时
        if (param.getFId() != 0) {
            if (!commentService.isCommentByFId(param.getFId())) {
                return JSONResult.fail(StatusCode.FAIL.getCode(), "找不到父评论！");
            }
        }
        // 判断 post文章是否存在
        if (!postService.isPost(param.getPostId())) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "找不到文章！");
        }
        // 判断是否非法数据
        if (!commentService.isCommentByFIdAndPostId(param.getFId(), param.getPostId())) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "评论逻辑出错了！");
        }
        param.getUserParam().setId(_userParam.getId());
        CommentParam _cp = commentService.create(param);
        if (null != _cp) {
            return JSONResult.success("评论发表成功！", _cp);
        }
        return JSONResult.fail(StatusCode.FAIL.getCode(), "评论发表失败");
    }

    // 获取当前文章的所有评论
    @PostMapping("/comment/postid")
    @Valid
    public JSONResult<List<CommentParam>> findByPostId(
            @Min(value = 0,message = "参数值要大于0！") Integer postId) {

        return JSONResult.success(commentService.findByPostId(postId));
    }

}
