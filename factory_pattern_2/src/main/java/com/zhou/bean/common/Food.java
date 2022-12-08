package com.zhou.bean.common;

/**
 * @author Axel
 * @version 1.0
 * @className Food
 * @description 食物，菜肴基类
 * @date 2022/9/12 19:13
 */

public class Food {

    Food() {
    }

    Food(String name) {
        this.name = name;
    }

    private String name;


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

        Food food = (Food) o;

        return name != null ? name.equals(food.name) : food.name == null;
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
