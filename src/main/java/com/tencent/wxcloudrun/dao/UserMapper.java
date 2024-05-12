package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {

    Integer register(@RequestParam("account") String account, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("email") String email, @RequestParam("password") String password);

    Integer searchUser(@RequestParam("account") String account);

    User logIn(@RequestParam("account") String account, @RequestParam("password") String password);

    void changeInfo(@RequestParam("id") Integer id, @RequestParam("account") String account, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("email") String email);

    void changePassword(@RequestParam("id") Integer id, @RequestParam("password") String password);

    String getPassword(@RequestParam("id") Integer id);
}
