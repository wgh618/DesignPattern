package com.will.headFirstDesignPattern.template;

/**
 * ClassName:CaffeineBeverage
 * Description:咖啡因抽象类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {
        System.out.println("把水煮沸");
    }

    private void pourInCup() {
        System.out.println("把咖啡倒入杯子");
    }
}
