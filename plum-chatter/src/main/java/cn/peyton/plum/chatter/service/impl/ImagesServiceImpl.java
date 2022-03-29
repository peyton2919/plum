package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.bo.ImagesBo;
import cn.peyton.plum.chatter.mapper.ImagesMapper;
import cn.peyton.plum.chatter.param.ImagesParam;
import cn.peyton.plum.chatter.pojo.Images;
import cn.peyton.plum.chatter.service.ImagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3>图片 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("imagesService")
public class ImagesServiceImpl implements ImagesService {
	@Resource
	private ImagesMapper imagesMapper;

    @Override
    public List<ImagesParam> insertBatch(List<ImagesParam> imagesList) {
        List<Images> _oImages = new ImagesBo().reverse(imagesList);
        imagesMapper.insertBatch(_oImages);
        return new ImagesBo().adapter(_oImages);
    }
}
