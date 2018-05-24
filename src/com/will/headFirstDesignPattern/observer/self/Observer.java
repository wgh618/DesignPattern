package com.will.headFirstDesignPattern.observer.self;

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
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
