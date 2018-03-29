package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:LinuxText
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public class LinuxText implements Text {
    @Override
    public void getWholeText() {
        System.out.println("LinuxText---getWholeText");
    }
}
