package com.will.designPattern.factory.simpleFactory;

/**
 * ClassName:ShapeFactory
 * Description:图形工厂类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月27日
 */
public class ShapeFactory {

    public static Shape getShape(Class clz) {
        if (Circle.class.getName().equals(clz.getName())) {
            return new Circle();
        } else if (Rectangle.class.getName().equals(clz.getName())) {
            return new Rectangle();
        } else if (Square.class.getName().equals(clz.getName())) {
            return new Square();
        } else {
            return null;
        }
    }
}
