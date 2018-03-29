package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:WindowsButton
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public class WindowsButton implements Button {
    @Override
    public void processEvent() {
        System.out.println("WindowsButton---processEvent");
    }
}
