package com.will.headFirstDesignPattern.strategy;

import com.will.headFirstDesignPattern.strategy.behavior.FlyBehavior;
import com.will.headFirstDesignPattern.strategy.behavior.QuackBehavior;

/**
 * ClassName:Duck
 * Description:策略模式
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月14日
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");


    }
}
