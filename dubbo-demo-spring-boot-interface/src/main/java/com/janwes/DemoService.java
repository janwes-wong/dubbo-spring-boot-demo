package com.janwes;

import java.util.concurrent.CompletableFuture;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/7/11 11:54
 * @description
 */
public interface DemoService {

    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
