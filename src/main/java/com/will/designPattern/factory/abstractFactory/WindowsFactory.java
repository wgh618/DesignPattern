package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:WindowsFactory
 * Description:具体工厂2
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public  class WindowsFactory extends AbstractFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Text createText() {
        return new WindowsText();
    }
}
