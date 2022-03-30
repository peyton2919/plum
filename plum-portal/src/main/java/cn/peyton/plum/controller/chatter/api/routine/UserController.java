package cn.peyton.plum.controller.chatter.api.routine;

import cn.peyton.plum.chatter.param.*;
import cn.peyton.plum.chatter.pojo.UserInfo;
import cn.peyton.plum.chatter.service.*;
import cn.peyton.plum.common.UserUtil;
import cn.peyton.plum.controller.PROPERTY;
import cn.peyton.plum.controller.common.AliSMSUtil;
import cn.peyton.plum.controller.route.ChatterApiRoutineController;
import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.img.ImageProcessing;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.core.token.TokenUtil;
import cn.peyton.plum.core.utils.FileUtil;
import cn.peyton.plum.core.utils.PathUtil;
import cn.peyton.plum.core.validator.Regulation;
import cn.peyton.plum.core.validator.Valid;
import cn.peyton.plum.core.validator.constraints.Length;
import cn.peyton.plum.core.validator.constraints.Min;
import cn.peyton.plum.core.validator.constraints.NotBlank;
import cn.peyton.plum.core.validator.constraints.Phone;
import cn.peyton.plum.tools.cache.LocalCache;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <h3>用户 Controller 类 .controller</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.chatter.api.routine.UserController.java
 * @create date: 2022/3/23 11:21
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class UserController extends ChatterApiRoutineController<UserParam,Integer> {
    /** 存在session中的 code key */
    private final static String KEY_SESSION_PHONE_CODE = "SESSION_PHONE_CODE_220323";
    /** 存在 session中的 phone key */
    private final static String KEY_SESSION_PHONE = "SESSION_PHONE_220323";

    /** 手机登录时 存在 token 对象 key */
    private final static String KEY_TOKEN_PHONE = "TOKEN_PHONE_2203231641";
    /** 账号登录时 存在 token 对象 key */
    private final static String KEY_TOKEN_ACCOUNT = "TOKEN_ACCOUNT_2203231829";
    /** 其他登录时 存在 token 对象 key */
    private final static String KEY_TOKEN_OTHER = "TOKEN_OTHER_2203231830";

    private final static String KEY_PHONE_CACHE_TIME = "PHONE_TIME_2203262148";

    @Resource
    private UserService userService;
    @Resource
    private UserBindService userBindService;
    @Resource
    private UserInfoService userInfoService;

    @Resource
    private CommentService commentService;
    @Resource
    private FollowService followService;
    @Resource
    private PostService postService;

    @GetMapping("/test")
    @Valid
    public JSONResult<UserParam> index1() {

        return JSONResult.success("成功");
    }

    // 发送验证码
    @PostMapping("/sendcode")
    @Valid
    public JSONResult<UserParam> sendCode(
            @NotBlank(message = "手机号码不能为空！")
            @Phone
            String phone, HttpServletRequest request, HttpServletResponse response) {
        // 判断是否可用 ,返回 true 表示应该手机被禁用
        if (userService.isStatus(phone, PROPERTY.PHONE, 0)) {
            return JSONResult.error(11003, "该用户被禁用,请联系客服！", response.getStatus());
        }
        //先判断手机号码 是否存在, 不存在就返回;
        UserParam _param = userService.findByPhone(phone);
        if (null == _param){
            return JSONResult.error(11001, "该手机号码还未注册,请先注册！", response.getStatus());
        }
        // 判断是否已经提交过
        LocalCache cache = LocalCache.getInstance();
        Object _objTime = cache.get(KEY_PHONE_CACHE_TIME);
        long _currTime = System.currentTimeMillis();
        if (null != _objTime) {
            long _oldTime = Long.parseLong(_objTime.toString());
            // 判断时间为 60秒
            if((_currTime/1000) - (_oldTime/1000) <= 60){
                return JSONResult.fail(StatusCode.FAIL.getCode(), "时间间隔太短,请稍等!");
            }
        }
        cache.put(KEY_PHONE_CACHE_TIME,_currTime);

        //生产 随机数
        StringBuffer code = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int r = (int)(Math.random()*10);
            code.append(r);
        }
        //把验证码存到 session 中
        HttpSession session = request.getSession();
        session.setAttribute(KEY_SESSION_PHONE_CODE,code);
        session.setAttribute(KEY_SESSION_PHONE,phone);

        //todo 后期更新 阿里大于
        AliSMSUtil.sendCode(phone, code.toString());

        //发送验证逻辑
        return JSONResult.success("【社区论坛】验证码: {"
                + code + "} 此验证码仅用手机登录 XXX 社区论坛。请忽将验证码提供给他人，否则可能导致资产损失。");
    }

    // 用户注册
    @PostMapping("/reg")
    @Valid
    public JSONResult<UserParam> reg(UserParam userParam) {
        //todo
        //判断是否重名
        if (userService.isRename(userParam.getUsername())) {
            return JSONResult.error(11004, "该名称已被使用,请输入不同当前的名称！", 200);
        }

        UserParam user = userService.reg(userParam);

        return (null != user)?
                JSONResult.success("用户注册成功！",user):JSONResult.fail(11000,"用户注册失败!");
    }

    // 手机登录
    @PostMapping("/phonelogin")
    @Valid
    public JSONResult<UserParam> phoneLogin(@NotBlank(message = "手机号不能为空！") String phone,
                                            @NotBlank(message = "验证码不能为空！") String code,
                                            HttpServletRequest request) {
        // 判断是否可用 ,返回 true 表示应该手机被禁用
        if (userService.isStatus(phone, PROPERTY.PHONE, 0)) {
            return JSONResult.error(11003, "该用户被禁用,请联系客服！", 200);
        }
        //用手机号码 查找 为空表示该用户不存在
        UserParam _param = userService.findByPhone(phone);
        if (null == _param){
            return JSONResult.error(11001, "该手机号码还未注册,请先注册！", 200);
        }
        //获取 session
        HttpSession session = request.getSession();
        //获取手机号码
        Object _phone = session.getAttribute(KEY_SESSION_PHONE);
        //获取 验证码
        Object _code = session.getAttribute(KEY_SESSION_PHONE_CODE);
        // 重复 判断 从 session 中找到相应的数据
        if(null == _phone || null == _code){
            return JSONResult.fail(11001,phone, "该手机号码还未注册,请先注册！");
        }
        // 判断 手机 与 验证码 相同
        if (phone.equals(_phone.toString()) && code.equals(_code.toString())) {
            //设置登录 类型
            _param.setLoginType(PROPERTY.PHONE);
            // token 工具类
            TokenUtil tokenUtil = new TokenUtil();
            //创建 token
            String token = tokenUtil.sign(KEY_TOKEN_PHONE, _param);
            // token 赋值到 _param 对象
            _param.setToken(token);
            // 把 _param 对象存在 session 中
            session.setAttribute(PROPERTY.SESSION_USER,_param);
            return JSONResult.success(phone + "登录成功！",_param);
        }
        return JSONResult.fail(11001,phone, "该手机号码还未注册,请先注册！");
    }

    // 用户账户登录
    @PostMapping("/login")
    @Valid
    public JSONResult<UserParam> login(@NotBlank(message = "用户名不能为空！") String username,
                                       @NotBlank(message = "密码不能为空！") String password,
                                       HttpServletRequest request) {
        // 判断是否可用 ,返回 true 表示应该手机被禁用
        if (userService.isStatus(username, PROPERTY.ACCOUNT, 0)) {
            return JSONResult.error(11003, "该用户被禁用,请联系客服！", 200);
        }
        // 根据用户 和 密码 查找 ; 返回 为空表示 应该用户账号密码不正确 ;
        UserParam _param = userService.login(username, password);
        if (null == _param) {
            return JSONResult.error(11002, "账号密码不正确！", 200);
        }
        //设置登录 类型
        _param.setLoginType(PROPERTY.ACCOUNT);
        // token 工具类
        TokenUtil tokenUtil = new TokenUtil();
        //创建 token
        String token = tokenUtil.sign(KEY_TOKEN_ACCOUNT, _param);

        // token 赋值到 _param 对象
        _param.setToken(token);
        HttpSession session = request.getSession();
        // 把 _param 对象存在 session 中
        session.setAttribute(PROPERTY.SESSION_USER,_param);
        return JSONResult.success(username + "登录成功！",_param);

    }

    // 第三方 登录
    @PostMapping("/otherlogin")
    @Valid
    public JSONResult<UserParam> otherLogin(UserBindParam param) {
        //todo
        // 第一次绑定,用户表没有记录,需要强制绑定手机号码;

        // 绑定用户,拿到用户的ID,绑定到当前的第三方登录中

        //验证用户是否存在

        // 用户不存在，创建用户

        // 用户是否被禁用

        // 登录成功，返回用户信息 + token

        // 判断是否绑定

        return JSONResult.success();
    }

    // 用户退出
    @PostMapping("/user/logout")
    public JSONResult<UserParam> logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute(PROPERTY.SESSION_USER);
        return JSONResult.success("成功退出！");
    }

    // 用户手机、邮箱 绑定
    @PostMapping("/user/bind")
    public JSONResult<UserParam> bind(String value,String type,
                                           HttpServletRequest request) {
        if (!(PROPERTY.PHONE.equals(type) || PROPERTY.ACCOUNT.equals(type)
                || PROPERTY.EMAIL.equals(type))) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "没找到绑定类型！");
        }
        //验证 手机号 和 邮箱地址
        Pattern pattern = null;
        Matcher matcher;
        if (PROPERTY.EMAIL.equals(type)) {
            pattern = Pattern.compile(Regulation.REGEX_EMAIL_ALL);
        }
        if (PROPERTY.PHONE.equals(type)) {
            pattern = Pattern.compile(Regulation.REGEX_PHONE);
        }
        if (PROPERTY.EMAIL.equals(type) || PROPERTY.PHONE.equals(type)) {
            matcher = pattern.matcher(value);
            //验证不通过
            if (!matcher.matches()) {
                return JSONResult.fail(StatusCode.FAIL.getCode(),
                        (PROPERTY.PHONE.equals(type)) ? "手机号码出错了！":"邮箱地址出错了！");
            }
        }

        //
        HttpSession session = request.getSession();
        // 需要配置 AuthenticationInterceptor 拦截器,判断用户已经存到session中,否则可能转换异常
        UserParam _sessionParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);

        //申明 值 和 类型 并赋值
        String _sessionType = _sessionParam.getLoginType();
        String _tmpType = ""; //临时类型
        String _tmpMsg = ""; //临时输出信息
        String _tmpValue = "";//临时值
        if (PROPERTY.EMAIL.equals(type)){
            _tmpType = PROPERTY.EMAIL;
            _tmpMsg = "邮箱";
            _tmpValue = _sessionParam.getEmail();
        } else if (PROPERTY.PHONE.equals(type)) {
            _tmpType = PROPERTY.PHONE;
            _tmpMsg = "手机号码";
            _tmpValue = _sessionParam.getPhone();
        }

        // 判断 当前登录方式
        if (_tmpType.equals(_sessionType)) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "该用户已经绑定过" + _tmpMsg);
        }

        // 判断当前用户的有没有绑定
        if (null != _tmpValue && !"".equals(_tmpValue)) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "该用户已经绑定过" + _tmpMsg);
        }
        _tmpValue = value;
        if (PROPERTY.EMAIL.equals(type)){
            // 判断该 邮箱 是否绑定了其他用户
            if (userService.isBindEmail(_sessionParam.getId(),_tmpValue)) {
                return JSONResult.fail(StatusCode.FAIL.getCode(), "该用户已经绑定过" + _tmpMsg);
            }
            _sessionParam.setEmail(_tmpValue);
            if (userService.updateEmail(_sessionParam)) {
                return JSONResult.success(_tmpMsg + "绑定成功!");
            }
        } else if (PROPERTY.PHONE.equals(type)) {
            // 判断该手机是否绑定了其他用户
            if (userService.isBindPhone(_sessionParam.getId(),_tmpValue)) {
                return JSONResult.fail(StatusCode.FAIL.getCode(), "该用户已经绑定过" + _tmpMsg);
            }
            _sessionParam.setPhone(_tmpValue);
            if (userService.updatePhone(_sessionParam)) {
                return JSONResult.success(_tmpMsg + "绑定成功!");
            }
        }

        return JSONResult.fail(StatusCode.FAIL.getCode(), _tmpMsg + "绑定失败!");
    }

    // 绑定第三方账号; 需要 类型有 {qq,weixin,sinaweibo}
    @PostMapping("/user/bindother")
    public JSONResult<UserParam> bindOther(UserBindParam param, HttpServletRequest request) {
        //
        HttpSession session = request.getSession();
        // 需要配置 AuthenticationInterceptor 拦截器,判断用户已经存到session中,否则可能转换异常
        UserParam _sessionParam = (UserParam) session.getAttribute(PROPERTY.SESSION_USER);
        //绑定多个账号
        List<UserBindParam> _userBindParams = _sessionParam.getUserBindParams();
        if (null != _userBindParams) {
            //
            for (UserBindParam _p : _userBindParams) {
                if (_p.getType().equals(param.getType())) {
                    return JSONResult.fail(StatusCode.FAIL.getCode(), "该账号已经绑定过");
                }
                //
                if (userBindService.isBindOther(_sessionParam.getId(),
                        _p.getOpenId(), _p.getType())) {
                    return JSONResult.fail(StatusCode.FAIL.getCode(), "该账号已经绑定过");
                }
            }

        }
        if (userBindService.insert(param)) {
            return JSONResult.success("绑定成功!");
        }

        return JSONResult.fail(StatusCode.FAIL.getCode(),  "该账户绑定失败!");
    }

    // 搜索用户
    @PostMapping("/search")
    public JSONResult<List<UserParam>> search(
            @NotBlank(message = "搜索字段不能为空！") String keyword,
            @Min(message = "要大于0的数！") int pageNo){

        return JSONResult.success(userService.search(keyword,new PageQuery(pageNo)));
    }
    // ****************************************************************************************** //

    // 编辑用户头像
    @PostMapping("/user/edituserpic")
    public JSONResult<UserParam> editUserPic(MultipartFile file,HttpServletRequest request) {
        UserParam _userParam = UserUtil.getUserParam(request);
        String _path = null;
        if (null == file) {
            return JSONResult.fail(StatusCode.FAIL.getCode(), "图片不能为空！");
        }
        try {
            _path = ImageProcessing.execute(file.getInputStream(),
                    file.getOriginalFilename(), PROPERTY.IMG_AVATAR_LOCATION, null);
        } catch (IOException e) {
            e.printStackTrace();
            return JSONResult.error(StatusCode.ERROR.getCode(), "文件上传IO异常！", 200, 11005);
        }
        try {
            if (userService.updateUserPic(_userParam.getId(), _path)) {
                return JSONResult.success("头像更像成功！",null,_path);
            }
        } catch (Exception e) {

        }finally {
            //删除头像
            FileUtil.delFile(PROPERTY.IMG_AVATAR_LOCATION + _path);
        }

        return JSONResult.fail("头像更新失败");
    }

    // 编辑用户资料
    @Valid
    @PostMapping("/user/edituserinfo")
    public JSONResult<UserInfoParam> editUserInfo(UserInfoParam param, HttpServletRequest request) {
        UserParam _userParam = UserUtil.getUserParam(request);
        param.setUserId(_userParam.getId());
        if (userInfoService.updateUserInfo(param)) {
            return JSONResult.success("编辑用户资料成功！", param);
        }
        return JSONResult.fail("编辑用户资料失败!");
    }

    // 修改用户密码
    @Valid
    @PostMapping("/user/repassword")
    public JSONResult<UserParam> editPassword(
            @NotBlank(message = "旧密码不能为空！")
            @Length(min = 6,max = 20,message = "密码长度为6~20的字符!")
            String oldPassword,
            @NotBlank(message = "新密码不能为空！")
            @Length(min = 6,max = 20,message = "密码长度为6~20的字符!")
            String newPassword,
            @NotBlank(message = "确认密码不能为空！")
            String confirmPassword, HttpServletRequest request) {
        UserParam _userParam = UserUtil.getUserParam(request);
        // 从数据库中找出的密码
        String _dPW = userService.findPasswordById(_userParam.getId(), oldPassword);
        // 判断旧密码是否正确
        if (null == _dPW) {
            return JSONResult.fail("旧密码不正确,请重新输入");
        }
        if (!newPassword.equals(confirmPassword)) {
            return JSONResult.fail("确认密码不正确,请重新输入");
        }
        if (_dPW.equals(userService.encryptPW(newPassword))) {
            return JSONResult.fail("新密码与旧密码相同,不需要修改");
        }
        if (userService.updatePassword(_userParam.getId(),newPassword)) {
            return JSONResult.success("密码修改成功！");
        }

        return JSONResult.fail("密码修改失败！");
    }
}
