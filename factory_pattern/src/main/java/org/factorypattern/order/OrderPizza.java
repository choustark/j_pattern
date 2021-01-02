package org.factorypattern.order;

import org.factorypattern.normal.pizza.CheesePizza;
import org.factorypattern.normal.pizza.GreekPizza;
import org.factorypattern.normal.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description: 订购披萨类 <br/>
 * Author:      Axel <br/>
 * Date:        2020-12-27 22:32 <br/>
 * Version:     V1.0.0 <br/>
 * Update:     <br>
 *  当我们多家订购披萨的类时，此时我们需要都需要依赖pizza 类，并且如果我们新增了一种披萨的口味则我们需要改动很多的订购类中的方法。耦合度很高
 */

public class OrderPizza {

    Pizza pizza = null;
    String pizzaType = null;
    public void orderPizza(){
        do {
            pizzaType = getType();
            if("Cheese".equals(pizzaType)){
                pizza = new CheesePizza();
                pizza.setName("芝士");
            }else if("Greek".equals(pizzaType)){
                pizza = new GreekPizza();
                pizza.setName("希腊");
            }else {
                System.out.println("没有匹配的披萨");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
