package com.will.designPattern.factory.simpleFactory;

/**
 * ClassName:SimpleFactoryDemo
 * Description:测试类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月27日
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory.getShape(Circle.class).draw();
        ShapeFactory.getShape(Rectangle.class).draw();
        ShapeFactory.getShape(Square.class).draw();
    }
}
