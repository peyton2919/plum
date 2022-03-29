package cn.peyton.plum.chatter.service.impl;


import cn.peyton.plum.chatter.bo.AdsenseBo;
import cn.peyton.plum.chatter.mapper.AdsenseMapper;
import cn.peyton.plum.chatter.param.AdsenseParam;
import cn.peyton.plum.chatter.pojo.Adsense;
import cn.peyton.plum.chatter.service.AdsenseService;
import cn.peyton.plum.core.mybatis.utils.PageQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 广告 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("adsenseService")
public class AdsenseServiceImpl implements AdsenseService {
	@Resource
	private AdsenseMapper adsenseMapper;


    @Override
    public List<AdsenseParam> findByType(Integer type, PageQuery page) {
        return new AdsenseBo().adapter(adsenseMapper.findByType(type,page));
    }
}
