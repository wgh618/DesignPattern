package com.will.headFirstDesignPattern.proxy.protectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:OwnerInvocationHandler
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private Person person;

    public Person createProxyInstance(Person person) {
        this.person = person;
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if ("setHotOrNotRating".equals(method.getName())) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
