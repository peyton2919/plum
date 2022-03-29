package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.ImagesParam;

import java.util.List;

/**
 * <h3>图片 Service 接口 .service</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface ImagesService {

    /**
     * <h4>批量插入</h4>
     * @param imagesList 图片对象集合
     * @return 刚插入的图片对象集合
     */
    List<ImagesParam> insertBatch(List<ImagesParam> imagesList);

}
