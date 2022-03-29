package cn.peyton.plum.core.base;

import cn.peyton.plum.core.exception.StatusCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>自定义响应数据数据结构,保证序列化json时，如果是null对象，key也会消失</h3>
 * <h4>本类可提供给H5/IOS/安卓/公众号/小程序 使用</h4>
 * <h4>前端接受此类数据（json object）后，可自行根据业务去实现相关功能</h4>
 * <h4>200：表示成功</h4>
 * <h4>500：表示错误，错误信息在msg字段中</h4>
 * <h4>501：表示bean验证错误，不管多少个错误都以map形式返回</h4>
 * <h4>502：表示拦截器截到用户token出错</h4>
 * <h4>555：表示异常抛出信息</h4>
 * <h4>556：表示用户qq校验异常</h4>
 * <h4>557：</h4>
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
public final class JSONResult<T> implements Serializable {
    /**
     * <pre>
     *     自定义的状态码
     * 状态码 200成功, 其它 异常和失败
     * </pre>
     */
    private int status;
    private boolean ret = true;
    /**
     * 消息
     */
    private String msg;
    /**
     * 成功时要返回的数据
     */
    private T data;
    /**
     * 扩展数据
     */
    private Object expand;
    /**
     * 异常错误码
     */
    private int errorCode;

    /** response 带的状态码  */
    private int statusCode;


    // ====================================== external method begin ====================================== //

    /**
     * <h4>判断是否成功</h4>
     *
     * @return 成功true
     */
    @JsonIgnore //使之不在json序列化结果当中
    public boolean isSuccess() {
        return this.status == StatusCode.SUCCESS.getCode();
    }

