package com.will.headFirstDesignPattern.observer.self;

/**
 * ClassName:Subject
 * Description:主题接口，对象使用此接口注册为观察者，或者把自己从观察者中删除
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月16日
 */
public interface Subject {
    /**
     * 注册为观察者
     *
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 从观察者中删除
     * * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
