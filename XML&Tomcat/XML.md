### XML语法

```xml
<?xml version="1.0" encoding="utf-8" ?>
<标签名>
    <标签名>值</标签名>
</标签名>
```

> 例如

```xml
<?xml version="1.0" encoding="utf-8" ?>
<stus>
    <stu>
        <name>张三</name>
        <age>18</age>
        <address>北京</address>
    </stu>
    <stu>
        <name>李四</name>
        <age>20</age>
        <address>上海</address>
    </stu>
</stus>
```

### XML结构

![1540534249234](C:\Users\zBei\AppData\Roaming\Typora\typora-user-images\1540534249234.png)

### XML解析

> 只要获取字符数据或者属性数据就是对XML解析

### XML解析方式

- DOM
- SAX

> 针对上述两种方式的API

#### Dem4j 基本用法

> 注意: 使用Dem4j 需要导入jar包

1. 创键SaxReader对象

   ```java
   SAXReader reader = new SAXReader();
   ```

2. 指定解析的xml

   ```java
   Document document = reader.read(new File("src/XML/stus.xml"));
   ```

3. 获取根元素

   ```java
   Element rootElement = document.getRootElement();
   ```

4. 根据根元素获取子元素或者下面子孙元素

   ```java
   rootElement.element("stu").element("name").getText()
   ```

5. 返回元素下第一个子元素

   ```java
   element("stu").element("name").getText();
   ```

6. 返回元素中所有子元素

   ```java
   element.elements("name").getText(); 
   ```

   > example

   ```java
   try {
       //创键读取XML对象
       SAXReader reader = new SAXReader();
       //获取xml文档
       Document document = reader.read(new File("src/XML/stus.xml"));
       //获取xml根元素
       Element rootElement = document.getRootElement();
       //根据根元素获取子元素或者下面子孙元素
              			//System.out.println(rootElement.element("stu").element("name").getText());
   
   	//System.out.println(rootElement.);
       //通过根元素获取根元素下的所有子元素
       List<Element> elements = rootElement.elements();
       for(Element element : elements ){
           String name = element.element("name").getText();
           String age = element.element("age").getText();
           String address = element.element("address").getText();
           System.out.println("name:"+name+"--age:"+age+"--address:"+address);
   	}
   } catch (DocumentException e) {
           e.printStackTrace();
       }
   ```



 #### XPath的使用方法

   > 使用 Xpath 需要导入支持的jar包，xpath是xml路径语言，支持我们在解析xml时能够快速定位到具体的某一个元素。

   1. 获取第一个元素

      ```java
      SAXReader reader = new SAXReader();
      Document document = read(new File("路径"));
      Element rootElement = document.getRootElement();
      Element nameElement = rootElement.selectStringNode("//name");
      System.out.println(nameElement.getText());
      ```

   2. 获取所有元素

      ```java
      SAXReader reader = new SAXReader();
      Document document = reader.read(new File("路径"));
      Element rootElement = document.getRootElement();
      List<Node> list = rootElement.selectNodes("//name");
      for(Element element : list){
          String name = element.getText();
          System.out.println(name);
      }
      ```

      > 完整实例

      ```java
      try {
              SAXReader reader = new SAXReader();
              Document document = reader.read(new File("src/xml/stus.xml"));
              Element rootElement = document.getRootElement();
              //想要使用Xpath,需要添加支持的jar; 获取的是第一个元素 只返回一个
              //Element nameElement = (Element) rootElement.selectSingleNode("//name");
              //System.out.println(nameElement.getText());
      
              //获取所有元素
              List<Node> elements = rootElement.selectNodes("//name");
              for(Node element : elements){
                  String name = element.getText();
                  System.out.println(name);
              }
         	} catch (DocumentException e) {
      		e.printStackTrace();
          }
      ```

### XML的约束

> 约束是为了让xml里面的东西不能够被随意更改和命名

#### DTD约束

> 语法自成一派，出现时间早，可读性差。

- 声明一个元素

```xml-dtd
<!ELEMENT 元素名称 类别> 或 <!ELEMENT 元素名称 (元素内容)>
<!ELEMENT stus (stu)>

(stu)+ "+"表示里面有多个stu
<!ELEMENT stus (stu)+>
```

- PCDATA

```xml-dtd
<!ELEMENT 元素名称 (#PCDATA)>
<!ELEMENT name (#PCDATA)>
```

- 引用DTD方法 -- 外部方法

```xml-dtd
<!DOCTYPE 根元素名称 SYSTEM "路径">
<!DOCTYPE stus SYSTEM "stus.dtd">
```

- 引用DTD方法 -- 内部方法

```xml-dtd
<!DOCTYPE stus[
    <!ELEMENT stus (stu)>
    <!ELEMENT stu (name,age,address)>
    <!ELEMENT name (#PCDATA)>
    <!ELEMENT age (#PCDATA)>
    <!ELEMENT address (#PCDATA)>
]>
```

- 引用DTD方法 -- 网络方法

```xml-dtd
<!DOCTYPE 根元素名称 PUBLIC "网址名称" "网址路径.dtd">
<!DOCTYPE stus PUBLIC "网址名称" "网址路径.dtd">
```



> 完整实例

