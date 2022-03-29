package cn.peyton.plum.mgts.mybatis.util;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mgts.mybatis.util.DatabaseUtils.java
 * @create date: 2021/11/8 23:54
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class DatabaseUtils {
    public final static String URL_SUFFIX = "?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true&useSSL=false";
    public static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    public static String URL_CHATTER = "jdbc:mysql://localhost:3306/db_chatter" + URL_SUFFIX;
    public static String USERNAME = "root";
    public static String PASSWORD = "hc2919";

    public DatabaseUtils() {
    }

}
