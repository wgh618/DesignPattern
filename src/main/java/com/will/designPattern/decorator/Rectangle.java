package com.will.designPattern.decorator;

/**
 * ClassName:Rectangle
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月19日
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}