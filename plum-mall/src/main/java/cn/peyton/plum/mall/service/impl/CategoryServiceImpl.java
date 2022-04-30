package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.pojo.Category;
import cn.peyton.plum.mall.service.CategoryService;
import cn.peyton.plum.mall.mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h3> 分类信息 Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	@Resource
	private CategoryMapper categoryMapper;

    @Override
    public List<Category> finds() {
        return categoryMapper.finds();
    }
}
