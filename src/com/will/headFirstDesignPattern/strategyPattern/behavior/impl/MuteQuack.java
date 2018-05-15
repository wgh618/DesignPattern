package com.will.headFirstDesignPattern.strategyPattern.behavior.impl;

import com.will.headFirstDesignPattern.strategyPattern.behavior.QuackBehavior;

/**
 * ClassName:MuteQuack
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月15日
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
