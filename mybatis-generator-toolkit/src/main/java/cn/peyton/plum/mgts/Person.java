package cn.peyton.plum.mgts;

import cn.peyton.plum.mgts.mybatis.annotation.Array;
import cn.peyton.plum.mgts.mybatis.annotation.Bigint;
import org.springframework.stereotype.Controller;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mgts.Person.java
 * @create date: 2021-11-23 17:22
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@Controller
@Array
public class Person {
    @Bigint
    @Array
    private String name;
    private Integer age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
