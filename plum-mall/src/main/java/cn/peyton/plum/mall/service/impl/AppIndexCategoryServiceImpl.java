package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.AppIndexCategory;
import cn.peyton.plum.mall.service.AppIndexCategoryService;
import cn.peyton.plum.mall.mapper.AppIndexCategoryMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 首页分类 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
@Service("appIndexCategoryService")
public class AppIndexCategoryServiceImpl implements AppIndexCategoryService {
	@Resource
	private AppIndexCategoryMapper appIndexCategoryMapper;

    @Override
    public List<AppIndexCategory> finds() {
        return appIndexCategoryMapper.finds();
    }
}
