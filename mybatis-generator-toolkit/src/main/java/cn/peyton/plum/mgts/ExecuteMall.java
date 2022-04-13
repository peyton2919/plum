package cn.peyton.plum.mgts;


import cn.peyton.plum.mgts.mybatis.Generation;
import cn.peyton.plum.mgts.mybatis.util.DatabaseUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mgts.ExecuteMall.java
 * @create date: 2022-04-10 9:21
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public class ExecuteMall {

    public static String POJO = "cn.peyton.plum.mall.pojo";
    public static String MAPPER = "cn.peyton.plum.mall.mapper";
    public static String PARAM = "cn.peyton.plum.mall.param";
    public static String PATH = "f:/temp/mall2/";

    public static void main(String[] args) {
        DatabaseUtil util = new DatabaseUtil("db_plum");
        Generation generation = new Generation(util);
        // 全部数据
        // generation.create(null,PATH,MAPPER,POJO,true);

        // 单个数据
        generation.create("collect",null,PATH,MAPPER,POJO,true);
        // generation.create("goods_attr",null,PATH,MAPPER,POJO,true);
        // generation.create("goods_sku",null,PATH,MAPPER,POJO,true);
        // generation.create("goods_sku_card",null,PATH,MAPPER,POJO,true);
        // generation.create("goods_sku_card_value",null,PATH,MAPPER,POJO,true);
        // generation.create("member_address",null,PATH,MAPPER,POJO,true);
        // generation.create("goods_banner",null,PATH, MAPPER,POJO,false);

        // Table goods_banner = generation.getTable("goods_banner", null);
        // System.out.println(goods_banner);

    }
}
