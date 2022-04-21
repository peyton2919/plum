package cn.peyton.plum.mall.mapper;

import cn.peyton.plum.mall.pojo.GoodsSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <h3> 商品规格 Mapper 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public interface GoodsSkuMapper {
	/**
	 * <h4>插入 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insert(GoodsSku record);

	/**
	 * <h4>插入 对象[根据属性是否有值 插入]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insertSelective(GoodsSku record);

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
	int updateByPrimaryKey(GoodsSku record);

	/**
	 * <h4>更新 对象[根据属性是否有值 更新]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(GoodsSku record);

	/**
	 * <h4>根据 主键 查找 对象</h4>
	 * @param id 主键
	 * @return 对象
	 */
	GoodsSku selectByPrimaryKey(Long id);


    // ==================================== new create method ==================================== //

    /**
     * <h4>根据商品ID 查找 商品规格对象</h4>
     * @param goodsId 商品ID
     * @return 商品规格对象集合
     */
    List<GoodsSku> findByGoodsId(@Param("goodsId") Long goodsId);

}
