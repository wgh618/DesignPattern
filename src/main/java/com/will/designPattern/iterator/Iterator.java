package com.will.designPattern.iterator;

/**
 * ClassName:Iterator
 * Description:迭代器
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public interface Iterator<T> {
    /**
     * 集合中是否还有更多的元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回集合的下一个元素
     *
     * @return
     */
    T next();
}
