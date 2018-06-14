package com.will.headFirstDesignPattern.command;

import java.security.PublicKey;
import java.util.Arrays;

/**
 * ClassName:RemoteControl
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonWasPushed(int index) {
        onCommands[index].execute();
    }

    public void offButtonWasPushed(int index) {
        offCommands[index].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("\n-------- 遥控器 ---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[index:")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("      ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuffer.toString();
    }
}
