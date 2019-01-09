# Hibernate查询方式

### OID查询

OID检索: Hibernate根据对象的OID (主键) 进行检索

#### 使用get方法:

```java
Customer customer = session.get(Customer.class,1l);
```

#### 使用load方法:

```java
Customer customer = session.load(Customer.class,1l);
```

### 对象导航检索

对象导航检索: Hibernate 根据一个已经查询到的对象,获取其关联的对象的一种方式

```java
LinkMan linkman = session.get(LinkMan.class,1l);//获取联系人对象
Customer customer = linkman.getCustomer();//根据联系人获取到客户对象

Customer customer = session.get(Customer.class,1l);//获取客户对象
Set<LinkMan> linkmans = customer.getLinkMan();//根据客户获取所有联系人对象
```



### <font color='red'>HQL检索</font>

​	HQL查询: Hibernate Query Language，hibernate的查询语言，是一种面向对象的查询语言，语法类似SQL。通过session.createQuery()，用于接收一个HQL进行查询方式

####  HQL的简单查询

```java
//简单查询
public void test02(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Query query = session.createQuery("from Customer ");
    List<Customer> list = query.list();

    for(Customer customer : list){
        System.out.println(customer);
    }
    transaction.commit();
}
```

```
/**
 * HQL别名查询
 * */
public void test03(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();
    //别名查询1
    /*Query query = session.createQuery("select c from Customer c");
    List<Customer> list = query.list();*/

    //别名查询2
    Query query = session.createQuery("from Customer c");
    List<Customer> list = query.list();

    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

#### HQL的排序查询

```java
/**
 * HQL排序查询
 * */
