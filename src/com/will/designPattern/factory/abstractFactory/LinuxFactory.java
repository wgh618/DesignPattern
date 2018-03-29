package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:LinuxFactory
 * Description:具体工厂1
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public  class LinuxFactory extends AbstractFactory {
    public Button createButton() {
        return new LinuxButton();
    }
    public Text createText() {
        return new LinuxText();
    }
}
