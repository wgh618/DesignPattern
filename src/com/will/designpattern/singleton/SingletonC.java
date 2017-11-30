package com.will.designpattern.singleton;

/**
 * ClassName:SingletonC
 * Description:懒汉式单例类--在getInstance方法上加同步--线程安全
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2017年11月30日
 */
public class SingletonC {
    private static SingletonC singleton = null;
    
    private SingletonC() {}
    
    public static synchronized SingletonC getInstance() {
    	if (singleton == null) {
    		singleton = new SingletonC();
    	}
		return singleton;
	}
}
