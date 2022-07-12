# *springboot整合dubbo*
本项目demo案例采用Apache dubbo



### zookeeper常用命令
- 查看服务注册的节点

```
// 查看服务注册接口
ls /dubbo

// 查看服务注册接口的提供者
ls /dubbo/[接口]/provider
例如：ls /dubbo/com.janwes.DemoService/provider
// 查看服务注册接口的消费者
ls /dubbo/[接口]/consumer
例如：ls /dubbo/com.janwes.DemoService/consumer
```

