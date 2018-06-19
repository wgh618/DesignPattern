package com.will.designPattern.strategy;

/**
 * ClassName:StrategyPatternDemo
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月19日
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 x 5 = " + context.executeStrategy(10, 5));
    }
}
