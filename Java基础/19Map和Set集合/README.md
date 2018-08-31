# Set集合

### set集合特点:

   - 无序(读取和存储的顺序可能不一样)
   - 不能添加重复数据
   - 没有索引
   
> #### set是一个接口,不能直接创键对象,想要使用,需要使用多态(父类指向子类对象)来进行使用。

#### 遍历方式：
> - 将结合转为数组,使用数组的索引对它进行遍历
```aidl
    Set<String> set = new Hash<>();
    set.add("hello");
    set.add("Java");
    Object[] arr = set.toArray();
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
```
>  - 使用迭代器
```aidl
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
