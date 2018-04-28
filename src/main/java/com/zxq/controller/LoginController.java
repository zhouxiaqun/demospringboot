package com.zxq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2018/4/28.
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/index")
    public String index(){
        return "Hello Spring Boot";
    }
}
