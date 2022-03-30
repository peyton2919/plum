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

    /** 成功 */
    SUCCESS(200,"SUCCESS"),
    /** 错误返回码 */
    FAIL(800,"fail"),
    ERROR(700,"异常"),
    //自定义系列
    USER_NAME_IS_NOT_NULL(7001,"【参数校验】用户名不能为空"),
    PWD_IS_NOT_NULL(7002,"【参数校验】密码不能为空"),
    NAME_PWD_IS_NOT_NULL(7003,"【参数校验】用户名或密码不能为空"),
    VALID_ERROR(7004,"【参数校验】属性验证错误"),
    PARAM_ERROR(7005,"【参数校验】参数异常"),
    GENERAL_PARAMETER_ERROR(8000,"通用参数错误"),
    RESOURCES_NOT_FOUND(8001,"资源未找到！"),
    ILLEGAL_TOKEN(8002, "非法token!"),
    TOKEN_EXPIRE(8006,"token过期"),
    DROP_OUT(8003, "你已经退出了"),
    BINGING_TYPE_CONFLICT(8004, "绑定类型冲突！"),
    HAS_BEEN_BOUND(8005, "已经被绑定了！"),
    VERIFICATION_CODE_ERROR(3000, "发送验证码错误"),
    SEND_VERIFICATION_FAST(3001, "发送验证码太快了！"),
    INVALID_NUMBER(3002, "无效号码！"),
    TRIGGER_DAY_LIMIT(3003, "触发日限制！"),
    FAILED_TO_SEND(3004, "发送失败！"),
    NOT_SMS_SEND(3005, "未开启发送短信"),
    REGET_VERIFICATION_CODE(3006, "请重新获取验证码！"),
    NOT_REPEAT_OPERATION(3007, "请勿重复操作！"),
    //400系列
    BAD_REQUEST(400,"请求的数据格式不符!"),
    UNAUTHORIZED(401,"登录凭证过期!"),
    /** 非法参数 */
    ILLEGAL_ARGUMENT(402,"非法参数！"),
    FORBIDDEN(403,"抱歉，你无权限访问!"),
    NOT_FOUND(404, "请求的资源找不到!"),
    /** 需要登录 */
    NEED_LOGIN(405,"需要登录!"),
    EXCEPTION_ERROR(410,"异常错误!"),
    USER_NOT_EXIST(411,"用户不存在！"),
    USER_DISABLED(412, "用户被禁用！"),
    PASSWORD_WRONG(413, "密码错误!"),
    USERNAME_PASSWORD_WRONG(7004,"用户名称密码错误!"),


    //500系列
    INTERNAL_SERVER_ERROR(500, "服务器内部错误!"),
    SERVICE_UNAVAILABLE(503,"服务器正忙，请稍后再试!"),

    //未知异常
    UNKNOWN(10000,"未知异常!");

    /** 错误码 */
    private Integer code;

    /** 错误描述 */
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
