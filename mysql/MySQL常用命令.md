# MySQL常用命令

### 数据库的CRUD操作

- 登录mysql数据库: mysql -uroot -proot

### 查询数据库

```sql
--- 查看所有数据库 ---
show databases;
--- 查看数据库定义的语句 ---
show create database 数据库名	
```

### 创键数据库

```sql
create database 数据库名称;
create database test;

--- 创建数据库并指定字符集 ---
create database 数据库名称 character set 字符集;
create database test01 character set utf8;

--- 创建数据库, 指定字符集和校对规则---
create database 数据库名称 character set 字符集 collate 校对规则;
create database test02 character set utf8 collate utf8_bin;
```

### 修改数据库的操作

```sql
--- 修改数据库字符集 ---
alter database 数据库名 character set 字符集;
alter database test01 character set gbk;
```

### 删除数据库

```sql
drop database 数据库名称;
drop database test01;
```

### 其他数据库操作命令

```sql
--- 切换数据库(选中数据库) ---
use 数据库名称;
use test01;

--- 查看当前正在使用的数据库 ---
select database();
```



### 表的CRUD操作

#### 创键表

```sql
create table 表名(
	列名1 列名类型(长度) 约束,
    列名2 列名类型(长度) 约束
);

注:
	长度不写,则按照默认长度来自动填写

列名类型:
	java   		 sql
	int		 	 int
	char/string 	char/varchar
					char    :  固定长度
					varchar :  可变长度
					char(3) :字    字空格空格
					varchar(3):字  字
                    长度代表的是字符个数
	double		 double
	float		 float
	boolean		 boolean
	date		 date	:	YYYY-MM-DD
				 time	:	hh:mm:ss
				 datetime  : YYYY-MM-DD hh:mm:ss  默认值是null
				 timestamp : YYYY-MM-DD hh:mm:ss  默认值是当前时间

列的约束:
	主见约束: primary key
	唯一约束: unique
	非空约束: not null
				 
create table student(
    id int primary key,
	name varchar(31),
 	sex char(3),
  	age int
 );
	
	
```

#### 查看表

```sql
--  查看所有表
	show tables;
--  查看表的创建过程
	show create table 表名;
--  查看表结构
	desc 表名;
```

#### 修改表

添加列(add), 修改列(modify), 修改列名(change),  删除列(drop), 修改表名(rename), 修改表的字符集

```sql
-- 添加列(add)
alter table 表名 add 列名 列的类型 列的约束;
alter table student add chengji int not null;

-- 修改列(modify)
alter table 表名 modify 列名 列的类型;
alter table student modify chengji varchar(10);

-- 修改列名(change)
alter table 表名 change 旧列名 新列名 列的类型;
alter table student change sex gender varchar(2);

-- 删除列(drop)
alter table 表名 drop 列名;
alter table student drop chengji;


-- 修改表名(rename)
rename table 旧表名 to 新表名
rename table student to students;

-- 修改表的字符集
alter table 表名 character set 字符集
alter table students character set gbk;
```

#### 删除表

```sql
drop table 表名;
```

### SQL完成对表中数据CRUD的操作

#### 插入数据

```sql
insert into 表名 (列名1,列名2,列名3) values (值1,值2,值3);
insert into student (id,name,gender,age) values (1,'zbei',0,18);

-- 简单写法
insert into 表名 values (值1,值2,值3,值4);
insert into student values (2,'张三',0,20);

-- 批量添加
insert into 表名 (列名1,列名2,列名3) values
										(值1,值2,值3),
										(值1,值2,值3),
										(值1,值2,值3);
										
insert into student (id,name,gender,age) values 
										(4,'李四',1,25),
										(5,'王五',1,24),
										(6,'李白',0,28);

insert into 表名 values
					(值1,值2,值3),
					(值1,值2,值3),
					(值1,值2,值3);
					
insert into student values
					(7,'楚留香',0,27),
					(8,'王昭君',1,22);
					
-- 单行插入和多行插入的效率比较:
	单行插入没有多行插入效率高,
	注意:
		插入多行数据时,有一条数据有问题,则都会插入
```

#### 删除记录

```sql
-- 通过where条件删除指定数据
delete from 表名 [where 条件];
delete from student where id=1;

-- 删除表中所有数据
delete from 表名;
delete from student;

-- 常见问题: delete 删除数据和truncate 删除数据有什么区别?
delete : 属于 DML 一条一一条删除数据
truncate : 属于 DDL 先删除表在重建表

-- 执行效率:
	如果数据少: delete删除的效率比较高
	如果数据多: truncate删除效率比较高
```

#### 更新记录

```sql
-- 通过where条件修改值
update 表名 set 列名1=列的值,列名2=列的值 [where 条件];
-- 如果参数是字符串需要添加单引号
update student set name='张赛' where id=3;

-- 将表中所有数据的列名同一为同一个数据
update 表名 set 列名1=列的值,列名2=列的值;
update student set name='张赛';
```

#### 查询记录

```sql
-- 查询表中的所有记录
select [distinct] [ * ] from 表名 [where 条件];
distinct : 去除表中重复数据
select * from product;

-- 查询指定列名
select 列名1,列名2 from 表名 [where 条件];
select pname,price from product;
select pname,price from product where id=1;

-- 别名查询 as关键字 (主要用在多表查询)
	-- 表别名
	select 别名.列名1,别名.列名2 from product as 别名;
	select p.pname,p.price from product as p;

	-- 列表名
	select pname as 别名1,price as 别名2 from 表名;
	select pname as 商品名称,price as 商品价格 from product;
    
-- 案例:
-- 商品分类: 数码产品, 鞋靴箱包,馋嘴零食
1.分类id
2.分类名称
3.分类描述
create table category(
    						cid int primary key auto_increment,
    						cname varchar(10),
    						cdesc varchar(31)
						);
insert into category values (null,"手机数码","电子产品,手机配件");
insert into category values (null,"鞋靴箱包","老人头,红蜻蜓");
insert into category values (null,"香烟酒水","黄鹤楼,中华");
insert into category values (null,"馋嘴零食","娃哈哈,卫龙辣条,酸酸乳");
insert into category values (null,"美容化妆","香奈儿,迪奥,YSL");

-- 所有商品:
1.商品id
2.商品名称
3.商品价格
4.生产日期
5.商品分类id

create table product(
		pid int primary key auto_increment,
    	pname varchar(10),
    	price double,
    	pdate timestamp,
    	cno int
);

insert into product values (null,"小米8",2899,null,1);
insert into product values (null,"NIKE",400,null,2);
insert into product values (null,"玉溪",20,null,3);
insert into product values (null,"卫龙辣条",2,null,4);
insert into product values (null,"黑管500",399,null,5);
insert into product values (null,"旺仔小馒头",5,null,4);

-- 简单查询
	-- 查询所有商品
	select * from product;
	-- 查询商品名称和价钱
	select pname,price from product;
	
	-- 别名查询 as关键字
	-- 表别名
    	select p.pname,p.price from product as p;
    -- 列别名
    	select pname as 商品名称,price as 商品价格 from product;
```



```php
循环,continue break,数组,二维数组,solt,concat,indexof,join,pop,push,shift,unshift,slice,splice,length,clear
轮播
for
Math
String
-- 表单验证
	邮箱验证
	空验证
	数字验证
	长度验证

```

















