package com.terwergreen.s1oa.dao;


import com.terwergreen.s1oa.bean.User;

import java.util.List;

/**
 * @name: UserDao
 * @author: terwer
 * @date: 2022-05-06 21:44
 **/
public interface UserDao {
    void saveUser(User user);

    void removeUser(User user);

    User getUserById(Integer id);

    List<User> findAllUsers();

    void updateUser(User user);
}
