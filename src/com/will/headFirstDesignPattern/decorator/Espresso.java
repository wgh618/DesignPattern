package com.will.headFirstDesignPattern.decorator;

/**
 * ClassName:Espresso
 * Description:浓缩咖啡
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
