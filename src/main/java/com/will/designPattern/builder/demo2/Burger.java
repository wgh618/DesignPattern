package com.will.designPattern.builder.demo2;

/**
 * ClassName:Burger
 * Description:汉堡  实现 Item 接口的抽象类，该类提供了默认的功能
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
