package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;

public interface IUserService extends IService<User> {
    //登录方法
    User login(User user);
}
