package com.will.headFirstDesignPattern.command;

/**
 * ClassName:StereoOnWithCDCommand
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("叶惠美");
        stereo.setVolume(11);
    }
}
