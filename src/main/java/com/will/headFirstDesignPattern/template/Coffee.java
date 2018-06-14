package com.will.headFirstDesignPattern.template;

/**
 * ClassName:Tea
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
