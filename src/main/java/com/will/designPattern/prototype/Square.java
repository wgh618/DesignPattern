package com.will.designPattern.prototype;

/**
 * ClassName:Square
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
