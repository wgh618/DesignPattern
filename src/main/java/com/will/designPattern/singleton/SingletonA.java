package com.will.designPattern.singleton;

/**
 * ClassName:SingletonA
 * Description:饿汉式单例类--线程安全
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2017年11月30日
 */
public class SingletonA {
	private static final SingletonA singleton = new SingletonA();
	
	private  SingletonA() {}
	
	public static SingletonA getInstance() {
		return singleton;
	}
}
