package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:AbstractFactoryDemo
 * Description:测试
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory linuxFactory = new LinuxFactory();
        linuxFactory.createButton().processEvent();
        linuxFactory.createText().getWholeText();
        AbstractFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().processEvent();
        windowsFactory.createText().getWholeText();
    }
}
