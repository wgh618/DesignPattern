package com.will.designPattern.builder.demo2;

/**
 * ClassName:CocoCola
 * Description:可口可乐  实现 Item 接口的抽象类，该类提供了默认的功能
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public class CocoCola extends ColdDrink {

    public float price() {
        return 3.5f;
    }

    @Override
    public String name() {
        return "Coco Cola";
    }
}