```xml-dtd
<?xml version="1.0" encoding="utf-8" ?>
<!--引入网络dtd-->
<!--<!DOCTYPE stus PUBLIC "网址名称" "网址路径.dtd">-->

<!--引入外部文档-->
<!--文档类型 根元素名称 关键字 约束路径-->
<!--<!DOCTYPE stus SYSTEM "stus.dtd">-->

<!--内部引入方式-->
<!DOCTYPE stus[
    <!ELEMENT stus (stu)+>
    <!ELEMENT stu (name,age,address)>
    <!ELEMENT name (#PCDATA)>
    <!ELEMENT age (#PCDATA)>
    <!ELEMENT address (#PCDATA)>
]>
<stus>
    <stu>
        <name>张三</name>
        <age>18</age>
        <address>北京</address>
    </stu>
    <stu>
        <name>李四</name>
        <age>20</age>
        <address>上海</address>
    </stu>
</stus>
```

> 给元素添加属性

- 添加元素属性语法

```xml-dtd
<!ATTLIST 元素名称 属性名称 属性类型 默认值>  (默认值可不写)
<!ATTLIST stu id ID "check">
```

- DTD实例

```xml-dtd
<!ATTLIST stu id CDATA "check">
```

- XML实例

```xml
<stu id="check">
```

- 属性类型选项

| 类型               | 描述                                        |
| ------------------ | ------------------------------------------- |
| CDATA              | 值为字符数据 (character data)(就是普通文本) |
| (*en1*\|*en2*\|..) | 此值是枚举列表中的一个值                    |
| ID                 | 值为唯一的 id                               |
| IDREF              | 值为另外一个元素的 id                       |
| IDREFS             | 值为其他 id 的列表                          |
| NMTOKEN            | 值为合法的 XML 名称                         |
| NMTOKENS           | 值为合法的 XML 名称的列表                   |
| ENTITY             | 值是一个实体                                |
| ENTITIES           | 值是一个实体列表                            |
| NOTATION           | 此值是符号的名称                            |
| xml:               | 值是一个预定义的 XML 值                     |

- 属性默认值

| 值           | 属性的默认值   |
| ------------ | -------------- |
| #REQUIRED    | 属性值是必需的 |
| #IMPLIED     | 属性不是必需的 |
| #FIXED value | 属性值是固定的 |

#### Schema约束

> Schema 比 DTD 更强大，支持数据类型

```xml
schema的根元素 : <schema></schema> 
```

##### schema的使用方法

```xml
<?xml version="1.0" encoding="UTF-8" ?>

<!--
    xmlns ：固定值
    elementFormDefault ：元素格式化情况
    targetNamespace ： 名称空间，随意写
-->
<schema xmlns="http://www.w3.org/2001/XMLSchema"
targetNamespace="www.xmlDemo01.com"
elementFormDefault="qualified">
<element name="teachers">
    <complexType>
        <sequence maxOccurs="unbounded">
            <!--复杂元素-->
            <element name="teacher">
                <complexType>
                    <sequence maxOccurs="unbounded">
                        <!--简单元素-->
                        <element name="name" type="string"></element>
                        <element name="age" type="int"></element>
                    </sequence>
                </complexType>
            </element>
        </sequence>
    </complexType>
</element>
</schema>
```

> 固定值

```xml
xmlns:xs="http://www.w3.org/2001/XMLSchema"
```

> 名称空间

```xml
targetNamespace="www.xmlDemo01.com"
```

> 元素格式化情况

```xml
elementFormDefault="qualified"
```

> 简易元素  

- name表示xml中标签名称 
- type表示数据类型


```xml
<element name="name" type="string"></element>
```

> 复杂元素

```xml
complexType : 可以让若干元素均使用相同的符合类型
sequence : 它意味着被定义的元素必须按上面的次序出现在指定元素中
```

> maxOccurs 用于规定某个元素出现的最大次数

```
<sequence maxOccurs="unbounded">  unbounded : 表示无限制
```

> minOccurs 用于规定某个元素出现的最小次数

##### xml引用schema

```xml
<?xml version="1.0" encoding="utf-8" ?>
<!--
        xmlns:xsi : 固定写法，值也是固定的
        xmlns ： 这里是名称空间，和xsd里面的名称空间的值保持一致
        xsi:schemaLocation ：有两部分，一部分是名称空间  一部分是schema的文档路径
-->
<teachers
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="www.xmlDemo01.com"
        xsi:schemaLocation="www.xmlDemo01.com teacher.xsd">
    <teacher>
        <name>张三</name>
        <age>20</age>
    </teacher>
    <teacher>
        <name>李四</name>
        <age>24</age>
    </teacher>
</teachers>
```

> 固定值

```xml
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
```

> 该值和名称空间值保持一致

```xml
xmlns="www.xmlDemo01.com"
```

> schemaLocation有两个值，一个值用于填写名称空间的值，另一个用于填写schema文件路径

```xml
xsi:schemaLocation="www.xmlDemo01.com teacher.xsd"
```

##### 名称空间的作用

一个xml想要添加多个约束，只能使用schema约束，xml只能有一个DTD约束，不能指定多个DTD约束。

简单说：一个xml可以引用多个schema约束，但DTD只能引用一个。

> 作用

命名空间就是在写元素的时候，可以指定该元素使用的是哪一套约束规则，默认只有一套，那么就可以这么写：

```xml
<name>张三</name>
```

如果是多个规则，则需要借助名称空间，写法如下：

```xml
<aa:name>张三</aa:name>
<bb:name>李四</bb:name>
```

