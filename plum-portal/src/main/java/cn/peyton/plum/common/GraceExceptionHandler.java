package cn.peyton.plum.common;

import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.core.exception.StatusCode;
import cn.peyton.plum.core.exception.child.AdviceException;
import cn.peyton.plum.core.exception.child.TransactionalException;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <h3>统一异常拦截处理</h3>
 * <h4>可以针对异常自定义去处理去捕获，返回指定的类型（json类型）到前端</h4>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @create date: 2021/11/1 0:33
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestControllerAdvice
public class GraceExceptionHandler {

    @ExceptionHandler(FileSizeLimitExceededException.class)
    public JSONResult returnMaxFileSizeLimit(FileSizeLimitExceededException e){

        return JSONResult.fail(500,"文件大小不能超过500KB");
    }

    @ExceptionHandler({AdviceException.class})
    public JSONResult exceptionHandler(AdviceException e) {
        return JSONResult.fail(10001,e.getMessage());
    }

    // @ExceptionHandler({Exception.class})
    // public JSONResult transactionalHandler(Exception e) {
    //     return JSONResult.fail(StatusCode.FAIL.getCode(), e.getMessage(),"持久层数据出错,事务回滚!");
    // }


}
