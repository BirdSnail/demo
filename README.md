# 使用`@Controller`注解引起404的问题

当我使用`@Controller`和`@RequestMapping`时，启动应用后浏览器访问[http://localhost:8080/test/user](http://localhost:8080/test/user)
会出现404异常。

当我将`@Controller`换成`@RestController`后可以正常访问。

**why?**