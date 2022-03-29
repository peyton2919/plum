plum 普拉姆是一套集多模块系统项目
一、目录结构
    plum
        toolkit -> core(基础工具模块和核心模块)
        chatter/(数据交互模块{持久层dao和服务层service})
        portal(前端模块{视图层controller})
    
    1、mybatis-generator-toolkit 为自动生成 mybatis 数据相关的工具
    2、learn 目录为相关学习的文档
    3、readme 目录为项目的自述文件
    
二、项目开发结构说明
    以下项目共享 plum-toolkit、plum-core这二个模块
    (一)、chatter 社区模块
        1、持久层和服务层写在这个模块下。
        2、数据库信息：
            1)、adsense 广告表 {id,src 图片地址,url 广告地址,type 类型0动态轮播图1个人中心,create_time}
            2)、app_update 应用程序更新表 {id,url 下载地址,version 版本号,status 状态{0未上线1上线},create_time}
            3)、black_list 拉黑表{id,user_id 用户编号,black_id 拉黑用户编号,create_time}
            4)、comment 文章评论表 {id,user_id 用户编号,f_id 回复用户编号,fnum 被回复数,data数据,create_time,post_id 文章编号}
            5)、feedback 意见反馈表 {id,to_id 接收用户编号(多个客服,默认0),from_id 发送用户编号,data 数据,create_time}
            6)、follow 粉丝关注表 {id,follow_i 被关注用户编号,user_id 用户编号,create_time}
            7)、images 图片表 {关联1} {id,url 链接地址,user_id 用户编号,create_time}
            8)、post 文章表  {关联1}{关联2}  {id,user_id 发布人{用户编号},title 标题,title_pic 标题,content 内容,share_num 被分享数
                                        ,path 发布者地址,type 类型{0图文1分享},post_class_id 文章类型编号,share_id 分享文章编号(关联文章表)
                                        ,is_open 是否开放{1开放0仅自己可见},create_time}    
            9)、post_class 文章分类表 {id,class_name 分类名称,status 状态{0禁用1启用},create_time}             
            10)、post_image 文章图片关联表 {关联1} {id,post_id 文章编号,image_id 图片编号,create_time}  
            11)、support 顶踩表 {id,user_id 用户编号,post_id 文章编号,type 类型{0顶1踩},create_time}
            12)、topic 话题表 {关联2} {id,title 标题,title_pic 标题图片,desc 描述,type 类型{0禁用1启用},topic_class_id 话题类型编号,create_time}
            13)、topic_class 话题分类表 {id,class_name 话题分类名称,status 状态{0禁用1启用},create_time}
            14)、topic_post 话题文章关联表 {关联2} {id,topic_id 话题编号,post_id 文章编号,create_time}
            15)、user_bind 用户绑定表 {id,type 类型,open_id open编号,user_id 用户编号,nick_name 昵称,avatar_url头像地址}
            16)、user_info 用户基础表 {id,user_id 用户编号,age 年龄,sex 性别,qq,job 工作,path 地址,birthday 生日}
            17)、user 用户表 {id,username 名称,user_pic 头像,password 密码,phone 手机,email 邮箱,status状态{0禁用1启用},create_time}
        3、视图层写在 plum-portal 模块下controller.chatter包下;
        其规划如下
            1)、api 应用端
                a、android 安卓消费者
                b、ios 苹果消费者
                c、routine app消费者
            2）、desktop pc端
        4、api接口：
            返回值封装在 JSONResult {status,ret,data,msg}
            1)、UsersController 用户
                登录api =>  账号/手机/其他  区分{login/phonelogin/otherlogin}
                链接方法: POST
                链接地址: /user/login
                方法名: login(string,string,type) | type 类型(login|phonelogin|otherlogin)：用来判断是哪种登录
                返回值: 用户对象 {Users}
                
            2)、
            3)、
            4)、
            5)、
            6)、
            7)、
            8)、
            9)、
            10)、
            11)、
            12)、
            13)、
            14)、
            15)、
            16)、
            
            


plum -> toolkit -> core -> data switching (mapper/service) -> portal(controller)