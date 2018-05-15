package com.will.headFirstDesignPattern.strategyPattern.behavior.impl;

import com.will.headFirstDesignPattern.strategyPattern.behavior.FlyBehavior;

/**
 * ClassName:FlyWithWings
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月15日
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
