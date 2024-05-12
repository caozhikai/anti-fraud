package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.UserMapper;
import com.tencent.wxcloudrun.entity.User;
import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Integer register(String account, String name, String phone, String email,String password) {
        userMapper.register(account,name,phone,email,password);
        return 1;
    }

    public Integer searchUser(String account) {
        return userMapper.searchUser(account);
    }

    public User logIn(String account, String password) {
        return userMapper.logIn(account,password);
    }

    public Integer changeInfo(Integer id, String account, String name, String phone, String email) {
        userMapper.changeInfo(id,account,name,phone,email);
        return 1;
    }

    public void changePassword(Integer id, String password) {
        userMapper.changePassword(id,password);
    }

    public String getPassword(Integer id) {
        return userMapper.getPassword(id);
    }
}
