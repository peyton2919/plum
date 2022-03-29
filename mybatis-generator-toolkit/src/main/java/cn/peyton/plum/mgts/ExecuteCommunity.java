package cn.peyton.plum.mgts;

import cn.peyton.plum.mgts.mybatis.Generation;
import cn.peyton.plum.mgts.mybatis.util.DatabaseUtils;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mgts.Execute.java
 * @create date: 2021/11/8 23:49
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class ExecuteCommunity {

    public static String POJO = "cn.peyton.plum.community.pojo";
    public static String MAPPER = "cn.peyton.plum.community.mapper";
    public static String PARAM = "cn.peyton.plum.community.param";
    public static String PATH = "f:/community/";

   public static void main(String[] args){
       Generation generation = new Generation(DatabaseUtils.MYSQL_DRIVER, DatabaseUtils.URL_CHATTER,
               DatabaseUtils.USERNAME, DatabaseUtils.PASSWORD);

       generation.create("",PATH,MAPPER,POJO,true);
       generation.createParamCompatConvert(null,"","","tb_,sys_",PATH,PARAM);

   }

}
