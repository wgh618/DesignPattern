package com.will.designPattern.strategy;

/**
 * ClassName:OperationSubstract
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月19日
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
