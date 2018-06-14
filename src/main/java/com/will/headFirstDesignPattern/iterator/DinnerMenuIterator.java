package com.will.headFirstDesignPattern.iterator;

/**
 * ClassName:DinnerMenuIterator
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月06日
 */
public class DinnerMenuIterator<T> implements Iterator {
    private T[] menuItems;
    private int position;

    public DinnerMenuIterator(T[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public T next() {
        T T = menuItems[position ++];
        return T;
    }
}
