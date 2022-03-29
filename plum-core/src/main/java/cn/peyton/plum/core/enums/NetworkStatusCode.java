package cn.peyton.plum.core.enums;

/**
 * <h3>网络状态码</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.enums.NetworkStatusCode.java
 * @create date: 2022/3/19 13:14
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public enum NetworkStatusCode {
    ERROR_100(100,"请求已经被服务器接收，且仍未被拒绝,应当继续发送请求的剩余部分。"),
    ERROR_101(101,"服务器已经理解了客户端的请求，并将通过Upgrade 消息头通知客户端采用不同的协议来完成这个请求。"),
    ERROR_102(102,"由WebDAV（RFC 2518）扩展的状态码，代表处理将被继续执行。"),
    ERROR_200(200,"请求已成功，请求所希望的响应头或数据体将随此响应返回。"),
    ERROR_201(201,"请求已经被实现，而且有一个新的资源已经依据请求的需要而建立，且其 URI 已经随Location 头信息返回。"),
    ERROR_202(202,"服务器已接受请求，但尚未处理。正如它可能被拒绝一样，最终该请求可能会也可能不会被执行"),
    ERROR_204(204,"服务器成功处理了请求，但不需要返回任何实体内容，并且希望返回更新了的元信息。"),
    ERROR_400(400,"语义有误、请求参数有误当前请求无法被服务器理解。"),
    ERROR_401(401,"当前请求需要用户验证。"),
    ERROR_403(403,"服务器已经理解请求。"),
    ERROR_404(404,"请求失败，请求所希望得到的资源未被在服务器上发现。"),
    ERROR_500(500,"服务器遇到了一个未曾预料的状况，导致了它无法完成对请求的处理。"),
    ;


    /**
     * <h3>根据传入的 code 返回相应的enum值</h3>
     * @param code
     * @return
     */
    public static NetworkStatusCode get(int code) {
        for (NetworkStatusCode statusCode : values()) {
            if (statusCode.getCode() == code) {
                return  statusCode;
            }
        }
        return null;
    }
    /**
     * <h3>私有的构造函数</h3>
     * @param code 结果状态 状态标识
     * @param state
     */
    private NetworkStatusCode(int code,String state){
        this.code = code;
        this.state = state;
    }

    /** 状态码 */
    private int code;
    /** 描述 */
    private String state;

    public int getCode() {
        return code;
    }

    public String getState() {
        return state;
    }
}
