package com.will.designPattern.builder.demo2;

/**
 * ClassName:ChickenBurger
 * Description:鸡肉汉堡  扩展了Burger的实体类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public class ChickenBurger extends Burger {
    public float price() {
        return 20f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
