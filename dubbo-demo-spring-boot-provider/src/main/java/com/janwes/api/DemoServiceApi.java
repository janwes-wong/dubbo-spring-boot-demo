package com.janwes.api;

import com.janwes.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.api
 * @date 2022/7/11 15:20
 * @description
 */
@DubboService
public class DemoServiceApi implements DemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceApi.class);

    @Override
    public String sayHello(String name) {
        LOGGER.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name;
    }
}
