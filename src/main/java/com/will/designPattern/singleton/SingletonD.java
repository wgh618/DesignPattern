package com.will.designPattern.singleton;

/**
 * ClassName:SingletonD
 * Description:懒汉式单例类--双重检查锁定--线程安全
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2017年11月30日
 */
public class SingletonD {
    private static SingletonD singleton = null;
    
    private SingletonD() {}
    
    public static SingletonD getInstance() {
    	if (singleton == null) {
    		synchronized(SingletonD.class) {
    			if (singleton == null) {
    				singleton = new SingletonD();
    			}
    		}
    	}
		return singleton;
	}
}
