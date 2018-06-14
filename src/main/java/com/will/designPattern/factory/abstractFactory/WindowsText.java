package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:WindowsText
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public class WindowsText implements Text {
    @Override
    public void getWholeText() {
        System.out.println("WindowsText---getWholeText");
    }
}
