package org.example;

/**
 * @author Axel
 * @version 1.0
 * @className Seller
 * @description TODO
 * @date 2022/9/21 23:01
 */

public class Seller {

    private String name = null;

    public Seller(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class DoSellCalculator implements DoJob {
        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "求助小红算账:" + a + " + " + b + " = " + result + "元");
        }

        @Override
        public String fillBlank2(int a, int b) {
            return null;
        }
    }

    public void callHelp(int a, int b) {
        new SuperCalculator01().add(a, b, new DoSellCalculator());
    }
}
