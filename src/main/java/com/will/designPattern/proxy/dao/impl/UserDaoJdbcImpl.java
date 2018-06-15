package com.will.designPattern.proxy.dao.impl;

import com.will.designPattern.proxy.dao.UserDao;
import com.will.designPattern.proxy.domain.User;

/**
 * ClassName:UserDaoJdbcImpl
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public class UserDaoJdbcImpl implements UserDao {
    @Override
    public void saveUser(User user) {
        System.out.println("jdbc add " + user);
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("jdbc delete " + user);
    }

    @Override
    public User loadUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("Will");
        user.setPassword("admin");
        return user;
    }
}
