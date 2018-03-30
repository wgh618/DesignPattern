package com.will.designPattern.builder.demo2;

/**
 * ClassName:Wrapper
 * Description:食物包装接口的实现类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper（包装袋）包装";
    }
}
