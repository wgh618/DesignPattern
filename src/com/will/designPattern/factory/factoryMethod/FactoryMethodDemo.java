package com.will.designPattern.factory.factoryMethod;

/**
 * ClassName:FactoryMethodDemo
 * Description:测试类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月28日
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        factory.create().run();
    }
}
