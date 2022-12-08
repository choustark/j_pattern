package org.example;

public class Student {
    private String name = null;

    public Student(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int calcADD(int a, int b) {
        return a + b;
    }

    public void fillBlank(int a, int b) {
        // 1
        //int result = calcADD(a, b);
        // 2
        int result = useCalculator(a, b);
        System.out.println(name + "心算:" + a + " + " + b + " = " + result);
    }

    private int useCalculator(int a, int b) {
        return new Calculator().add(a, b);
    }
}
