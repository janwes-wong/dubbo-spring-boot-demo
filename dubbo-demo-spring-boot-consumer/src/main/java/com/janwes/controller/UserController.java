package com.janwes.controller;

import com.janwes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.controller
 * @date 2022/7/11 15:34
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public String getInfo(@RequestParam("name") String name) {
        return userService.getInfo(name);
    }
}
