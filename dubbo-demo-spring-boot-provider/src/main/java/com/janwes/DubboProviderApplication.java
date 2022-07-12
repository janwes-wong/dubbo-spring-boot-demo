package com.janwes;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/7/11 15:11
 * @description Dubbo服务提供者启动类
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = {"com.janwes.api"}) // 也可以在yml配置文件加入scan扫描包
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
