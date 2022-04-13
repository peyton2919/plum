package cn.peyton.plum.mall.mapper;

import cn.peyton.plum.mall.pojo.Ad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <h3> 广告信息 Mapper 接口</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 10:16:09
 * @version 1.0.0
 * </pre>
*/
public interface AdMapper {
	/**
	 * <h4>插入 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insert(Ad record);

	/**
	 * <h4>插入 对象[根据属性是否有值 插入]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insertSelective(Ad record);

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
	int updateByPrimaryKey(Ad record);

	/**
	 * <h4>更新 对象[根据属性是否有值 更新]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Ad record);

	/**
	 * <h4>根据 主键 查找 对象</h4>
	 * @param id 主键
	 * @return 对象
	 */
	Ad selectByPrimaryKey(Long id);


	// ==================================== new create method ==================================== //

    /**
     * 根据类型查找对象集合 (随机生成)
     * @param type 类型: 0:one 单图; 1:three 三图; 2:swiper: 轮播图; 3:导航：nav;
     * @param row 行数(用在轮播图和导航) 三图只能每图查到一条
     * @return 广告对象集合
     */
    List<Ad> findAllByType(Integer type, Integer row);

    /**
     * <h4>更新点击数和热度数</h4>
     * @param id 广告ID
     * @return 受影响的行数 1 成功 0 失败
     */
    int updateByHotAndClickNum(@Param("id") Long id);
}
