package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.mapper.SupportMapper;
import cn.peyton.plum.chatter.param.SupportParam;
import cn.peyton.plum.chatter.pojo.Support;
import cn.peyton.plum.chatter.service.SupportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3>顶踩 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("supportService")
public class SupportServiceImpl implements SupportService {
	@Resource
	private SupportMapper supportMapper;

    @Override
    public SupportParam isSupport(Integer userId, Integer postId) {
        Support support = supportMapper.checkSupport(userId, postId);
        if (null != support){
            return new SupportParam().compat(support);
        }
        return null;
    }

    @Override
    public SupportParam create(SupportParam param) {
        Support _support = param.convert();
        if (supportMapper.insertSelective(_support) > 0) {
            return new SupportParam().compat(_support);
        }
        return null;
    }

    @Override
    public boolean update(SupportParam param) {
        return supportMapper.updateByPrimaryKeySelective(param.convert()) > 0 ? true : false;
    }

    @Override
    public int findDingAndCaiByPostId(Integer postId, Integer type) {
        return supportMapper.findDingAndCaiByPostId(postId,type);
    }
}
