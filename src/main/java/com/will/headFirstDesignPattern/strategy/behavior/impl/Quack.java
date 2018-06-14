package com.will.headFirstDesignPattern.strategy.behavior.impl;

import com.will.headFirstDesignPattern.strategy.behavior.QuackBehavior;

/**
 * ClassName:Quack
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月15日
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
