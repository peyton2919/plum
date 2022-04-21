1. 多个参数查询
    <resultMap id="OrderMap" type="xx.xx.entity.Order">
        <result property="id" column="id"></result>
        <result property="order_no" column="orderNo"></result> 
        <result property="amout" column="amout"></result>      
        <collection property="foodList" 	//对应Order类中的集合属性名称
                    ofType="xx.xx.entity.Food"	//对应关联查询的类
                    column="{orderId=id,orderNo=order_no}" 	 //关联查询的sql传递参数
                    javaType="arraylist"
                    select="xx.xx.FoodMapper.findFood">  //对应查询的sql，我这是通过mapper类指向的mapper.xml
        </collection>
    </resultMap>
    
    <resultMap id="FoodMap" type="xx.xx.entity.Food">
        <result property="food_name" column="foodName"></result>
        <result property="food_num" column="foodNum"></result>  
        <result property="price" column="price"></result>      
    </resultMap>
    
    1) .主查询语句
    <select id="findOrder" resultMap="OrderMap">
        SELECT id,
            orderNo as order_no
        FROM t_order
    </select>
    
    2). 关联查询语句
     <select id="findFood" resultMap="FoodMap">
         SELECT food_name, food_num, price
         FROM t_food
         WHERE
           order_id = #{orderId}
           AND order_no = #{orderNo}
     </select>
          

