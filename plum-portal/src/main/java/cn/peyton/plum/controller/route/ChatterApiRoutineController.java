package cn.peyton.plum.controller.route;

import cn.peyton.plum.controller.common.BaseController;
import cn.peyton.plum.core.base.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

/**
 * <h3>API Routine 基础类 用来标记 RequestMapping</h3>
 * <pre>
 *     定义了一些基础的方法 T: 当前 对象; K 当前 对象主键
 *     index(); 首页
 *     create(T t); 创建对象
 *     edit(T t); 编辑对象
 *     save(T t); 保存对象
 *     update(T t); 更新对象
 *     delete(K k); 删除对象
 *     getT(K k); 查找对象
 * </pre>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.community.controller.api.routine.BaseRoutineController.java
 * @create date: 2022/3/17 18:04
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Controller
@RequestMapping("/api/routine")
public abstract class ChatterApiRoutineController<T, K> extends BaseController<T, K> {


}
