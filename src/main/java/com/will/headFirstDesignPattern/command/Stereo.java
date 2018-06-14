package com.will.headFirstDesignPattern.command;

/**
 * ClassName:Stereo
 * Description:音响
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月29日
 */
public class Stereo {
    private String cd;
    private String dvd;
    private String radio;
    private int volume;
    public void on() {
        System.out.println("打开音响");
    }

    public void off() {
        System.out.println("关闭音响");
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
