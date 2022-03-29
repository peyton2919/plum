SpringBoot 中对于异常处理提供了5种处理方式
    1.1 自定义错误页面
        SpringBoot 默认的处理异常机制：会向/error的url 发送请求。
            SpringBoot 中提供了一个 BasicExcetpionController 来处理/error请求。跳转到默认显示异常页面来展示异常信息。
            需要在src/main/resources/templates 目录下创建 statusCode.html页面。名称必需是error.html;
    1.2 @ExceptionHandle 注解处理异常
        在方法上添加 @ExceptionHandle(value={异常类.class})
    1.3 @ControllerAdvice + @ExceptionHandler 注解处理异常
        创建一个能够处理异常的全局异常类，并在该类的头部添加 @ControllerAdvice
        并在该类下的方法 相应的 @ExceptionHandler
    1.4 配置 SimpleMappingExceptionResolver 处理异常
    1.5 自定义 HandlerExceptionResolver 类处理异常
    