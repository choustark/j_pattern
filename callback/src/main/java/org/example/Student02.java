package org.example;

/**
 * @author Axel
 * @version 1.0
 * @className Student02
 * @description TODO
 * @date 2022/9/21 23:00
 */

public class Student02 {
    private String name = null;

    public Student02(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class DoHomeWork implements DoJob {
        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
        }
    }
    public void callHelp (int a, int b)  {
        new SuperCalculator01().add(a, b, new DoHomeWork());
    }
}
