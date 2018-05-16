package com.will.headFirstDesignPattern.strategy.behavior.impl;

import com.will.headFirstDesignPattern.strategy.behavior.FlyBehavior;

/**
 * ClassName:FlyNoWay
 * Description:不会飞
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月15日
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}
