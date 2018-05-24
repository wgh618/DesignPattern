package com.will.headFirstDesignPattern.decorator;

/**
 * ClassName:Beverage
 * Description:饮料抽象基类
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 计算价格
     *
     * @return
     */
    public abstract double cost();
}
