package com.will.headFirstDesignPattern.command;

/**
 * ClassName:RemoteControlTest
 * Description:测试
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor(new Light()));

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
