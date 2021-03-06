package com.will.headFirstDesignPattern.iterator;

/**
 * ClassName:DinnerMenu
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class DinnerMenu {
    private final int Max_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[Max_ITEMS];
        addItem("Vegetarian BLT","",true,2.99);
        addItem("BLT","",false,2.99);
        addItem("Soup of the day","",false,3.29);
        addItem("hot dog","",false,3.05);
    }

    private void addItem(String name, String description, Boolean vegetarian, Double prise) {
        if (numberOfItems >= Max_ITEMS) {
            System.out.println("Sorry,menu is full! can't add item to menu");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, prise);
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }

    }

    public Iterator createIterator() {
        return new DinnerMenuIterator<>(menuItems);
    }
}
