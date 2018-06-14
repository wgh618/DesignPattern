package com.will.designPattern.factory.factoryMethod;

/**
 * ClassName:BroomFactory
 * Description:具体工厂
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月28日
 */
public class BroomFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Broom();
    }
}
