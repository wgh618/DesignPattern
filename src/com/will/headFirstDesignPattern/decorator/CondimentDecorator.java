package com.will.headFirstDesignPattern.decorator;

/**
 * ClassName:CondimentDecorator
 * Description:调料类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
