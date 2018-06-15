package com.will.designPattern.proxy.service.impl;

import com.will.designPattern.proxy.dao.UserDao;
import com.will.designPattern.proxy.dao.impl.UserDaoJdbcImpl;
import com.will.designPattern.proxy.domain.User;
import com.will.designPattern.proxy.service.UserService;

/**
 * ClassName:UserServiceImpl
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoJdbcImpl();
    }

    @Override
    public void addUser(User user) {
        this.userDao.saveUser(user);
    }

    @Override
    public void deleteUser(User user) {
        this.userDao.deleteUser(user);
    }

    @Override
    public User findUserById(Integer id) {
        return this.userDao.loadUser(id);
    }
}
