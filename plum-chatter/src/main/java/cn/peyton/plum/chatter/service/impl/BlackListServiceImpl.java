package cn.peyton.plum.chatter.service.impl;

import cn.peyton.plum.chatter.mapper.BlackListMapper;
import cn.peyton.plum.chatter.param.BlackListParam;
import cn.peyton.plum.chatter.service.BlackListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3>拉黑 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("blackListService")
public class BlackListServiceImpl implements BlackListService {
	@Resource
	private BlackListMapper blackListMapper;

    @Override
    public boolean add(BlackListParam param) {
        return blackListMapper.insertSelective(param.convert()) > 0 ? true : false;
    }

    @Override
    public boolean isUserIdAndBlackId(Integer userId, Integer blackId) {
        return blackListMapper.checkUserIdAndBlackId(userId,blackId) > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer userId, Integer blackId) {
        return blackListMapper.deleteByUserIdAndBlackId(userId, blackId) > 0 ? true : false;
    }

}
