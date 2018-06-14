package com.will.headFirstDesignPattern.facade;

/**
 * ClassName:DvdPlayer
 * Description:DVD播放器
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月04日
 */
public class DvdPlayer {

    /**
     * 打开
     */
    public void on() {
        System.out.println("打开DVD");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("关闭DVD");
    }

    /**
     * 播放
     */
    public void play(String movie) {
        System.out.println("开始播放：" + movie);
    }

    /**
     * 暂停
     */
    public void pause() {
        System.out.println("暂停");
    }
}
