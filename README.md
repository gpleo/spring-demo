# spring-demo
Some demo for spring.

spring-jpa-demo
-------------------------------

使用Spring jpa, hibernate, mysql演示数据库操作，使用两个简单的HTTP接口可增加和查看数据。

例子中可以看到HTTP服务的端口配置、数据源配置、hibernate配置和对Spring Repository接口使用。

Spring Repository自动生成的SQL，会将数据表名和字段名都转为小写，无论在@Table或@Column中怎么设置。如将blogTitle，将会被转换为blog_title。所以在定义表名及字段名时，就直接使用这种规则。
