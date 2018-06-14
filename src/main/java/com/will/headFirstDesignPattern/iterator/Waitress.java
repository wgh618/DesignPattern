package com.will.headFirstDesignPattern.iterator;

/**
 * ClassName:Waitress
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月07日
 */
public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public Waitress() {
        this.pancakeHouseMenu = new PancakeHouseMenu();
        this.dinnerMenu = new DinnerMenu();
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("菜单\n----\n早餐");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n午餐");
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrise() + "--");
            System.out.println(menuItem.getDescription());
        }

    }
}
