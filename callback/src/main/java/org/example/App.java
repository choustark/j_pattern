package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //m1();
        //m2();
        m3();
    }

    private static void m3() {
        int a = 26549;
        int b = 16487;
        SuperCalculator01 calculator01 = new SuperCalculator01();
        Student02 s = new Student02(calculator01,"小明");
        s.callHelp(a, b);
    }

    private static void m2() {
        int a = 168;
        int b = 291;
        Student s = new Student("小明");
        s.fillBlank(a, b);
    }

    private static void m1() {
        int a = 1;
        int b = 1;
        Student s = new Student("小明");
        s.fillBlank(a, b);
    }
}
