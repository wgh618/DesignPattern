package com.will.designPattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:JdkTransactionHandler
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public class JdkTransactionHandler implements InvocationHandler {
    private Object targetObject;

    /**
     * 创建代理实例
     *
     * @return
     */
    public Object createProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces
                (), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnObj = null;

        String methodName = method.getName();

        if (methodName.startsWith("add") || methodName.startsWith("delete") || methodName.startsWith("modify")) {
            beginTransaction();
            returnObj = method.invoke(this.targetObject, args);
            endTransaction();
        } else {
            returnObj = method.invoke(this.targetObject, args);
        }

        return returnObj;
    }

    private void beginTransaction() {
        System.out.println("jdk开启事务");
    }

    private void endTransaction() {

        System.out.println("jdk关闭事务");
    }
}
