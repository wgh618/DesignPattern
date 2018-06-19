package com.will.designPattern.decorator;

/**
 * ClassName:Circle
 * Description:
 *
 * @author Will Wu
 * @email willWu618@gmail.com
 * @date 2018年06月19日
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
