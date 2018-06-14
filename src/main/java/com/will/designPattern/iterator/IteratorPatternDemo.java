package com.will.designPattern.iterator;

/**
 * ClassName:IteratorPatternDemo
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository<String> namesRepository = new NameRepository<>();
        namesRepository.add("A");
        namesRepository.add("B");
        namesRepository.add("C");
        namesRepository.add("D");
        Iterator<String> iterator = namesRepository.getIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
