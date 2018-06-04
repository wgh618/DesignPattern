package com.will.headFirstDesignPattern.facade;

/**
 * ClassName:TheaterLights
 * Description:灯
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月04日
 */
public class TheaterLights {
    /**
     * 打开
     */
    public void on() {
        System.out.println("打开灯");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("关闭灯");
    }

    /**
     * 调节亮度
     */
    public void dim(int dim) {
        System.out.println("调节灯亮度为" + dim + "%");

    }
}