public void test04(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();
    //默认升序排序
    //List<Customer> list = session.createQuery("from Customer order by cust_id").list();
    //降序排序
    List<Customer> list = session.createQuery("from Customer order by cust_id desc").list();

    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

#### HQL的条件查询

```java
/**
 * HQL条件查询
 * */
public void test05(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();
    /**
     * 按位置绑定:根据参数的位置进行绑定
     */
    //一个条件查询
    /*Query query = session.createQuery("from Customer where cust_name = ?0");
    query.setParameter(0,"李冰");*/

    //多个条件查询
    /*Query query = session.createQuery("from Customer where cust_source = ?0 and cust_name " +
            "like ?1");
    query.setParameter(0,"百度推广");
    query.setParameter(1,"李%");*/

    /**
     * 按名称绑定
     * */
    Query query = session.createQuery("from Customer where cust_name = :aaa and cust_source " +
            "like :bbb");
    query.setParameter("aaa","李冰");
    query.setParameter("bbb","百%");

    List<Customer> list = query.list();
    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

#### HQL的投影查询

```java
/**
 * 投影查询:查询对象的某个或多个属性
 * */
public void test06(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    //单个属性
    /*Query query = session.createQuery("select c.cust_name from Customer c");
    List<Customer> list = query.list();
    for(Object obj : list){
        System.out.println(obj);
    }*/

    //多个属性
    /*Query query = session.createQuery("select c.cust_name,c.cust_source from Customer c");
    List<Object[]> list = query.list();//将查询结果放入数组中
    for(Object[] objects : list){
        System.out.println(Arrays.toString(objects));
    }*/

    //查询多个属性,但是将查询的结构放在对象中去
    Query query = session.createQuery("select new Customer (cust_name,cust_source) from " +
            "Customer ");
    List<Customer> list = query.list();
    for(Customer customer:list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

#### HQL的分组统计查询

```java
/**
 * 分页查询:
 * */
public void test07(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Query query = session.createQuery("from LinkMan ");
    query.setFirstResult(0);//设置起始位置
    query.setMaxResults(15);//设置查询几条
    List<LinkMan> list = query.list();
    for(LinkMan linkMan:list){
        System.out.println(linkMan);
    }

    transaction.commit();
}
```

#### HQL的分页查询

```java
/**
 * 分组统计查询:
 */
public void test08(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    //聚合函数的使用: count() max() min() avg() sum()
    //uniqueResult()表示要唯一的结果
    /*Object obj = session.createQuery("select count(*) from Customer ").uniqueResult();
        System.out.println(obj);*/

    //分组统计
    /*List<Object[]> list =
                session.createQuery("select cust_source,count(*) from Customer GROUP BY cust_source").list();*/

    //分组统计,统计大于2的东西
    Query query = session.createQuery("select cust_source,count(*) from Customer GROUP " +
                                      "BY cust_source having count(*) >= ?0");

    query.setParameter(0,2l);

    List<Object[]> list = query.list();

    for (Object[] objects : list){
        System.out.println(Arrays.toString(objects));
    }

    transaction.commit();
}
```

#### HQL多表连接

```mysql

交叉连接: 查询两个表所有信息
SELECT * FROM cst_customer1,cst_linkman1;

  内连接: 查询两个表有关联的共同数据
      显示内连接:
      SELECT * FROM cst_customer1 c INNER JOIN cst_linkman1 l ON c.cust_id = l.lkm_cust_id;
 
      隐式内连接:
      SELECT * FROM cst_customer1 c ,cst_linkman1 l WHERE c.cust_id = l.lkm_cust_id;
 
  外连接:
      左外连接:不仅查出两个表中有关联的数据,还会将左边表中的数据也查出来
      SELECT * FROM cst_customer1 c LEFT OUTER JOIN cst_linkman1 l ON c.cust_id = l.lkm_cust_id;
 
      右外连接:不仅查出两个表中有关联的数据,还会将右边表中的数据也查出来
      SELECT * FROM cst_customer1 c RIGHT OUTER JOIN cst_linkman1 l ON c.cust_id = l.lkm_cust_id;
```

```java
/**
 *  HQL多表连接查询 -- 内连接
 * */
public void test09(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    //HQL内连接：from Customer c inner join c.linkMans  会将查询结果复杂化
    /*List<Object[]> list = session.createQuery("from Customer c inner join c.linkMans").list();
    for(Object[] objects : list){
        System.out.println(Arrays.toString(objects));
    }*/

    //HQL:迫切内连接  其实就是在普通的内连接inner join 后面加一个关键字 fetch
    //fetch 作用就是通知hibernate ,将另一个对象的数据封装到该对象中
    //作用就是通知hibernate ,将LinkMan对象的数据封装到Customer对象中
    List<Customer> list = session.createQuery("select distinct c from Customer c inner join fetch c.linkMans").list();
    for(Customer customer : list){
        System.out.println(customer);
    }
    transaction.commit();
}
```

### <font color='red'> QBC检索</font>

QBC查询: Query By Criteria，条件查询。是一种更加面向对象化的查询方式。

> 新方法: CriteriaBuilder

#### QBC的简单查询

```java
/**
 *简单查询
 * */
public void test01(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    //获取CriteriaBuilder
    CriteriaBuilder builder = session.getCriteriaBuilder();
    //通过builder获取CriteriaQuery
    CriteriaQuery<Customer> criteriaQuery = builder.createQuery(Customer.class);
    //Root 对应着Customer这个实体,from表示查询表
    Root<Customer> root = criteriaQuery.from(Customer.class);
    //查询实体(表)中全部字段
    criteriaQuery.select(root);
    //创建一个Query用于执行criteria查询,下面两个方法都可以使用
    //Query<Customer> query = session.createQuery(criteriaQuery);
    Query query = session.createQuery(criteriaQuery);

    List<Customer> list = query.list();
    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

> 旧方法 Criteria

```java
/**
 * 简单查询
 * */
public void test01(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Criteria criteria = session.createCriteria(Customer.class);
    List<Customer> list = criteria.list();

    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

#### QBC的排序查询

> 新方法 CriteriaBulider

```java
/**
 * 排序查询
 * */
public void test03(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    CriteriaBuilder builder = session.getCriteriaBuilder();
    CriteriaQuery<Customer> criteriaQuery = builder.createQuery(Customer.class);
    Root<Customer> root = criteriaQuery.from(Customer.class);
    //根据cust_id排序
    //criteriaQuery.orderBy(builder.asc(root.get("cust_id")));//正序
    criteriaQuery.orderBy(builder.desc(root.get("cust_id")));//倒序

    Query query = session.createQuery(criteriaQuery);
    List<Customer> list = query.list();

    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

> 旧方法 Criteria

```java
/**
 * 排序查询
 * */
public void test02(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Criteria criteria = session.createCriteria(Customer.class);
    //criteria.addOrder(Order.asc("cust_id"));//正序
    criteria.addOrder(Order.desc("cust_id"));//倒序
    List<Customer> list = criteria.list();

    for(Customer customer : list){
        System.out.println(customer);
    }

    transaction.commit();
}
```

#### QBC的分页查询

> 新方法 CriteriaBuilder

```java
/**
 * 分页查询
 * */
public void test04(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    CriteriaBuilder builder = session.getCriteriaBuilder();
    CriteriaQuery<LinkMan> criteriaQuery = builder.createQuery(LinkMan.class);
    Root<LinkMan> root = criteriaQuery.from(LinkMan.class);
    Query query = session.createQuery(criteriaQuery);
    query.setFirstResult(0);//设置从哪里开始查询
    query.setMaxResults(15);//查询多少条
    List<LinkMan> list = query.list();
    for(LinkMan linkMan : list){
        System.out.println(linkMan);
    }

    transaction.commit();
}
```

> 旧方法 Criteria

```java
/**
 * 分页查询
 * */
public void test03(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Criteria criteria = session.createCriteria(LinkMan.class);
    criteria.setFirstResult(0);
    criteria.setMaxResults(15);
    List<LinkMan> list = criteria.list();

    for(LinkMan linkMan : list){
        System.out.println(linkMan);
    }
    transaction.commit();
}
```

#### QBC的条件查询

> 新方法 CriteriaBuilder

```java
/**
 * 条件查询
 * */
public void test05(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    CriteriaBuilder builder = session.getCriteriaBuilder();
    CriteriaQuery criteriaQuery = builder.createQuery(Customer.class);
    Root root = criteriaQuery.from(Customer.class);
    criteriaQuery.select(root);
    /**
     * =  : equal
     * >  : gt
     * >= : ge
     * <  : lt
     * <= : le
     * <> :  notEqual  不等于
     * like , in , and , or
     * */
    //添加1个条件,equal表示等于: cust_source="百度推广"
    criteriaQuery.where(builder.equal(root.get("cust_source"),"百度推广"));
    //添加2个条件
    criteriaQuery.where(builder.like(root.get("cust_name"),"李%"));
    Query query = session.createQuery(criteriaQuery);
    List<Customer> list = query.list();
    for(Customer customer : list){
        System.out.println(customer);
    }
    transaction.commit();
}
```

> 旧方法 Criteria

```java
/**
 * 条件查询
 * */
public void test04(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Criteria criteria = session.createCriteria(Customer.class);
    /**
     * =  : eq
     * >  : gt
     * >= : ge
     * <  : lt
     * <= : le
     * <> : ne  不等于
     * like , in , and , or
     * */
    //添加1个条件,eq表示等于: cust_source="百度推广"
    criteria.add(Restrictions.eq("cust_source","百度推广"));
    //添加2个条件
    //使用or的查询的方式
    //criteriaQuery.where(builder.or(builder.like(root.get("cust_name"),"李%")));
    criteria.add(Restrictions.like("cust_name","李%"));
    List<Customer> list = criteria.list();

    for(Customer customer : list){
        System.out.println(customer);
    }
    transaction.commit();
}
```

#### QBC的统计查询

> 新方法 CriteriaBuilder

```java
/**
 * 统计查询
 * */
public void test06(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    CriteriaBuilder builder = session.getCriteriaBuilder();
    CriteriaQuery criteriaQuery = builder.createQuery(Customer.class);
    Root<Customer> root = criteriaQuery.from(Customer.class);
    criteriaQuery.select(builder.count(root.get("cust_id")));
    Query query = session.createQuery(criteriaQuery);
    Long num = (Long) query.uniqueResult();

    System.out.println(num);
    transaction.commit();
}
```

> 旧方法 Criteria

```java
/**
 * 统计查询
 * */
public void test05(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Criteria criteria = session.createCriteria(Customer.class);
    /**
     * add  : 普通的条件. where后面条件
     * addOrder : 排序
     * setprojection : 聚合函数 和  group by  having
     * */
    criteria.setProjection(Projections.rowCount());
    Object obj = criteria.uniqueResult();
    System.out.println(obj);

    transaction.commit();
}
```

#### QBC的离线查询

```java
/**
 * 离线条件查询
 * */
public void test08(){
    DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
    detachedCriteria.add(Restrictions.like("cust_name","李%"));
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    Criteria criteria = detachedCriteria.getExecutableCriteria(session);
    List<Customer> list = criteria.list();
    for(Customer customer : list){
        System.out.println(customer);
    }

}
```

### SQL查询

```java
/**
 * 使用sql查询
 * */
public void test01(){
    Session session = HibernateUtils.getCurrentSession();
    Transaction transaction = session.beginTransaction();

    /*NativeQuery sqlQuery = session.createSQLQuery("select * from cst_customer1");
    List<Object[]> list =sqlQuery.list();
    for(Object[] objects : list){
        System.out.println(Arrays.toString(objects));
    }*/

    NativeQuery sqlQuery = session.createSQLQuery("select * from cst_customer1");
    sqlQuery.addEntity(Customer.class);
    List<Customer> list = sqlQuery.list();

    for(Customer customer : list){
        System.out.println(customer);
    }
    transaction.commit();
}
```

