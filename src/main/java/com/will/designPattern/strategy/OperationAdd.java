package com.will.designPattern.strategy;

/**
 * ClassName:OperationAdd
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月19日
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
