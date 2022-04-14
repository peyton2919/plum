package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.GoodsComment;
import cn.peyton.plum.mall.service.GoodsCommentService;
import cn.peyton.plum.mall.mapper.GoodsCommentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 商品评论 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/14 08:57:54
 * @version 1.0.0
 * </pre>
*/
@Service("goodsCommentService")
public class GoodsCommentServiceImpl implements GoodsCommentService {
	@Resource
	private GoodsCommentMapper goodsCommentMapper;

    @Override
    public List<GoodsComment> findByGoodsId(Long goodsId) {
        return goodsCommentMapper.findByGoodsId(goodsId);
    }
}
