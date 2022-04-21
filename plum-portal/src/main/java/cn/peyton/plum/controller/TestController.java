package cn.peyton.plum.controller;

import cn.peyton.plum.core.base.JSONResult;
import cn.peyton.plum.mall.mapper.GoodsCardValueMapper;
import cn.peyton.plum.mall.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.controller.TestController.java
 * @create date: 2022-04-13 18:45
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
@RestController
public class TestController {

    @Resource
    GoodsBannerService goodsBannerService;
    @Resource
    GoodsAttrService goodsAttrService;
    @Resource
    GoodsSkuCardService goodsSkuCardService;
    @Resource
    GoodsService goodsService;
    @Resource
    GoodsCardValueMapper goodsCardValueMapper;


    @GetMapping("/test1")
    public JSONResult index() {





        // return JSONResult.success(goodsCardValueMapper.findByGoodsId(1L));
        // return JSONResult.success(goodsService.findJoinByGoodsId(1L));
        return JSONResult.success(goodsSkuCardService.findByGoodsId(1L));
        // return JSONResult.success(goodsAttrService.findByGoodsId(1L));
        // return JSONResult.success(goodsBannerService.findByGoodsId(1L));
    }
}
