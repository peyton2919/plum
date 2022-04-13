package cn.peyton.plum.mall.mapper;

import cn.peyton.plum.mall.pojo.SysProvince;

/**
 * <h3> 省份 Mapper 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/11 14:10:01
 * @version 1.0.0
 * </pre>
*/
public interface SysProvinceMapper {
	/**
	 * <h4>插入 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insert(SysProvince record);

	/**
	 * <h4>插入 对象[根据属性是否有值 插入]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insertSelective(SysProvince record);

	/**
	 * <h4>根据 主键 删除 对象</h4>
	 * @param id 主键
	 * @return 受影响的行数
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * <h4>更新 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKey(SysProvince record);

	/**
	 * <h4>更新 对象[根据属性是否有值 更新]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(SysProvince record);

	/**
	 * <h4>根据 主键 查找 对象</h4>
	 * @param id 主键
	 * @return 对象
	 */
	SysProvince selectByPrimaryKey(Integer id);


	// ==================================== new create method ==================================== //


}
