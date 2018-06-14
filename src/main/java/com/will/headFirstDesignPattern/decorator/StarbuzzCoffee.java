package com.will.headFirstDesignPattern.decorator;

/**
 * ClassName:StarbuzzCoffee
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ":$" + beverage.cost());

        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + ":$" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + ":$" + beverage1.cost());
    }
}
