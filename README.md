# spring-tx-test
对spring默认事务的一些测试

## 使用默认的jpa：
* 主方法上加  @Transactional  会将当前方法及子方法（包括注入的或私有定义的）都控制在一个事务内
* 主方法上加  @Transactional  子方法注入 加上 @Transactional(propagation= Propagation.REQUIRES_NEW) 子方法会单独开启事务
### 注意事项：
* 在非注入的方法上使用 @Transactional 无效 ，必须是注入的bean 且由 public 修饰，因为事务是代理执行的
* 在使用  @Transactional(propagation= Propagation.REQUIRES_NEW)  时，不需要单独配置事务管理器


```$xslt
alter table new_table engine=InnoDB;
```

