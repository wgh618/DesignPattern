package com.will.designPattern.proxy;

import com.will.designPattern.proxy.domain.User;
import com.will.designPattern.proxy.service.UserService;

/**
 * ClassName:TransactionProxy
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public class TransactionProxy implements UserService {

    private UserService userService;

    public TransactionProxy() {
    }

    public TransactionProxy(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void addUser(User user) {
        beginTransaction();

        this.userService.addUser(user);

        endTransaction();
    }

    @Override
    public void deleteUser(User user) {
        beginTransaction();

        this.userService.deleteUser(user);

        endTransaction();
    }

    @Override
    public User findUserById(Integer id) {
        return this.userService.findUserById(id);
    }

    private void beginTransaction() {
        System.out.println("开启事务");
    }

    private void endTransaction() {
        System.out.println("关闭事务");
    }
}
