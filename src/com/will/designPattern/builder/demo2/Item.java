package com.will.designPattern.builder.demo2;

import com.will.designPattern.builder.demo1.Computer;

/**
 * ClassName:Item
 * Description:表示食物条目和食物包装的接口
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年03月30日
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
