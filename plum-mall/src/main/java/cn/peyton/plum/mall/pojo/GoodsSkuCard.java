package cn.peyton.plum.mall.pojo;


import cn.peyton.plum.core.utils.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * <h3> 商品规格卡片 实体类</h3>
 * <pre>
 * @author <a href="http://www.peyton.cn">peyton</a>
 * @email <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @createDate 2022/04/12 18:47:07
 * @version 1.0.0
 * </pre>
*/
public class GoodsSkuCard implements Serializable {
	/**   */
	private Long id;
	/** 商品属性卡片值  */
	private String name;
	/** 商品属性卡片属性类型 0无 1颜色 2图片  */
	private Integer type;
	/** 排序: 数值越大越靠前  */
	private Integer seq;
	/** 商品规格值 集合  */
	private List<GoodsSkuCardValue> goodsSkuCardValues;

	//================================== Constructor =======================================//
    public GoodsSkuCard(){
        if(null == goodsSkuCardValues){
            goodsSkuCardValues = Lists.newArrayList();
        }
    }
	//================================== Method =======================================//


	//================================== PREFIX_GET AND PREFIX_SET =======================================//

	/** 
	 * @param id  
	 */ 
	public void setId(Long id){
		this.id = id;
	}

	/** 
	 * @return  
	 */ 
	public Long getId(){
		return id;
	}

	/** 
	 * @param name 商品属性卡片值 
	 */ 
	public void setName(String name){
		this.name = name;
	}

	/** 
	 * @return 商品属性卡片值 
	 */ 
	public String getName(){
		return name;
	}

	/** 
	 * @param type 商品属性卡片属性类型 0无 1颜色 2图片 
	 */ 
	public void setType(Integer type){
		this.type = type;
	}

	/** 
	 * @return 商品属性卡片属性类型 0无 1颜色 2图片 
	 */ 
	public Integer getType(){
		return type;
	}

	/** 
	 * @param seq 排序: 数值越大越靠前 
	 */ 
	public void setSeq(Integer seq){
		this.seq = seq;
	}

	/** 
	 * @return 排序: 数值越大越靠前 
	 */ 
	public Integer getSeq(){
		return seq;
	}

    /**
     * @return 商品规格值 集合
     */
    public List<GoodsSkuCardValue> getGoodsSkuCardValues() {
        return goodsSkuCardValues;
    }

    /**
     * @param goodsSkuCardValues 商品规格值 集合
     */
    public void setGoodsSkuCardValues(List<GoodsSkuCardValue> goodsSkuCardValues) {
        this.goodsSkuCardValues = goodsSkuCardValues;
    }
}
