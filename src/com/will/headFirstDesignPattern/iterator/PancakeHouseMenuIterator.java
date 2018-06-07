package com.will.headFirstDesignPattern.iterator;

import java.util.List;

/**
 * ClassName:DinnerMenuIterator
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月06日
 */
public class PancakeHouseMenuIterator<T> implements Iterator {
    private List<T> menuItems;
    private int position;

    public PancakeHouseMenuIterator(List<T> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position != menuItems.size();
    }

    @Override
    public T next() {
        return menuItems.get(position ++);
    }
}
