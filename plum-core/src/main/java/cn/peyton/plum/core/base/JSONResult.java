package cn.peyton.plum.core.base;

import cn.peyton.plum.core.exception.StatusCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * <h3>自定义响应数据数据结构,保证序列化json时，如果是null对象，key也会消失</h3>
 * <h6>默认返回的code：</h6>
 * <h6>成功: 200</h6>
 * <h6>失败: 700</h6>
 * <h6>异常: 800</h6>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.base.JSONResult.java
 * @create date: 2021/10/31 23:36
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public final  class JSONResult<T> implements Serializable {
    /**
     * <pre>
     *     自定义的状态码
     *  状态码: 200 成功, 700 失败 , 800 异常
     * </pre>
     */
    private Integer code;
    /**  消息 */
    private String msg;
    /** 成功时要返回的数据 */
    private T data;
    /** 扩展数据 */
    private Object expand;
    /** 异常错误码  */
    private Integer errorCode;
    /**  response 带的状态码  */
    private Integer statusCode = -1;

    /**
     * <h>忽略字段</h>
     *
     * @return
     */
    public final JSONResult ignore(String... field) {

        return this;
    }

    /**
     * <h>包含字段</h>
     * @return
     */
    public final JSONResult comprise(String... field) {

        return this;
    }

    // ====================================== external method begin ====================================== //

    /**
     * <h4>成功</h4>
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> success() {
        return new JSONResult<T>(StatusCode.SUCCESS.getCode(),
                null,null,null,null,null);
    }

    /**
     * <h4>成功</h4>
     * @param msg 消息
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> success(String msg) {
        return new JSONResult<T>(StatusCode.SUCCESS.getCode(),
                null, msg,null,null,null);
    }

    /**
     * <h4>成功</h4>
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> success(T data) {
        return new JSONResult<T>(StatusCode.SUCCESS.getCode(),
                data,null,null,null,null);
    }

    /**
     * <h4>成功</h4>
     *
     * @param msg  消息
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> success(String msg, T data) {
        return new JSONResult<T>(StatusCode.SUCCESS.getCode(),data,
                msg,null,null,null);
    }

    /**
     * <h4>成功{带回扩展数据}</h4>
     * @param expand 扩展数据
     * @param msg    消息
     * @return JSONResult对象
     */
    public static JSONResult success(Object expand, String msg) {
        return new JSONResult(StatusCode.SUCCESS.getCode(),
                null, msg,null,expand,null);
    }

    /**
     * <h4>错误</h4>
     * @param msg 消息
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> fail(String msg) {
        return new JSONResult<T>(StatusCode.FAIL.getCode(),
                null, msg,null,null,null);
    }

    /**
     * <h4>错误</h4>
     * @param statusCode 状态码枚举,规定好给的提示
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> fail(StatusCode statusCode) {
        return new JSONResult<T>(StatusCode.FAIL.getCode(),
                null, statusCode.getMsg(),statusCode.getCode(),null,null);
    }


    /**
     * <h4>错误</h4>
     * <pre>
     *     默认 code: StatusCode.FAIL.getCode
     *          errorCode: StatusCode.FAIL_PARAM.getCode()
     * </pre>
     * @param data  消息
     * @return JSONResult对象
     */
    public static <T> JSONResult fail(T data) {
        return new JSONResult<T>(StatusCode.FAIL.getCode(),
                data,null,StatusCode.FAIL_PARAM.getCode(),null,null);
    }

    /**
     * <h4>错误</h4>
     * @param statusCode 状态码枚举,规定好给的提示
     * @param expand 扩展数据
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> fail(StatusCode statusCode,Object expand) {
        return new JSONResult<T>(StatusCode.FAIL.getCode(),
                null, statusCode.getMsg(),statusCode.getCode(),expand,null);
    }

    /**
     * <h4>错误</h4>
     * @param errorCode 失败时,规定好给的提示
     * @param msg  消息
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> fail(Integer errorCode, String msg) {
        return new JSONResult<T>(StatusCode.FAIL.getCode(),
                null,msg,errorCode,null,null);
    }

    /**
     * <h4>错误</h4>
     * @param errorCode 失败时,规定好给的提示
     * @param expand 扩展对象
     * @param msg    消息
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> fail(Integer errorCode, Object expand, String msg) {
        return new JSONResult<T>(StatusCode.FAIL.getCode(),
                null,msg,errorCode, expand, null);
    }

    /**
     * <h4>异常</h4>
     * @param errorCode 异常时,规定好给的提示
     * @param msg    消息
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> error(Integer errorCode,String msg) {
        return new JSONResult<T>(StatusCode.ERROR.getCode(),
                null, msg, errorCode, null, null);
    }

    /**
     * <h4>异常</h4>
     * @param statusCode 状态码枚举,规定好给的提示
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> error(StatusCode statusCode) {
        return new JSONResult<T>(StatusCode.ERROR.getCode(),
                null, statusCode.getMsg(), statusCode.getCode(), null, null);
    }

    /**
     * <h4>异常</h4>
     * @param errorCode 异常时,规定好给的提示
     * @param msg    消息
     * @param expand 扩展对象
     * @param <T> 申明泛型数据类型
     * @return JSONResult对象
     */
    public static <T> JSONResult<T> error(Integer errorCode,String msg,Object expand) {
        return new JSONResult<T>(StatusCode.ERROR.getCode(),
                null, msg, errorCode, expand, null);
    }


    // ====================================== external method end ====================================== //

    // ====================================== Get and Set begin ====================================== //

    /**
     * @return 自定义状态码: 200 成功, 700 失败 , 800 异常
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return 消息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @return 成功时要返回的数据
     */
    public T getData() {
        return data;
    }

    /**
     * @param code 自定义 状态码: 200 成功, 700 失败 , 800 异常
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @param msg 消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @param data 成功时要返回的数据
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return 扩展数据
     */
    public Object getExpand() {
        return expand;
    }

    /**
     * @param expand 扩展数据
     */
    public void setExpand(Object expand) {
        this.expand = expand;
    }

    /**
     * @return 异常错误码
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode 异常错误码
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return response 带的状态码
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode response 带的状态码
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    // ====================================== Get and Set end ====================================== //

    // ====================================== private constructor begin ====================================== //
    /** 构造函数 */
    public JSONResult() { }

    /** 构造函数 */
    private JSONResult(Integer code,T data,String msg,
                       Integer errorCode,Object expand,Integer statusCode){
        this.code = code;
        if(null != data){ this.data = data;}
        if(null != msg){  this.msg = msg;}
        if(null != errorCode){ this.errorCode = errorCode;}
        if(null != expand) {this.expand = expand;}
        if(null != statusCode){this.statusCode = statusCode;}
    }
    /**
     * <h4>判断是否成功</h4>
     *
     * @return 成功true
     */
    @JsonIgnore //使之不在json序列化结果当中
    public boolean isSuccess() {
        return this.code == StatusCode.SUCCESS.getCode();
    }

    /**
     * <h4>数据封装到Map</h4>
     *
     * @return Map<String, Object>对象
     */
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", code);
        result.put("msg", msg);
        result.put("data", data);
        result.put("expand", expand);
        result.put("errorCode", errorCode);
        result.put("statusCode", statusCode);
        return result;
    }

    // ====================================== private constructor end ====================================== //
}
