package com.will.headFirstDesignPattern.strategy.behavior.impl;

import com.will.headFirstDesignPattern.strategy.behavior.QuackBehavior;

/**
 * ClassName:Squeak
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月15日
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
