package com.will.designPattern.factory.abstractFactory;

/**
 * ClassName:LinuxButton
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月29日
 */
public class LinuxButton implements Button {
    @Override
    public void processEvent() {
        System.out.println("LinuxButton---processEvent");
    }
}
