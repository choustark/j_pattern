package org.example;

/**
 * @author Axel
 * @version 1.0
 * @className Student02
 * @description TODO
 * @date 2022/9/21 23:00
 */

public class Student02 {

    private SuperCalculator01 calculateAbility;

    private String name = null;

    public Student02() {
    }

    public Student02(SuperCalculator01 calculateAbility, String name) {
        this.calculateAbility = calculateAbility;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperCalculator01 getCalculateAbility() {
        return calculateAbility;
    }

    public void setCalculateAbility(SuperCalculator01 calculateAbility) {
        this.calculateAbility = calculateAbility;
    }

    public String getName() {
        return name;
    }

    public class DoHomeWork implements DoJob {
        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
        }

        @Override
        public String fillBlank2(int a, int b) {
            return null;
        }
    }
    public void callHelp (int a, int b)  {
        calculateAbility.add(a, b, new DoHomeWork());
    }
}
