package org.factorypattern.order;

import org.factorypattern.normal.pizza.Pizza;
import org.factorypattern.simplefactory.PizzaSimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName FOrderPizza
 * @Description TODO
 * @Author Axel
 * @Date 2021/1/2 18:35
 * @Version 1.0
 */

public class FOrderPizza {

    public  PizzaSimpleFactory pizzaSimpleFactory;


    public FOrderPizza(PizzaSimpleFactory pizzaSimpleFactory) {
        setFactory(pizzaSimpleFactory);
    }

    private void setFactory(PizzaSimpleFactory pizzaSimpleFactory) {
        this.pizzaSimpleFactory = pizzaSimpleFactory;
        do {
           Pizza pizza =  this.pizzaSimpleFactory.createPizza(getType());
            if(null != pizza){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else {
                System.out.println("披萨订购失败...");
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
