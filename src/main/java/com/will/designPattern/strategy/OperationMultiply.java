package com.will.designPattern.strategy;

/**
 * ClassName:OperationMultiply
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月19日
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
