package com.will.headFirstDesignPattern.proxy.remoteProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * ClassName:MyRemoteImpl
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {}
    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        MyRemote myRemote = null;
        try {
            myRemote = new MyRemoteImpl();
            Naming.rebind("RemoteHello", myRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
