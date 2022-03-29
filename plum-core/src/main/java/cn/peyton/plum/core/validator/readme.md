对外接口
1. Validation 验证类
2. Valid 标记验证注解
3. Regulation 正则规则类

调用：
Validation[valid] -> BaseValidator[validate] -> ValidatorFactory[valid] -> AbstractValidator[compare];
Validation[check] -> BaseValidator[validate] -> ValidatorFactory[valid] -> AbstractValidator[compare];

