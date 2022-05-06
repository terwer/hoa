package com.terwergreen.hoa.service;

import com.terwergreen.hoa.bean.User;

import java.util.List;

/**
 * 用户业务接口
 *
 * @name: UserService
 * @author: terwer
 * @date: 2022-05-06 22:00
 **/
public interface UserService {
    List<User> findAll();

    void saveUser(User user);

    void deleteUser(User user);

    User findById(Integer id);

    void updateUser(User user);
}
