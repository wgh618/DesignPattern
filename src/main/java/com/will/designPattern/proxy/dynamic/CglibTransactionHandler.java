package com.will.designPattern.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName:CglibTransactionHandler
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public class CglibTransactionHandler implements MethodInterceptor {
    private Object targetObject;

    public Object createProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object returnObj = null;

        String methodName = method.getName();

        if (methodName.startsWith("add") || methodName.startsWith("delete") || methodName.startsWith("modify")) {
            beginTransaction();
        }

        returnObj = method.invoke(this.targetObject,args);

        if (methodName.startsWith("add") || methodName.startsWith("delete") || methodName.startsWith("modify")) {
            endTransaction();
        }

        return returnObj;
    }

    private void beginTransaction() {
        System.out.println("start事务");
    }

    private void endTransaction() {
        System.out.println("stop事务");
    }
}
