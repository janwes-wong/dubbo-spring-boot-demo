package com.janwes.service.impl;

import com.janwes.DemoService;
import com.janwes.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.service.impl
 * @date 2022/7/11 15:38
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @DubboReference
    private DemoService demoService;

    @Override
    public String getInfo(String name) {
        return demoService.sayHello(name);
    }
}
