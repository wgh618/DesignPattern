package com.will.headFirstDesignPattern.strategy;

import com.will.headFirstDesignPattern.strategy.behavior.impl.FlyWithWings;
import com.will.headFirstDesignPattern.strategy.behavior.impl.Squeak;

/**
 * ClassName:Test
 * Description:测试类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月15日
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squeak());
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
