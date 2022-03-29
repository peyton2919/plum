Thymeleaf 语法详解
表达式
    变量表达式和选择表达式 ${..}、*{..}
    链接表达式 @{..}
    消息表达式（国际化） #{..}
    片段表达式 ~{..} 用于引用公共目标片段
常用html属性
    each, if, switch
    内联 inline
    内置对象： #request, #session
    内置工具类： #strings, #dates, #lists

Thymeleaf 内置对象
    注意语法：
        1、调用内置对象一定要用 #
        2、大部分内置对象都以 s 结尾 如：strings、numbers、dates
      
一、表达式
    1、文本表达式
        1)、文本处理： th:text="学习文本表达式"
        2)、有空格的文本： th:text="'hello thymeleaf'"
        3)、连接字符串+： th:text="'宝马'+'良驹'"
        4)、学习开发语言：  th:text="'学习'+${..}"
        5)、学习：       th:text="|'学习'${..}|"
        6)、学习开发语言： th:text="您好+|${..},${..}|"
        7)、数字文本      th:text="123"
        8)、boolean文本     th:text="true"
    2、数字表达式
        gt(>),lt(<),ge(>=),le(<=),not(!),eq(==),neq(!=)   
    3、布尔表达式
    4、null和空字符串表达
    5、逻辑表达式
    6、三元运算符
  其他
    th:attr 
        设置属性值：
            th:attr="action=${..}" 、 th:attr="value=${..}"
            或者 th:attr="onclick='fun()'"、th:attr="onclick='fun()',value=${..}"
    th:abbr
    th:accept
    th:accept-charset
    th:accesskey
    th:action
    th:align
    th:alt
    th:archive
    th:audio
    th:autocomplete
    th:axis
    th:background
    主要有:
    th:value,th:action,th:href,th:class,th:src,th:onclick;
    参考文档：
    https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values

二、
1、变量输出与字符串操作
    1)、th:text  在页面中输出值
    2)、th:value 可以将一个值放入input 标签 value 中
        例：<input type="text" name="username" th:value="${msg}" />
    3)、字符串处理 ${#strings.isEmpty(key)} 判断字符串是否为空，如果空返回true,否则返回 false
        例： 判断msg 是否为空 <span th:text="${#strings.isEmpty(msg)}"></sparn>
    4)、${#strings.contains(msg,'t')} 
        判断字符串是否包含指定的子串，如果包含返回 true , 否则返回 false
    5)、${#strings.startWith(msg,'a')}  
        判断当前字符串是否以子串开头，如果是返回 true , 否则返回 false
    6)、${#strings.endWith(msg,'a')}  
         判断当前字符串是否以子串结尾，如果是返回 true , 否则返回 false
    7)、${#strings.length(msg)}  
        返回字符串的长度
    8)、${#strings.length(msg)}  
        查找子串的位置，并返回该子串的下标，如果没找到则返回 -1
    9)、${#strings.substring(msg,6)}、${#strings.substring(msg,6|14)}
        截取子串，用户与jdk String 类开 SubString方法
    10)、${#strings.toUpperCase(msg,6)}、${#strings.toLowerCase(msg)}
        字符串大小写
                 
2、日期格式处理
    1)、${#dates.format(key)}
        格式化日期，默认以浏览器语言为格式化标准
    2)、${#dates.format(key，'yyyy/MM/dd')}
        按照自定义格式化日期转换
    3)、${#dates.year(key)}
        获取年份
    4)、${#dates.month(key)}
        获取月份
    5)、${#dates.day(key)}
        获取天
    
3、条件判断
    1)、 th:if="${sex}=='男'"
    2)、 th:unless="" 不满足
    2)、 th:switch="${id}"
            th:case="1" 判断
    
4、迭代遍历
    1）、th:each="u : ${list}"
        th:text="${u.id}"
    2）、th:each="u,var : ${list}"
             th:text="${u.id}"   
             var 状态变量
             var.index 当前迭代索引,从0开始
             var.count 当前迭代对象的计数,从1开始
             var.size 被迭代对象长度
             var.even 当前迭代的行数是偶数 返回true
             var.odd 当前迭代的行数奇数 返回true
             var.first 当前迭代对象是第一个 返回true
             var.last 当前迭代对象是最后一个 返回true
    3）、th:each="maps : ${map}"   迭代map       
             th:text="${maps}"
             th:text="entry : ${maps}" th:text="${entry.key}" 
             th:text="entry : ${maps}" th:text="${entry.value}"
             
5、域对象操作
    1)、HttpServletRequest使用:  th:text="${#httpServletRequest.getAttribute('key')}"
    2)、HttpSession使用：th:text="${session.key}"
    3)、ServletContext使用：th:text="${application.key}"

6、URL表达式
    1)、 th:href 
    2)、 th:src
    基本语法： @{}
      URL类型
         绝对路径 th:href="@{http://www.baidu.com}"
         相对路径
            相对于当前项目的根 th:href="@{/show}"
            相对于服务器的根 th:href="@{~/项目名称/访问名称}"         
    参数传递
        th:href="@{/show(id=1)}" 传参
        th:href="@{/show(id=1,name=jack)}"
    在url中通过restful 风格进行参数传递
        th:href="@{/path/{id}/show(id=1,name=jack)}"
        
        th:src="@{/}+ ${xxx.xxx}"

7、赋值 th:field="${}"

8、跳转： redirect:

9、文件上传：
    method="post" enctype="multipart/form-data"
    
10、通过javascript渲染对象
    <script th:inline="javascript">
        const user = /*[[${user}]]*/{};
    </script>
    
11、碎片（组件）
    创建一个页面component.html在页面内创建一个片段
        <div th:fragment="com">
            内容
        </div>
        <div id="com2">
            内容
        </div>
    1)、替换
        <div th:replace="~{component::com}"> </div>
    2)、插入
        <div th:insert="~{component::com}"> </div>
    3)、插入 id
        <div th:insert="~{component::#com2}"> </div>
12、模板使用
    1)、定义模板语法：
        <div th:fragment="模板名称">
            模板内容
        </div>
    2)、引用模板
       A、 把模板插入到当前位置
            <div insert="模板所在文件名称::模板名称>
                其他内容
            </div>
       B、把模板替换当前标签内容
            <div replace="模板所在文件名称::模板名称>
                其他内容
            </div>
       C、把模板内容添加到当前标签
           <div include="模板所在文件名称::模板名称>
               其他内容
           </div>
    3)、模板引用语法：
        A、 模板所在文件名称::模板名称
        B、 ~{模板所在文件名称::模板名称}
    4)、模板删除
        th：remove="删除范围值"
        A、 all: 删除包含标签及其所有子项
        B、 body: 不删除包含标签，但删除所有子项
        C、 tag: 删除包含标签,但不删除其子项
        D、 all-but-first: 删除第一个子项以外的其他所有子项
        E、 none: 什么都不做，该值对于动态计算有用。null 也会被视为 none
    第二种，引用模板
        定义模板： <div id="tml">内容</div>
        引用模板： <div insert="模板所在文件名称::#tml"></div>
    th:inline使用 内联语法
        [[..]],[(..)] 内联表达式，任何在th:text 或th:utext属性中使用
        [[..]]等价于th:text,[(..)]等价于th:utext
        