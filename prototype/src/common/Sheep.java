package common;

/**
 * @ClassName Sheep
 * @Description  原型模式
 * @Author Axel
 * @Date 2021/3/7 22:20
 * @Version 1.0
 */

public class Sheep implements Cloneable{
    private Integer age;
    private String name;
    private String color;


    public Sheep() {
    }

    public Sheep(Integer age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

}
