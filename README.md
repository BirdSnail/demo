# 使用`@Controller`注解引起404的问题

当我使用`@Controller`和`@RequestMapping`时，启动应用后浏览器访问[http://localhost:8080/test/user](http://localhost:8080/test/user)
会出现404异常。

当我将`@Controller`换成`@RestController`后可以正常访问。
> git checkout restcontroller

**why?**

已知该问题出现`GET`方法上，`POST`不会出现这中情况