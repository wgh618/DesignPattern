package com.will.designPattern.strategy;

/**
 * ClassName:Context
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月19日
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
