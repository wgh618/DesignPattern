package com.will.designPattern.factory.simpleFactory;

/**
 * ClassName:Square
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月27日
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
