API路由 根目录baseurl={http://192.168.3.2:8080/api/routine}
    @Valid 表示需要验证的标记
    user 表示 需要验证 用户是否登录 
    request("url","method")
1. Post("/sendcode","UserController.sendCode"); 发送验证码
2. Post("/reg","UserController.reg"); 用户注册
3. Post("/phonelogin","UserController.phoneLogin"); 手机登录
4. Post("/login","UserController.login"); 用户账户登录
5. Post("/otherlogin","UserController.otherLogin"); 第三方登录
6. Post("/user/logout","UserController.logout"); 用户退出
7. Post("/user/bind","UserController.bind"); 用户手机、邮箱绑定
   Post("/user/bindother","UserController.bindOther"); 绑定第三方账号
   
8. Post("/user/follow","FollowController.follow"); 用户关注
9. Post("/user/unfollow","FollowController.unFollow"); 用户取消关注

10. Post("/postclass","PostClassController.finds"); 获取所有文章分类
11. Post("/topicclass","TopicClassController.finds");获取所有话题分类

12. Post("/hottopic","TopicController.findByHot"); 获取热门话题
13. Post("topicclassid","TopicController.topicByTopicClassId");获取指定话题分类下的话题列表

14. Post("/user/imgs/uploadmore","ImagesController.uploadMore"); 上传单图或多图

15. Post("/user/post/create","PostController.create"); 发布文章详情
16. Post("/post/detail","PostController.detail"); 获取文章详情
17. Post("/post/topicid","PostController.findByTopicId");获取指定话题下的文章列表
18. Post("/post/postclassid","PostController.findByPostClassId"); 获取指定文章分类下的文章列表
19. Post("/post/userid","PostController.findByUserId"); 获取指定用户下的文章列表{游客可点}
20. Post("/user/post/pkuserid","PostController.findByPKUserId");获取指定用户下的文章列表{含隐私}

21. Post("/topic/search","TopicController.search"); 搜索话题
22. Post("/post/search","PostController.search"); 搜索文章
23. Post("/search","UserController.search"); 搜索用户

24. Post("/adsense","AdsenseController.findByType"); 获取广告列表
25. Post("","");
26. Post("","");
27. Post("","");
28. Post("","");
29. Post("","");
30. Post("","");




