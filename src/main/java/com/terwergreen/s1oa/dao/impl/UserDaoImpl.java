package com.terwergreen.s1oa.dao.impl;

import com.terwergreen.s1oa.bean.User;
import com.terwergreen.s1oa.dao.UserDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @name: UserDaoImpl
 * @author: terwer
 * @date: 2022-05-06 21:47
 **/
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public void saveUser(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public void removeUser(User user) {
        this.getHibernateTemplate().delete(user);
    }

    @Override
    public User getUserById(Integer id) {
        User user = this.getHibernateTemplate().get(User.class, id);
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        String hql = "from User user order by user.id desc";
        return (List<User>) this.getHibernateTemplate().find(hql);
    }

    @Override
    public void updateUser(User user) {
        this.getHibernateTemplate().update(user);
    }
}
