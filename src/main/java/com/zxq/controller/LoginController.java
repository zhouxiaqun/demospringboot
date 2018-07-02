package com.zxq.controller;

import com.zxq.model.User;
import com.zxq.service.impl.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhou on 2018/4/28.
 */
@RestController
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(String username, String password){
        if (username == null || username.equals("")){
            return "用户名不能为空";
        }
        if (password == null || password.equals("")){
            return "密码不能为空";
        }
        User user = userService.getByUserName(username);
        if (!user.getPassword().equals(password)){
            return "登录失败";
        }
        return "登录成功";
    }
}
