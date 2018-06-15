package com.will.designPattern.proxy.service;

import com.will.designPattern.proxy.domain.User;

/**
 * ClassName:UserService
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public interface UserService {
    void addUser(User user);

    void deleteUser(User user);

    User findUserById(Integer id);
}
