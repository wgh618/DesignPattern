package com.will.headFirstDesignPattern.template;

/**
 * ClassName:Test
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class Test {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
