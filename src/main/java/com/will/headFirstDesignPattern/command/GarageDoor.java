package com.will.headFirstDesignPattern.command;

/**
 * ClassName:GarageDoor
 * Description:车库门
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class GarageDoor {
    private Light light;

    public GarageDoor(Light light) {
        this.light = light;
    }

    public void up() {
        System.out.println("车库门拉上去了");
    }

    public void down() {
        System.out.println("车库门拉下去了");
    }

    public void stop() {
        System.out.println("车库门停止了");
    }

    public void lightOn() {
        light.on();
    }

    public void lightOff() {
        light.off();
    }
}
