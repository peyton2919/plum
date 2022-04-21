package cn.peyton.plum.mall.mapper;

import cn.peyton.plum.mall.pojo.Goods;
import cn.peyton.plum.mall.pojo.GoodsCardValue;
import cn.peyton.plum.mall.pojo.GoodsSkuCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <h3> 商品规格卡值关联 Mapper 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/16 18:19:42
 * @version 1.0.0
 * </pre>
*/
public interface GoodsCardValueMapper {
	/**
	 * <h4>插入 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insert(GoodsCardValue record);

	/**
	 * <h4>插入 对象[根据属性是否有值 插入]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insertSelective(GoodsCardValue record);

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
	int updateByPrimaryKey(GoodsCardValue record);

	/**
	 * <h4>更新 对象[根据属性是否有值 更新]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(GoodsCardValue record);


	// ==================================== new create method ==================================== //


}
