package com.will.headFirstDesignPattern.facade;

/**
 * ClassName:PopcornPopper
 * Description:爆米花机
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月04日
 */
public class PopcornPopper {
    /**
     * 打开
     */
    public void on() {
        System.out.println("打开爆米花机");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("关闭爆米花机");
    }

    /**
     * 出爆米花
     */
    public void pop() {
        System.out.println("出爆米花");

    }
}
