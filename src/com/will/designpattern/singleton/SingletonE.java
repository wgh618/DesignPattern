package com.will.designpattern.singleton;

/**
 * ClassName:SingletonE
 * Description:懒汉式单例类--静态内部类--线程安全
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2017年11月30日
 */
public class SingletonE {
    private static class LazyHolder {
    	private static final SingletonE INSTANCE = new SingletonE();
    }
    
    private SingletonE() {}
    
    public SingletonE getInstance() {
		return LazyHolder.INSTANCE;
	}
}
