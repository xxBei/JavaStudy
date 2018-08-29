# Collection集合

#### Collection是一个接口,不能实例化对象,所以需要使用多态中的父类指向子类对象来进行使用。

> Collection collection = new ArrayList();

#### Collection常见方法:
1. boolean add(E e);  确保此集合包含指定的元素,成功返回true
    > collection.add("value");
    
2. void clear();  清空集合
    > collection.clear();    

3. boolean remove(Object obj);  从集合中删除指定的元素
    > collection.remove("value");
    
4. int size();  返回集合中的个数
    > collection.size();

5. Object[] toArray(); 返回一个包含集合中所有元素的数组
    > Object obj = collection.toArray();

# Iterator 迭代器
###常用方法:
> Iterator<E>  iterator();  返回集合的迭代器

> boolean hasnext();    检查集合中是否还有元素,有则返回true

> E next();     返回集合中下一个元素

### Iterator使用方法:
```$xslt
    //创键集合对象
    Collection c = new ArrayList();
    //添加迭代器
    Iterator it = c.iterator();
```

# foreach循环
### foreach 用于遍历集合和数组
#### 使用方法:
```$xslt
    //创键集合
    Collection<String> c = new ArrayList<>();
    //添加元素
    c.add("hello");
    c.add("java");
    //遍历集合
    for(String str : c){
        System.out.println(str);
    }
```

# 泛型:
> 泛型的来历:

    由于集合可以存储任意类型的元素,当我们存储了不同类型的元素,就有可能在转换类型的时候出现类型转换异常
    所以java为了解决这个问题,提供了一种机制,叫做泛型。
    
### 泛型:
    是一种广泛的类型,把明确数据类型的工作提前到了编译时期,借鉴到数组的特点
### 优点:
   > 1.避免了类型转化
   
   > 2.减少错误提醒
   
   > 3.简化代码书写
   
### 何时使用:
   > 看API,当看到接口或类有<E>,就可以使用泛型了
   
   
# 列表
### 列表特点:
   1.有序列表(读取和存储的顺序一致)
   
   2.有整数索引
   
   3.允许数据重复

#### 常用方法:
> boolean add(E e);   将指定的项目添加到列表的末尾。

> void add(int index, E element)  将指定的项目添加到由索引指示的位置的列表中。

> E get(int index);    获取索引处的元素

> E remove(int index);   删除索引处的元素

> E set(int index, E element);  用指定元素替换索引处对应的元素

> int size();     返回列表中的元素个数

> Object[] toArray();     返回一个包含此列表中所有元素的数组



### 列表中最长用的两个子类
> ArrayList 
   - 查询快，增删慢，ArrayList的底层是数组

> LinkedList
   - 查询慢，增删快，LinkedList的底层是链表
   
#### LinkedList常用方法:
> boolean add(E e);     添加列表元素

> E get(int index)      获取指定索引的元素

> E getFirst()          获取第一位的元素

> E getLast()           获取最后一位的元素

> E remove(int index)   删除指定索引的元素

> E removeFirst()       删除第一位元素

> E removeLast()        删除最后一位元素