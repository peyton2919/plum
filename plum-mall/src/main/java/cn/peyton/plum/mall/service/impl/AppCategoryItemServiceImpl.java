package cn.peyton.plum.mall.service.impl;

import cn.peyton.plum.mall.service.AppCategoryItemService;
import cn.peyton.plum.mall.mapper.AppCategoryItemMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <h3> 分类Item Service 实现类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 10:43:34
 * @version 1.0.0
 * </pre>
*/
@Service("appCategoryItemService")
public class AppCategoryItemServiceImpl implements AppCategoryItemService {
	@Resource
	private AppCategoryItemMapper appCategoryItemMapper;

}
