package com.will.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:NameRepository
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class NameRepository<T> implements Container {
    private List<T> names = new ArrayList<>();

    @Override
    public Iterator<T> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<T> {
        private int index;
        @Override
        public boolean hasNext() {
            return index != names.size();
        }

        @Override
        public T next() {
            if(this.hasNext()){
                return names.get(index++);
            }
            return null;
        }
    }

    public boolean add(T t) {
        return names.add(t);
    }
}
