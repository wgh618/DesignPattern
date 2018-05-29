package com.will.headFirstDesignPattern.command;

/**
 * ClassName:GarageDoorOpenCommand
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
