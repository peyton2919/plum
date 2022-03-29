package cn.peyton.plum.core.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

/**
 * <h3>Request 工具类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.core.utils.HttpServletRequestUtils.java
 * @create date: 2021/11/25 0:04
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class HttpServletRequestUtil implements Serializable {

    /**
     * <h3>获取 int类型值 </h3>
     * @param request Request对象
     * @param key 键
     * @return
     */
    public static int getInt(HttpServletRequest request, String key) {
        try {
            return Integer.decode(request.getParameter(key));
        } catch (Exception e) {
            return -1;
        }
    }
    /**
     * <h3>获取 Long类型值 </h3>
     * @param request Request对象
     * @param key 键
     * @return
     */
    public static Long getLong(HttpServletRequest request, String key) {
        try {
            return Long.valueOf(request.getParameter(key));
        } catch (Exception e) {
            return -1L;
        }
    }
    /**
     * <h3>获取 Double类型值 </h3>
     * @param request Request对象
     * @param key 键
     * @return
     */
    public static Double getDouble(HttpServletRequest request, String key) {
        try {
            return Double.valueOf(request.getParameter(key));
        } catch (Exception e) {
            return -1d;
        }
    }
    /**
     * <h3>获取 Boolean类型值 </h3>
     * @param request Request对象
     * @param key 键
     * @return
     */
    public static Boolean getBoolean(HttpServletRequest request, String key) {
        try {
            return Boolean.valueOf(request.getParameter(key));
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * <h3>获取 String 类型值 </h3>
     * @param request Request对象
     * @param key 键
     * @return
     */
    public static String getString(HttpServletRequest request, String key) {
        try {
            String result = request.getParameter(key);
            if (null != result) {
                result = result.trim();
            }
            if ("".equals(result)) {
                result = null;
            }
            return result;
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * <h4>赋值</h4>
     * @param parameterMap 参数集合
     * @param className 类名
     * @param <T>
     * @return
     */
    public static  <T> T voluation(Map<String, String[]> parameterMap, String className) {
        Class<?> c = null;
        T _bean = null;
        try {
            c = Class.forName(className);
            _bean = (T) c.getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            try {
                //赋值
                String[] value = parameterMap.get(name);
                if (null != value) {
                    field.setAccessible(true);
                    String type = field.getType().getTypeName();
                    String _v = value[0];
                    if (type.equals("int")){
                        field.setInt(_bean,Integer.parseInt((_v == null || "".equals(_v)) ? "0" : _v));
                    }else if ( type.equals("java.lang.Integer")){
                        field.set(_bean,Integer.valueOf(_v));
                    }else if (type.equals("float")){
                        field.setFloat(_bean,Float.parseFloat((_v == null || "".equals(_v)) ? "0" : _v));
                    }else if (type.equals("java.lang.Float")){
                        field.setFloat(_bean,Float.valueOf(_v));
                    }else if (type.equals("long")){
                        field.setLong(_bean,Long.parseLong((_v == null || "".equals(_v)) ? "0" : _v));
                    }else if (type.equals("java.lang.Long")){
                        field.setLong(_bean,Long.valueOf(_v));
                    }else if (type.equals("double")){
                        field.setDouble(_bean,Double.parseDouble((_v == null || "".equals(_v)) ? "0" : _v));
                    }else if (type.equals("java.lang.Double")){
                        field.setDouble(_bean,Double.valueOf(_v));
                    }else if (type.equals("short")){
                        field.setShort(_bean,Short.parseShort((_v == null || "".equals(_v)) ? "0" : _v));
                    }else if (type.equals("java.lang.Short")){
                        field.setShort(_bean,Short.valueOf(_v));
                    }else if (type.equals("char")){
                        field.setChar(_bean, (_v == null) ? ' ' : _v.charAt(0));
                    }else if (type.equals("boolean")) {
                        field.setBoolean(_bean,Boolean.parseBoolean((_v == null || "".equals(_v)) ? "false" : _v));
                    }else if (type.equals("java.lang.Boolean")) {
                        field.setBoolean(_bean,Boolean.valueOf(_v));
                    }else if (type.equals("java.util.Date")){
                        Date date = DateUtil.conventStr2Date(_v, "yyyy-MM-dd HH:mm:ss");
                        if (null != date) {
                            field.set(_bean,date);
                        }
                    }else {
                        field.set(_bean,_v);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return _bean;
    }


    /**
     * <h4>判断是否是基础类型</h4>
     * @param typeName 基类类型名称
     * @return 返回 true 表示 基础类型 ; false 表示 对象
     */
    public static boolean isBaseType(String typeName) {
        String baseType ="int,java.lang.Integer,float,java.lang.Float,java.lang.Character" +
                "long,java.lang.Long,java.lang.String,double,java.lang.Double," +
                "short,java.lang.Short,char,byte,boolean,java.lang.Boolean,java.util.Date";
        return baseType.contains(typeName);

    }

    /**
     * <h4>判断是否是数值类型</h4>
     * @param typeName 类型名称
     * @return
     */
    public static boolean isNumberType(String typeName) {
        String baseType ="int,float,long,double,short";
        return baseType.contains(typeName);
    }

    /**
     * <h4>排除一些javax 下的类</h4>
     * @param typeName 类型名称
     * @return 返回 true 表示 是javax或spring自带 包下对象 ; false 表示 不是 javax或spring自带 包下对象
     */
    public static boolean isExclude(String typeName) {
        if (null == typeName || "".equals(typeName)) {
            return false;
        }
        return typeName.contains("javax") || typeName.contains("org.springframework");
    }

}
