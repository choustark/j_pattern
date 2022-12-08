package org.example;

/**
 * @author Axel
 * @version 1.0
 * @className SuperCalculator01
 * @description TODO
 * @date 2022/9/21 22:59
 */

public class SuperCalculator01 {
    public void add(int a, int b, DoJob customer) {
        int result = a + b;
        customer.fillBlank(a, b, result);
    }
}
