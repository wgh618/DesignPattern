package com.will.designPattern.builder.demo1;

/**
 * ClassName:Builder
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public interface Builder {
    void buildCPU();
    void buildMainBoard();
    void buildHD();
    Computer getComputer();
}
