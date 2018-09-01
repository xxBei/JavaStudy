# Set集合

### set集合特点:

   - 无序(读取和存储的顺序可能不一样)
   - 不能添加重复数据
   - 没有索引
   
> #### set是一个接口,不能直接创键对象,想要使用,需要使用多态(父类指向子类对象)来进行使用。

#### 遍历方式：
> - 将结合转为数组,使用数组的索引对它进行遍历
```toArray（）
    Set<String> set = new Hash<>();
    set.add("hello");
    set.add("Java");
    Object[] arr = set.toArray();
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
```
>  - 使用迭代器
```Iterator
    Set<String> set = new Hash<>();
    set.add("hello");
    set.add("Java");
    Iterator<String> it = set.iterator();
    while (it.hasNext()){
        System.out.println(it.next());
    }
```
> - foreach
```aidl
    Set<String> set = new Hash<>();
    set.add("hello");
    set.add("Java");
    for(String str : set){
        System.out.println(str);
    }
```
# Map集合
##### Map集合可以体现出对应关系的数据
> Map:将键映射到值的对象。一个映射不能抱包含重复的键；每个键最多只能映射到一个值。
 
### Map和Collection的区别:
 -	Map:是一个双列集合,常用于处理有对应关系的数据,key是不可以重复的,可以称为夫妻集合。
 -	Collection:是单列集合,Collection有不同的子体系,有的允许重复有索引有序,有的不允许重复且无序,那么我们也成为单身汉集合。
   
# Map常用功能:
> 1. 映射功能
	- V put(K key, V value) : 将指定的值与该映射中指定的键相关联,如果已存在相同键,会将里面对应的value覆盖掉。


> 2. 获取功能
>   - int size() ： 获取集合的长度
>   - V get(Object key) ： 获取键对应的值  

> 3. 判断功能
>   - boolean isEmpty() ：  判断集合中的数据是否为空,为空返回true。 
>   - boolean containsKey(Object key) ： 判断键是否存在
>   - boolean containsValue(Object value) : 判断值是否存在  
  
> 4. 删除功能
>   - void clear() ： 删除集合中所有的对应关系数据
>   - V remove(Object key) ： 删除指定key所对应的关系数据,并返回对应的值


> 5. 遍历功能
>   - Set<K> keySet()  : 获取map中所有的Key
>   - Collection<V> values()  : 获取map中所有的value
>   - Set<Map.Entry<K,V>> entrySet()  : 将数据通过Set<Map.Entry<K,V>>进行存储。<br />
>   使用getKey和getValue获取键和值

# HashMap使用:
#### 创键HashMap对象:
> **<font color="#f00">HashMap hashmap = new HashMap();</font>**
 ```
	//创键Map对象
    Map<String,String> map = new HashMap<>();
    //存储数据
    map.put("曹操","孟德");
    map.put("刘备","玄德");
    map.put("孙权","仲谋");
    //通过Set<Map.Entry<String,String>> 存储每个数据
    Set<Map.Entry<String,String>> entries = map.entrySet();
    //遍历集合
    for (Map.Entry<String,String> entry : entries){
        //接收entry获取的key值
        String key = entry.getKey();
        //接收entry获取的value值
        String value = entry.getValue();
        System.out.println("名:"+ key +"-----"+ "字:" + value);
    }
 ```

