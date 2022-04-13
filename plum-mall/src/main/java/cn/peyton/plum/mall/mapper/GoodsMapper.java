package cn.peyton.plum.mall.mapper;

import cn.peyton.plum.core.mybatis.utils.PageQuery;
import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.vo.GoodsHotVo;

import java.util.List;

/**
 * <h3> 商品信息 Mapper 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public interface GoodsMapper {
	/**
	 * <h4>插入 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insert(Goods record);

	/**
	 * <h4>插入 对象[根据属性是否有值 插入]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insertSelective(Goods record);

	/**
	 * <h4>根据 主键 删除 对象</h4>
	 * @param id 主键
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * <h4>更新 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(Goods record);

	/**
	 * <h4>更新 对象[根据属性是否有值 更新]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Goods record);

	/**
	 * <h4>根据 主键 查找 对象</h4>
	 * @param id 主键
	 * @return 对象
	 */
	Goods selectByPrimaryKey(Long id);


	// ==================================== new create method ==================================== //

    /**
     * <h4>查找热门商品对象集合</h4>
     * @param categoryId categoryId >0 时,表示 查找条件含 分类ID
     * @param page 分页对象
     * @return 品对象集合
     */
    List<GoodsHotVo> findByHot(Integer categoryId, PageQuery page);

    /**
     * <h4>查找热门商品对象集合{随机获取前几条}</h4>
     * @param categoryId categoryId categoryId >0 时,表示 查找条件含 分类ID
     * @param row 需要返回的条数
     * @return 品对象集合
     */
    List<GoodsHotVo> findByHotAndRandTopNumber(Integer categoryId,Integer row);

}
