package com.will.designPattern.proxy.service.impl;

import com.will.designPattern.proxy.domain.User;
import com.will.designPattern.proxy.dynamic.CglibTransactionHandler;
import com.will.designPattern.proxy.dynamic.JdkTransactionHandler;
import com.will.designPattern.proxy.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ClassName:UserServiceImplTest
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public class UserServiceImplTest {
    private UserService userService;
    private JdkTransactionHandler jdkTransactionHandler;
    private CglibTransactionHandler cglibTransactionHandler;

    @Before
    public void setUp() throws Exception {
        this.jdkTransactionHandler = new JdkTransactionHandler();
        this.cglibTransactionHandler = new CglibTransactionHandler();

        // 代理对象与目标对象实现了同样的接口
        this.userService = (UserService) this.jdkTransactionHandler.createProxyInstance(new UserServiceImpl());
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setId(1000);
        user.setName("will");
        user.setPassword("admin");
        this.userService.addUser(user);
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void findUserById() {
        System.out.println(this.userService.findUserById(10000));
    }
}