package com.will.headFirstDesignPattern.proxy.protectProxy;

/**
 * ClassName:PersonImpl
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public interface Person {

    String getName();

    void setName(String name);

    String getGender();

    void setGender(String gender);

    String getInterests();

    void setInterests(String interests);

    int getHotOrNotRating();

    void setHotOrNotRating(int rating);
}
