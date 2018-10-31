# 配置项目路径

### 方法一: 配置虚拟路径

1. 在目录下找到conf/server.xml 找到Host元素节点
2. 加如下列内容

```xml
<!--
	docBase : 项目路径地址 : 如: E:\WeStudy\Js\demo6
	path: 对应虚拟地址 虚拟地址内容随意写 可以/开头
	对应访问方式: http://localhost:8080/star/star.html
-->
<Context docBase="E:\WeStudy\Js\demo6" path="star"></Context>
```

3. 浏览器上访问

   ```
   在浏览器地址栏中输入 : http://localhost:8080/star/star.html
   ```


### 方法二: 配置虚拟路径

1. 在conf/catalina/localhost/ 文件下，新建一个xml文件，名字可以自己定义。stars.xml
2. 在文件里面写入以下内容

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Context docBase="E:\WeStudy\Js\demo6"></Context>
```

3. 浏览器上访问

   ```
   在浏览器地址栏中输入http://localhost:8080/stars/star.html
   ```

### 方法三:

> 直接将项目放在webApps/ROOT中