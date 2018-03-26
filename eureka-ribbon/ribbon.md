# SpringCloudDemo - eureka-ribbon


### 服务消费者（rest+ribbon）
```
Ribbon是一个负载均衡客户端
```
准备工作: 
```
1.  eureka-server, eureka-client 为基础先运行
2.  新建服务消费者Ribbon
3.  分别运行 eureka-client 8762/8763 
    -提示: 可用cmd运行jar形式{dev, pro} 或者 cp project 
```
测试工作:
```
1.  http://localhost:8764/eureka/ribbon?name=eddie
    -查看返回页面, 留意port 多刷新几次查看是否切换了
```