package cn.peyton.plum.controller.common;

import cn.peyton.plum.core.validator.Regulation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <h3>BigDecimal 数值工具类</h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.common.BigDecimalUtil.java
 * @create date: 2022-04-12 0:13
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class BigDecimalUtil implements Serializable {

    /**
     * BigDecimal 转 字符串 保留二个小数位
     * @param decimal 数值
     * @return 保留二个小数位
     */
    public static String getString(BigDecimal decimal) {
        if (null == decimal)return null;
        return decimal.setScale(2, RoundingMode.HALF_UP).toString();
    }

    /**
     * 字符串 转 BigDecimal 超出返回 0.00
     * @param value 值 格式：(-)1234567890.001
     * @return 保留二个小数位
     */
    public static BigDecimal getDecimal(String value) {
        if (Regulation.regex(Regulation.REGEX_DECIMAL,value)){
            return BigDecimal.valueOf(Double.parseDouble(value))
                    .setScale(2,RoundingMode.HALF_UP);
        }
        return BigDecimal.valueOf(0.00);
    }

}
