package com.zhou.bean.abs;

import com.zhou.bean.common.Food;

/**
 * @author Axel
 * @version 1.0
 * @className Dish
 * @description 菜肴类
 * @date 2022/9/18 22:16
 */

public class Dish{

    private String name;

    Dish() {
    }

    Dish(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wash() {
        System.out.println("开始清洗" + name + "，准备烹饪...");
    }

    public void cook() {
        System.out.println("烹饪" + name + "...");
    }

    public void addFlavor() {
        System.out.println("往" + name + "加入调料...");
    }

    public void finish() {
        System.out.println("烹饪" + name + "完成，装盘上菜。");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        return name != null ? name.equals(dish.name) : dish.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
