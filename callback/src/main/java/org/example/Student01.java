package org.example;

/**
 * @author Axel
 * @version 1.0
 * @className Student01
 * @description TODO
 * @date 2022/9/21 22:49
 */

public class Student01 {
    private String name = null;

    public Student01(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callHelp(int a, int b) {
        new SuperCalculator().add(a, b, this);
    }

    public void fillBlank(int a, int b, int result) {
        System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
    }
}
