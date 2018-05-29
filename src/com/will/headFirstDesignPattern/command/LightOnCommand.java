package com.will.headFirstDesignPattern.command;

/**
 * ClassName:LightOnCommand
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
