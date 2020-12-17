package com.wei.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title UserController
 * @Author wei
 * @Date 2020/12/17 13:42
 * @Description
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/test")
    public String test(){
        return "ok";
    }
}
