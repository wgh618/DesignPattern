package com.will.headFirstDesignPattern.state;

/**
 * ClassName:GumballMachineTestDrive
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月08日
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
//        GumballMachine gumballMachine = new GumballMachine(5);
        GumballMachine2 gumballMachine = new GumballMachine2(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();// 转动手柄
        System.out.println(gumballMachine);

        /*gumballMachine.insertQuarter();// 投币
        gumballMachine.ejectQuarter();// 退币
        gumballMachine.turnCrank();// 转动手柄
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();// 转动手柄
        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();// 转动手柄
        gumballMachine.ejectQuarter();// 退币
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();// 投币
        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();// 转动手柄
        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();// 转动手柄
        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();// 转动手柄
        System.out.println(gumballMachine);*/
        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();// 投币
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);


    }
}
