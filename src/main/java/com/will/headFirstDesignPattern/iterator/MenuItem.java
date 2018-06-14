package com.will.headFirstDesignPattern.iterator;

/**
 * ClassName:MenuItem
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月05日
 */
public class MenuItem {
    private String name;
    private String description;
    private Boolean vegetarian;
    private Double prise;

    public MenuItem(String name, String description, Boolean vegetarian, Double prise) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }
}
