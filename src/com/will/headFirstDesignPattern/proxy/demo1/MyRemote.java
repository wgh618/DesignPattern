package com.will.headFirstDesignPattern.proxy.demo1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * ClassName:MyRemote
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
