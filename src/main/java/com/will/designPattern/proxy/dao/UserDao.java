package com.will.designPattern.proxy.dao;

import com.will.designPattern.proxy.domain.User;

/**
 * ClassName:UserDao
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public interface UserDao {
    void saveUser(User user);

    void deleteUser(User user);

    User loadUser(Integer id);
}
