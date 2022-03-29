package cn.peyton.plum.core.inf.service;

/**
 * <h3>判断重名 Service 接口 .</h3>
 * <pre>
 *     <b style= "color:red;">K 为主键</b>
 *     <b>1.判断重名</b>
 *          int countByName( K id, String name);
 * </pre>
 * <pre>
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @projectName: lemon
 * @packageName: cn.peyton.spring.inf.IServiceRename.java
 * @createDate: 2018/9/13 11:55
 * @version: 1.0.0
 * </pre>
 */
public interface IServiceRename<K> {

    /**
     * <h4>判断是否重名</h4>
     * @param id 编号
     * @param name 名称
     * @return  重名 为 true
     */
    boolean countByName(K id, String name);
}
