package com.will.headFirstDesignPattern.proxy.protectProxy;

/**
 * ClassName:Test
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月14日
 */
public class Test {

    public static void main(String[] args) {
        Person joe = getPersonFromDatabase("Joe");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set from owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private static PersonImpl getPersonFromDatabase(String name) {
        PersonImpl person = new PersonImpl();
        person.setName(name);
        return person;
    }

    private static Person getOwnerProxy(Person person) {
        OwnerInvocationHandler ownerInvocationHandler = new OwnerInvocationHandler();
        return ownerInvocationHandler.createProxyInstance(person);
    }

    private static Person getNonOwnerProxy(Person person) {
        return (Person) new NonOwnerInvocationHandler().createProxyInstance(person);
    }
}
