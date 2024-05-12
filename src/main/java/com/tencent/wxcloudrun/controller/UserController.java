package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.entity.User;
import com.tencent.wxcloudrun.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/searchUser")
    public Integer searchUser(String account){
        return userService.searchUser(account);
    }

    @GetMapping(value = "/register")
    public Integer register(String account,String name,String phone,String email,String password){
        return userService.register(account,name,phone,email,password);
    }

    @GetMapping(value = "/logIn")
    public User logIn(String account, String password){
        return userService.logIn(account,password);
    }

    @GetMapping(value = "/changeInfo")
    public Integer register(Integer id,String account,String name,String phone,String email){
        return userService.changeInfo(id,account,name,phone,email);
    }

    @GetMapping(value = "/changePassword")
    public void changePassword(Integer id,String password){
        userService.changePassword(id,password);
    }

    @GetMapping(value = "/getPassword")
    public String getPassword(Integer id){
        return userService.getPassword(id);
    }
}
