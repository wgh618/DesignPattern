package com.will.designPattern.builder.demo1;

/**
 * ClassName:ConcreteBuilder
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public class ConcreteBuilder implements Builder {
    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.Add("安装Intel i7 8700K CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.Add("安装华硕主板");
    }

    @Override
    public void buildHD() {
        computer.Add("安装固态硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
