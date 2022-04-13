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
8. Post("/user/bindother","UserController.bindOther"); 绑定第三方账号
9. Post("/user/follow","FollowController.follow"); 用户关注
10. Post("/user/unfollow","FollowController.unFollow"); 用户取消关注
11. Post("/user/friends","FollowController.friends"); 互注列表
12. Post("/user/fens","FollowController.fens"); 粉丝列表
13. Post("/user/follows","FollowController.follows"); 关注列表
14. Post("/postclass","PostClassController.finds"); 获取所有文章分类
15. Post("/topicclass","TopicClassController.finds");获取所有话题分类
16. Post("/hottopic","TopicController.findByHot"); 获取热门话题
17. Post("topicclassid","TopicController.topicByTopicClassId");获取指定话题分类下的话题列表
18. Post("/user/imgs/uploadmore","ImagesController.uploadMore"); 上传单图或多图
19. Post("/user/post/create","PostController.create"); 发布文章详情
20. Post("/post/detail","PostController.detail"); 获取文章详情
21. Post("/post/topicid","PostController.findByTopicId");获取指定话题下的文章列表
22. Post("/post/postclassid","PostController.findByPostClassId"); 获取指定文章分类下的文章列表
23. Post("/post/userid","PostController.findByUserId"); 获取指定用户下的文章列表{游客可点}
24. Post("/user/post/pkuserid","PostController.findByPKUserId");获取指定用户下的文章列表{含隐私}
25. Post("/topic/search","TopicController.search"); 搜索话题
26. Post("/post/search","PostController.search"); 搜索文章
27. Post("/search","UserController.search"); 搜索用户
28. Post("/adsense","AdsenseController.findByType"); 获取广告列表
29. Post("/user/support","SupportController.create"); 用户顶踩
30. Post("/user/comment","CommentController.create"); 用户评论
31. Post("/comment/postid","CommentController.findByPostId"); 获取当前文章的所有评论
32. Post("/user/edituserpic","UserController.editUserPic"); 编辑用户头像
33. Post("/user/edituserinfo","UserController.editUserInfo"); 编辑用户信息
34. Post("/user/repassword","UserController.editPassword"); 修改用户密码
35. Post("/user/addblack","BlackListController.addBlack"); 加入黑名单
36. Post("/user/removeblack","BlackListController.removeBlack"); 移除黑名单
37. Post("/user/feedback","FeedbackController.create"); 用户反馈
38. Post("/user/feedbacklist","FeedbackController.feedbacklist); 获取用户反馈列表
39. Post("/update","AppUpdateController.update"); 检查更新
40. Post("",""); 获取消息队列
41. Post("",""); 发送消息
42. Post("",""); 统计用户相关数据
43. Post("",""); 获取当前用户第三方登录绑定情况
44. Post("",""); 获取我关注人的公开文章列表
45. Post("",""); 获取用户详细信息
46. Post("",""); 聊天用户绑定上线
47. Post("",""); 微信小程序登录
48. Post("",""); 支付宝小程序登录






