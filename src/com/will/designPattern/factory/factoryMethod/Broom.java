package com.will.designPattern.factory.factoryMethod;

/**
 * ClassName:Broom
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月28日
 */
public class Broom implements Moveable {
    @Override
    public void run() {
        System.out.println("I'm broom,i'm running...");
    }
}
