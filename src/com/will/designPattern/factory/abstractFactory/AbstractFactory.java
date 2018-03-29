package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:AbstractFactory
 * Description:抽象工厂
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public abstract class AbstractFactory {
    public abstract Button createButton();
    public abstract Text createText();
}
