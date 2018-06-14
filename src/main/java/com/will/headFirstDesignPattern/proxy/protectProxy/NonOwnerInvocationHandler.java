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
public class NonOwnerInvocationHandler implements InvocationHandler {
    private Object targetObject;

    public Object createProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            String methodName = method.getName();
            if (methodName.startsWith("get")) {
                return method.invoke(targetObject, args);
            } else if ("setHotOrNotRating".equals(methodName)) {
                return method.invoke(targetObject, args);
            } else if (methodName.startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
