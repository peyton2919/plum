package cn.peyton.plum.chatter.service;

import cn.peyton.plum.chatter.param.PostParam;
import cn.peyton.plum.chatter.pojo.Post;
import cn.peyton.plum.core.mybatis.utils.PageQuery;

import java.util.List;

/**
 * <h3>文章 Service 接口 .impl</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2021/12/10 20:50:38
 * @version 1.0.0
 * </pre>
*/
public interface PostService {

    /**
     * <h4>判断文章是否存在</h4>
     * @param id 文章编号
     * @return true 表示存在 ; 否则取反
     */
    boolean isPost(Integer id);

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
     * <h4>根据主键查找</h4>
     * @param id 主键
     * @return 文章对象
     */
    PostParam findByPrimaryKey(Integer id);

    /**
     * <h4>根据话题 ID 查找,只查isOpen=1</h4>
     * @param topicId 话题 ID
     * @param page 分页对象
     * @param type 0 表示 按分享数排序, 1 表示 按最新时间排序
     * @return
     */
    List<PostParam> findByTopicId(int topicId, PageQuery page,int type);

    /**
     * <h4>根据用户 ID 查找,只查isOpen=1 </h4>
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
