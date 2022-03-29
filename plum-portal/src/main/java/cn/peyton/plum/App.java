package cn.peyton.plum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h3>
 *     1.当前项目为springboot工程，这是一个启动类，也是应用程序入口类。<br>
 *     2.启动类需要放在根包路径之下，因为他会默认扫描controller、service以及mapper等一些相关组件。<br>
 *       扫描完之后，会放入到spring/springboot容器中。
 * </h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @create date: 2021/10/31 19:42
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }




}
