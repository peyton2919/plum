package cn.peyton.plum.core.exception;

/**
 * <h3>状态码 {response} 枚举类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.exception.ERROR.java
 * @create date: 2021/11/14 21:56
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public enum StatusCode {

    // FAIL_NOT_(,""),/** <pre>绑定JSONResult.errorCode=code,JSONResult.msg=msg </pre>  */

    /** 成功统一返回码: 200 */
    SUCCESS(200,"success"),
    /** 错误统一返回码: 700 */
    FAIL(700,"fail"),
    /** 异常统一返回码: 800 */
    ERROR(800,"error"),
    /** <pre>
     *  4600,"名称不能为空"
     *  绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_NAME(4600,"名称不能为空"),
    /** <pre>
     *  4601,"密码不能为空"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_PASSWORD(4601,"密码不能为空"),
    /** <pre>
     * 4602,"手机不能为空"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_PHONE(4602,"手机不能为空"),
    /**
     * <pre>
     *  4603,"电话不能为空"
     *  绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_TEL(4603,"电话不能为空"),
    /** <pre>
     *  4604,"邮箱不能为空"
     *  绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_EMAIL(4604,"邮箱不能为空"),
    /** <pre>
     *  4605,"不能为空"
     *  绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_OTHER(4605,"不能为空"),
    /** <pre>
     * 4620,"手机号码出错了"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_PHONE(4620,"手机号码出错了"),
    /** <pre>
     * 4621,"邮箱格式出错了"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_EMAIL(4621,"邮箱格式出错了"),
    /** <pre>
     * 4622,"旧密码不正确,请重新输入"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_OLD_PASSWORD(4622,"旧密码不正确,请重新输入"),
    /** <pre>
     * 4623,"确认密码不正确,请重新输入"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_CONFIRM_PASSWORD(4623,"确认密码不正确,请重新输入"),
    /** <pre>
     * 4624,"新密码与旧密码相同,不需要修改"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NEW_OLD_PASSWORD(4624,"新密码与旧密码相同,不需要修改"),
    /** <pre>
     * 4625,"不能取消操作自己"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_CANCEL_OPERATE_SELF(4625,"不能取消操作自己"),
    /** <pre>
     * 4626,"没关注过"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_FOLLOW(4626,"没关注过"),
    /** <pre>
     * 4627,"不能操作自己"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_OPERATE_SELF(4627,"不能操作自己"),
    /** <pre>
     * 4628,"已经关注过"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_FOLLOW(4628,"已经关注过"),
    /** <pre>
     * 4629,"找不到父评论"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_PARENT_COMMENT(4629,"找不到父评论"),
    /** <pre>
     * 4630,"评论逻辑出错了"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_COMMENT_LOGIC(4630,"评论逻辑出错了"),
    /** <pre>
     * 4631,"暂无更新版本"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_UPDATE_APP(4631,"暂无更新版本"),
    /** <pre>
     * 4633,"该用户已经被你拉黑过"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_HAS_BEEN_BLOCKED(4633,"该用户已经被你拉黑过"),
    /** <pre>
     * 4634,"该用户没被你拉黑过"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_BLOCKED(4634,"该用户没被你拉黑过"),



    /** <pre>
     * 4650,"注册失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_REGISTER(4650,"注册失败"),
    /** <pre>
     * 4651,"绑定失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_BINDING(4651,"绑定失败"),
    /** <pre>
     * 4651,"绑定失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_AVATAR_UPDATE(4652,"头像更新失败"),
    /** <pre>
     * 4653,"用户更新失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_USER_UPDATE(4653,"用户更新失败"),
    /** <pre>
     * 4654,"密码更新失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_PASSWORD_UPDATE(4654,"密码更新失败"),
    /** <pre>
     * 4655,"操作失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_OPERATE_UPDATE(4655,"数据操作失败"),

    /** <pre>
     * 4701,"[参数校验] 属性验证错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_VALID(4701,"[参数校验] 属性验证错误"),
    /** <pre>
     * 4702,"[参数校验] 参数错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_PARAM(4702,"[参数校验] 参数错误"),
    /** <pre>
     * 4703,"该数据不存在"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAIL_NOT_EXIST(4703,"该数据不存在"),

    /** <pre>
     * 2001,"注册成功"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_REGISTER(2001,"注册成功"),
    /** <pre>
     * 2002,"成功退出"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_OUT_LOGIN(2002,"成功退出"),
    /** <pre>
     * 2003,"绑定成功"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_BINDING(2003,"绑定成功"),
    /** <pre>
     * 2004,"登录成功"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_LOGIN(2004,"登录成功"),
    /** <pre>
     * 2005,"头像更新成功"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_AVATAR_UPDATE(2005,"头像更新成功"),
    /** <pre>
     * 2006,"用户更新成功"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_USER_UPDATE(2006,"用户更新成功"),
    /** <pre>
     * 2007,"密码更新成功
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_PASSWORD_UPDATE(2007,"密码更新成功"),
    /** <pre>
     * 2008,"数据操作成功"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SUCCESS_OPERATE_UPDATE(2008,"数据操作成功"),

    /** <pre>
     * 3001,"文件IO异常"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    ERROR_FILE(3001,"文件IO异常"),

    /** <pre>
     * 5001,"[参数校验] 用户名不能为空
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    USER_NAME_IS_NOT_NULL(5001,"[参数校验] 用户名不能为空"),
    /** <pre>
     * 5011,"该名称已被使用,请输入不同当前的名称"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    USER_NAME_BE_USED(5011,"该名称已被使用,请输入不同当前的名称"),
    /** <pre>
     * 5002,"[参数校验] 密码不能为空"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    PWD_IS_NOT_NULL(5002,"[参数校验] 密码不能为空"),
    /** <pre>
     * 5003,"[参数校验] 用户名或密码不能为空"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    NAME_PWD_IS_NOT_NULL(5003,"[参数校验] 用户名或密码不能为空"),
    /** <pre>
     * 5004,"该用户不存在"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    USER_NOT_EXIST(5004,"该用户不存在"),
    /** <pre>
     * 5005, "该用户被禁用,请联系客服"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    USER_DISABLED(5005, "该用户被禁用,请联系客服"),
    /** <pre>
     * 5006, "密码错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    PASSWORD_WRONG(5006, "密码错误"),
    /** <pre>
     * 5007,"用户名称密码错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    USERNAME_PASSWORD_WRONG(5007,"用户名称密码错误"),
    /** <pre>
     * 5008,"需要登录"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    NEED_LOGIN(5008,"需要登录"),
    /** <pre>
     * 5009, "你已经退出了"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    DROP_OUT(5009, "你已经退出了"),
    /** <pre>
     * 5010,"登录凭证过期"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    UNAUTHORIZED(5010,"登录凭证过期"),

    //自定义系列
    /** <pre>
     * 8002, "非法token"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    ILLEGAL_TOKEN(8002, "非法token"),
    /** <pre>
     * 8006,"token过期"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    TOKEN_EXPIRE(8006,"token过期"),
    /** <pre>
     * 8004, "绑定类型冲突"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    BINDING_TYPE_CONFLICT(8004, "绑定类型冲突"),
    /** <pre>
     * 8005, "没找到绑定类型"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    BINDING_NOT_FIND_TYPE(8005, "没找到绑定类型"),
    /** <pre>
     * 8005, "已经被绑定了"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    BINDING_HAS_BEEN_BOUND(8005, "已经被绑定了"),
    // 手机
    /** <pre>
     * 4120,"该手机号码还未注册,请先注册"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    PHONE_UNREGISTERED(4120,"该手机号码还未注册,请先注册"),
    /** <pre>
     * 4100, "发送验证码错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    VERIFICATION_CODE_ERROR(4100, "发送验证码错误"),
    /** <pre>
     * 4101, "发送验证码太快了"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SEND_VERIFICATION_FAST(4101, "发送验证码太快了"),
    /** <pre>
     * 4102, "无效号码"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    INVALID_NUMBER(4102, "无效号码"),
    /** <pre>
     * 4103, "触发日限制"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    TRIGGER_DAY_LIMIT(4103, "触发日限制"),
    /** <pre>
     * 4104, "发送失败"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FAILED_TO_SEND(4104, "发送失败"),
    /** <pre>
     * 4105, "未开启发送短信"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    NOT_SMS_SEND(4105, "未开启发送短信"),
    /** <pre>
     * 4106, "请重新获取验证码"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    REGET_VERIFICATION_CODE(4106, "请重新获取验证码"),

    /** <pre>
     * 4000,"请求的数据格式不符"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    BAD_REQUEST(4000,"请求的数据格式不符"),
    /** <pre>
     * 4001,"资源未找到"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    RESOURCES_NOT_FOUND(4001,"资源未找到"),
    /** <pre>
     * 4002,"非法参数"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    ILLEGAL_ARGUMENT(4002,"非法参数"),
    /** <pre>
     * 4003,"抱歉,你无权限访问"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    FORBIDDEN(4003,"抱歉,你无权限访问"),
    /** <pre>
     * 4004, "请求的资源找不到"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    NOT_FOUND(4004, "请求的资源找不到"),
    /** <pre>
     * 4005,"通用参数错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    GENERAL_PARAMETER_ERROR(4005,"通用参数错误"),
    /** <pre>
     * 4006, "请勿重复操作"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    NOT_REPEAT_OPERATION(4006, "请勿重复操作"),
    /** <pre>
     * 4007,"异常错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    EXCEPTION_ERROR(4007,"异常错误"),
    /** <pre>
     * 500, "服务器内部错误"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    /** <pre>
     * 503,"服务器正忙，请稍后再试"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    SERVICE_UNAVAILABLE(503,"服务器正忙，请稍后再试"),

    //未知异常
    /** <pre>
     * 14000,"未知异常"
     * 绑定JSONResult.errorCode=code,JSONResult.msg=msg
     * </pre>  */
    UNKNOWN(14000,"未知异常");

    /** 错误码 */
    private Integer code;

    /** 错误描述 */
    private String msg;

    /** 私有构造函数 */
    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * @return 获取状态码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return 获取错误描述
     */
    public String getMsg() {
        return msg;
    }
}
