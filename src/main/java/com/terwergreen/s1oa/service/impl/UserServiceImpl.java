package com.terwergreen.s1oa.service.impl;

import com.terwergreen.s1oa.bean.User;
import com.terwergreen.s1oa.dao.UserDao;
import com.terwergreen.s1oa.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户业务实现类
 *
 * @name: UserServiceImpl
 * @author: terwer
 * @date: 2022-05-06 22:02
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAllUsers();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = false)
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.removeUser(user);
    }

    @Override
    public User findById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
