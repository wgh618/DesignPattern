package com.will.designpattern.singleton;

/**
 * ClassName:SingletonB
 * Description:懒汉式单例类--线程不安全
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2017年11月30日
 */
public class SingletonB {
    private static SingletonB singleton = null;
    
    private SingletonB() {}
    
    public static SingletonB getInstance() {
    	if (singleton == null) {
    		singleton = new SingletonB();
    	}
		return singleton;
	}
}
