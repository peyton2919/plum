package cn.peyton.plum.chatter.service.impl;


import cn.peyton.plum.chatter.mapper.AppUpdateMapper;
import cn.peyton.plum.chatter.param.AppUpdateParam;
import cn.peyton.plum.chatter.service.AppUpdateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h3>应用程序更新 Service 实现类 .service.impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
@Service("appUpdateService")
public class AppUpdateServiceImpl implements AppUpdateService {
	@Resource
	private AppUpdateMapper appUpdateMapper;

    @Override
    public AppUpdateParam findByNewApp() {
        return new AppUpdateParam().compat(appUpdateMapper.findByNewApp());
    }

    @Override
    public boolean update(AppUpdateParam param) {

        return appUpdateMapper.updateByPrimaryKeySelective(param.convert()) > 0 ? true : false;
    }
}
