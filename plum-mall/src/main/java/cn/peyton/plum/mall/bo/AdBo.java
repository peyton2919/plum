package cn.peyton.plum.mall.bo;

import cn.peyton.plum.core.base.BaseConvertBo;
import cn.peyton.plum.mall.pojo.Ad;
import cn.peyton.plum.mall.vo.AdVo;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mall.bo.AdBo.java
 * @create date: 2022-04-12 13:49
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class AdBo extends BaseConvertBo<AdVo, Ad> {
    @Override
    public AdVo compat(Ad info) {
        AdVo _adVo = new AdVo();
        _adVo.setId(info.getId()+"");
        _adVo.setSrc(info.getSrc());
        _adVo.setTitle(info.getTitle());
        _adVo.setLocation(convertIntToStr(info.getLocation()));
        return _adVo;
    }

    @Override
    public Ad convert(AdVo info) {
        if (null == info){return  null;}
        Ad _ad = new Ad();
        if (null == info.getId() ){
            _ad.setId(Long.parseLong(info.getId()));
        }
        _ad.setSrc(info.getSrc());
        _ad.setTitle(info.getTitle());
        _ad.setLocation(convertStrToInt(info.getLocation()));
        return _ad;
    }

    // 转换 Location
    private String convertIntToStr(Integer va) {
        switch (va) {
            case 1:
                return "up";
            case 2:
                return "down";
            default:
                return "left";
        }
    }
    // 转换 Location
    private Integer convertStrToInt(String va) {
        if ("up".equals(va)) {
            return 1;
        }
        if ("down".equals(va)) {
            return 2;
        }
        return 0;
    }
}
