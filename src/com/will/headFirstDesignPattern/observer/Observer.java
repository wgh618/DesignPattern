package com.will.headFirstDesignPattern.observer;

/**
 * ClassName:Observer
 * Description:观察者接口
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月16日
 */
public interface Observer {
    /**
     * 当主题状态改变时它被调用
     */
    void update();
}
