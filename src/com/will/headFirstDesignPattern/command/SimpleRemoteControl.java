package com.will.headFirstDesignPattern.command;

/**
 * ClassName:SimpleRemoteControl
 * Description:遥控器
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class SimpleRemoteControl {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        this.command.execute();
    }
}
