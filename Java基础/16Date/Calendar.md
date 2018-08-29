## Calendar (日历)

### Calendar是抽象类不能直接通过new来创建对象,需要借助其方法来实现创建对象。
### calendar提供了一些操作年月日时的方法

> Calendar c = Calendar.getInstance();

> getInstance();使用默认时区和区域设置获取日历。

> get(int field);返回给定日历字段的值。

> Calendar.YEAR;获取当前日历中的年

> Calendar.MONTH;获取当前日历中的月,注意:月是从0开始计算的,所以要+1

> Calendar>DAY_OF_MONTH;获取当前日历中的天

