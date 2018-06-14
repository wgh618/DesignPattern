package com.will.designPattern.builder.demo2;

/**
 * ClassName:VegBurger
 * Description:蔬菜汉堡  扩展了Burger的实体类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public class VegBurger extends Burger {
    public float price() {
        return 10f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
