package cn.peyton.plum.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>配置 Mapper 持久层类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.config.MapperConfig.java
 * @create date: 2022/3/19 13:32
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Configuration
@MapperScan(basePackages = "cn.peyton.plum.*.mapper")
public class MyMapperConfig {
}
