package com.will.designPattern.builder.demo1;

/**
 * ClassName:BuilderDemo
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.constract(builder);
        Computer computer = builder.getComputer();
        computer.Show();
    }
}
