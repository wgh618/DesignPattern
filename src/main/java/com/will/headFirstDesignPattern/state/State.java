package com.will.headFirstDesignPattern.state;

/**
 * ClassName:State
 * Description:所有状态的接口
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月13日
 */
public interface State {
    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 转动手柄
     */
    void turnCrank();

    /**
     *
     */
    void dispense();
}
