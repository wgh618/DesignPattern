package com.will.headFirstDesignPattern.decorator;

/**
 * ClassName:Mocha
 * Description:牛奶
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
