package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.AppIndexData;
import cn.peyton.plum.mall.service.AppIndexDataService;
import cn.peyton.plum.mall.mapper.AppIndexDataMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 首页数据 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
@Service("appIndexDataService")
public class AppIndexDataServiceImpl implements AppIndexDataService {
	@Resource
	private AppIndexDataMapper appIndexDataMapper;

    @Override
    public List<AppIndexData> finds() {
        return appIndexDataMapper.finds();
    }

    @Override
    public List<AppIndexData> findByAppIndexCategoryId(int indexCategoryIe) {
        return appIndexDataMapper.findByAppIndexCategoryId(indexCategoryIe);
    }
}
