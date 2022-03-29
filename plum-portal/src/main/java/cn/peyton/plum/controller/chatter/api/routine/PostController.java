package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.PostParam;
import cn.peyton.plum.chatter.param.UserParam;
import cn.peyton.plum.chatter.service.PostService;
import cn.peyton.plum.controller.PROPERTY;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.utils.StringUtil;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.constraints.Min;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <h3>文章 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.controller.api.routine.PostController.java
 * @create date: 2022/3/17 18:03
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class PostController extends ChatterApiRoutineController<PostParam,Integer> {

    @Resource
    private PostService postService;

    // 发表文章详情
    @PostMapping("/user/post/create")
    @Valid
    public JSONResult<PostParam> create(PostParam postParam, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserParam _userParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        postParam.setUserParam(_userParam);
        postParam.setPath(_userParam.getUserInfoParam().getPath());
        String na = "";
        postParam.setTitle(StringUtil.substring(postParam.getContent(),0,20));
        // todo 连接图片

        // todo 更新数据

        return super.create(postParam);
    }

    // 获取文章详情
    @PostMapping("/post/detail")
    @Valid
    public JSONResult<PostParam> detail(@Min(message = "要大于0的数！") Integer id) {

        return JSONResult.success(postService.findByPrimaryKey(id));
    }

    // 获取指定话题下的文章列表
    @PostMapping("/post/topicid")
    @Valid
    public JSONResult<List<PostParam>> findByTopicId(
            @Min(message = "要大于0的数！")Integer topicId,
            @Min(message = "要大于0的数！") Integer pageNo) {

        return JSONResult.success(postService.findByTopicId(topicId, new PageQuery(pageNo)));
    }

    // 获取指定文章分类下的文章列表
    @PostMapping("/post/postclassid")
    @Valid
    public JSONResult<List<PostParam>> findByPostClassId(
            @Min(message = "要大于0的数！")Integer postClassId,
            @Min(message = "要大于0的数！")Integer pageNo){

        return JSONResult.success(postService.findByClassId(postClassId,new PageQuery(pageNo)));
    }

    // 获取指定用户下的文章列表 {游客可点}
    @PostMapping("/post/userid")
    @Valid
    public JSONResult<List<PostParam>> findByUserId(
            @Min(message = "要大于0的数！")Integer userId,
            @Min(message = "要大于0的数！")Integer pageNo){

        return JSONResult.success(postService.findByUserId(userId,new PageQuery(pageNo)));
    }

    // 获取指定用户下的文章列表 {含隐私}
    @PostMapping("/user/post/pkuserid")
    @Valid
    public JSONResult<List<PostParam>> findByPKUserId(
            @Min(message = "要大于0的数！") Integer pageNo,
            HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserParam _userParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        return JSONResult.success(postService.findByPKUserId(_userParam.getId(), new PageQuery(pageNo)));
    }

    // 搜索文章
    @PostMapping("/post/search")
    @Valid
    public JSONResult<List<PostParam>> search(
            @NotBlank(message = "关键字不能为空！") String keyword,
            @Min(message = "要大于0的数！") Integer pageNo) {

        return JSONResult.success(postService.search(keyword, new PageQuery(pageNo)));
    }

}