    /**
     * <h4>数据封装到Map</h4>
     *
     * @return Map<String, Object>对象
     */
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", status);
        result.put("ret", ret);
        result.put("msg", msg);
        result.put("data", data);
        result.put("expand", expand);
        result.put("errorCode", errorCode);
        result.put("statusCode", statusCode);
        return result;
    }

    /**
     * <h4>成功</h4>
     *
     * @param <T> 申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success() {
        return new JSONResult<T>(StatusCode.SUCCESS.getCode());
    }

    /**
     * <h4>成功</h4>
     *
     * @param msg 消息
     * @param <T> 申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success(String msg) {
        return new JSONResult<T>(StatusCode.SUCCESS.getCode(), msg);
    }

    /**
     * <h4>成功</h4>
     *
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success(T data) {
        return new JSONResult<>(StatusCode.SUCCESS.getCode(), data);
    }

    /**
     * <h4>成功</h4>
     *
     * @param msg  消息
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success(String msg, T data) {
        return new JSONResult<>(StatusCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * <h4>成功</h4>
     *
     * @param sc  消息
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success(StatusCode sc, T data) {
        return new JSONResult<>(sc, data, null);
    }

    /**
     * <h4>成功</h4>
     *
     * @param sc  消息
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @param expand  扩展数据
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success(StatusCode sc, T data, Object expand) {
        return new JSONResult<>(sc, data, expand);
    }

    /**
     * <h4>成功</h4>
     *
     * @param sc  消息
     * @param data 成功时要返回的数据
     * @param <T>  申明泛型数据类型
     * @param expand  扩展数据
     * @param statusCode  response 带的状态码
     * @return JsonData对象
     */
    public static <T> JSONResult<T> success(StatusCode sc, T data, Object expand, int statusCode) {
        return new JSONResult<>(sc, data, expand,statusCode);
    }

    /**
     * <h4>错误</h4>
     *
     * @param <T> 申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> error(StatusCode statusCode) {
        return new JSONResult<T>(statusCode.getCode(), statusCode.getMsg());
    }

    /**
     * <h4>错误</h4>
     * @param status 自定义的状态码
     * @param msg 信息
     * @param statusCode response 带的状态码
     * @param <T>
     * @return
     */
    public static <T> JSONResult<T> error(int status, String msg, int statusCode) {
        return new JSONResult<T>(status, msg, statusCode);
    }

    /**
     * <h4>错误</h4>
     * @param status 自定义的状态码
     * @param msg 信息
     * @param statusCode response 带的状态码
     * @param errorCode 异常错误码
     * @param <T>
     * @return
     */
    public static <T> JSONResult<T> error(int status, String msg, int statusCode,int errorCode) {
        return new JSONResult<T>(status, msg, statusCode,errorCode);
    }
    /**
     * <h4>错误</h4>
     *
     * @param code 状态码 200成功, 其它 异常和失败
     * @param expand 扩展对象
     * @param msg  消息
     * @param <T>  申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> fail(int code,Object expand, String msg) {
        return new JSONResult<T>(code,expand, msg);
    }

    /**
     * <h4>错误</h4>
     * @param code 状态码 200成功, 其它 异常和失败
     * @param msg  消息
     * @param <T>  申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> fail(int code, String msg) {
        return new JSONResult<T>(code, msg);
    }

    /**
     * <h4>错误</h4>
     * @param code 状态码 200成功, 其它 异常和失败
     * @param errorCode  异常错误码
     * @param msg  消息
     * @param <T>  申明泛型数据类型
     * @return JsonData对象
     */
    public static <T> JSONResult<T> fail(int code,int errorCode, String msg) {
        return new JSONResult<T>(code,errorCode, msg);
    }

    // ====================================== external method end ====================================== //

    // ====================================== Get and Set begin ====================================== //

    /**
     * @return 自定义的状态码; 状态码 200成功, 其它 异常和失败
     */
    public int getStatus() {
        return status;
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
     * @return
     */
    public boolean isRet() {
        return ret;
    }

    /**
     * @param status 自定义的状态码; 状态码 200成功, 其它 异常和失败
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @param ret
     */
    public void setRet(boolean ret) {
        this.ret = ret;
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
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode 异常错误码
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return response 带的状态码
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode response 带的状态码
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    // ====================================== Get and Set end ====================================== //

    // ====================================== private constructor begin ====================================== //

    public JSONResult() { }
    /**
     * <h4>私有构造函数</h4>
     *
     * @param status 状态码 200成功, 其它 异常和失败
     */
    private JSONResult(int status) {
        this.status = status;
    }

    /**
     * <h4>私有构造函数</h4>
     *
     * @param status 状态码 200成功, 其它 异常和失败
     * @param msg    消息
     */
    private JSONResult(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    /**
     * <h4>错误</h4>
     *
     * @param status 状态码 200成功, 其它 异常和失败
     * @param expand 扩展对象
     * @param msg  消息
     * @return JsonData对象
     */
    private JSONResult(int status, Object expand, String msg) {
        this.status = status;
        this.msg = msg;
        this.expand = expand;
    }

    /**
     * <h4>错误</h4>
     * @param status 状态码 200成功, 其它 异常和失败
     * @param errorCode  异常错误码
     * @param msg  消息
     * @return JsonData对象
     */
    private JSONResult(int status, int errorCode, String msg) {
        this.status = status;
        this.errorCode = errorCode;
        this.msg = msg;
    }


    /**
     * <h4>私有构造函数</h4>
     *
     * @param status 状态码 200成功, 其它 异常和失败
     * @param data   成功时要返回的数据
     */
    private JSONResult(int status, T data) {
        this.status = status;
        this.data = data;
    }

    /**
     * <h4>私有构造函数</h4>
     *
     * @param status 状态码 200成功, 其它 异常和失败
     * @param msg    消息
     * @param data   成功时要返回的数据
     */
    private JSONResult(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;

    }
    /**
     * <h4>成功</h4>
     *
     * @param sc  消息
     * @param data 成功时要返回的数据
     * @param expand  扩展数据
     * @return JsonData对象
     */
    private JSONResult(StatusCode sc, T data, Object expand){
        this.status = sc.getCode();
        this.msg = sc.getMsg();
        this.data = data;
        this.expand = expand;
    }

    /**
     * <h4>成功</h4>
     *
     * @param sc  消息
     * @param data 成功时要返回的数据
     * @param expand  扩展数据
     * @param statusCode  response 带的状态码
     * @return JsonData对象
     */
    private JSONResult(StatusCode sc, T data, Object expand, int statusCode){
        this.status = sc.getCode();
        this.msg = sc.getMsg();
        this.data = data;
        this.expand = expand;
        this.statusCode = statusCode;
    }

    /**
     * <h4>错误</h4>
     * @param status 自定义的状态码
     * @param msg 信息
     * @param statusCode response 带的状态码
     * @return
     */
    private JSONResult(int status, String msg, int statusCode) {
        this.status = status;
        this.msg = msg;
        this.statusCode =statusCode;
    }

    /**
     * <h4>错误</h4>
     * @param status 自定义的状态码
     * @param msg 信息
     * @param statusCode response 带的状态码
     * @return
     */
    private JSONResult(int status, String msg, int statusCode, int errorCode) {
        this.status = status;
        this.msg = msg;
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }


    // ====================================== private constructor end ====================================== //

}
