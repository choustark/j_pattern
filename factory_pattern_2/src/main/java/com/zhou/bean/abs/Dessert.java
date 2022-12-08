package com.zhou.bean.abs;

/**
 * @author Axel
 * @version 1.0
 * @className Dessert
 * @description 甜点类
 * @date 2022/9/18 22:17
 */

public class Dessert {
    private String name;

    public Dessert(){}

    public Dessert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mix(){
        System.out.println("开始制作"+name+"混合原材料...");
    }

    public void show(){
        System.out.println(name+"制作完成，展示甜点...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dessert dessert = (Dessert) o;

        return name != null ? name.equals(dessert.name) : dessert.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                '}';
    }
}
