package com.will.headFirstDesignPattern.iterator;

import java.util.List;

/**
 * ClassName:PancakeHouseMenu
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        addItem("K&B's Pancake Breakfast","",true,2.99);
        addItem("Regular Pancake Breakfast","",false,2.99);
        addItem("Blueberry Pancakes","",true,3.49);
        addItem("waffles","",true,3.59);
    }

    private void addItem(String name, String description, Boolean vegetarian, Double prise) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, prise);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
