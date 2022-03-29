package cn.peyton.plum.chatter.mapper;

import cn.peyton.plum.chatter.param.PostParam;
import cn.peyton.plum.chatter.pojo.Post;
import cn.peyton.plum.core.mybatis.utils.PageQuery;

import java.util.List;


/**
 * <h3>文章 Mapper 接口 .mapper</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface PostMapper {
	/**
	 * <h4>插入 对象</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insert(Post record);

	/**
	 * <h4>插入 对象[根据属性是否有值 插入]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int insertSelective(Post record);

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
	int updateByPrimaryKey(Post record);

	/**
	 * <h4>更新 对象[根据属性是否有值 更新]</h4>
	 * @param record 对象
	 * @return 受影响的行数
	 */
	int updateByPrimaryKeySelective(Post record);

	/**
	 * <h4>根据 主键 查找 对象</h4>
	 * @param id 主键
	 * @return 对象
	 */
	PostParam selectByPrimaryKey(Integer id);


	// ==================================== new create method ==================================== //

    /**
     * <h4>判断文章是否存在</h4>
     * @param id 文章编号
     * @return 返回行数 > 0 表示存在 ; 否则取反
     */
    int checkPost(Integer id);
    /**
     * <h>根据文章编号 并 type=1 查找文章对象 </h>
     * @param id 文章编号
     * @return 文章对象
     */
    PostParam findByShareId(Integer id);
    /**
     * <h4>根据文章分类，分页查找,只查isOpen=1</h4>
     * @param postClassId 文章分类编号
     * @param page 分页对象
     * @return 文章集合
     */
    List<PostParam> findByClassId(int postClassId, PageQuery page);

    /**
     * <h4>根据关键字，分页查找,只查isOpen=1</h4>
     * @param keyword 关键字
     * @param page 分页对象
     * @return 文章集合
     */
    List<PostParam> search(String keyword, PageQuery page);

    /**
     * <h4>根据话题 ID 查找,只查isOpen=1</h4>
     * @param topicId 话题 ID
     * @param page 分页对象
     * @return
     */
    List<PostParam> findByTopicId(int topicId, PageQuery page);

    /**
     * <h4>根据用户 ID 查找,只查isOpen=1</h4>
     * @param userId 话题 ID
     * @param page 分页对象
     * @return
     */
    List<PostParam> findByUserId(int userId, PageQuery page);
    /**
     * <h4>根据用户 ID 查找,全部(含隐私) </h4>
     * @param userId 话题 ID
     * @param page 分页对象
     * @return
     */
    List<PostParam> findByPKUserId(int userId, PageQuery page);

}
