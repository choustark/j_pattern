package org.factorypattern;

import org.factorypattern.order.FOrderPizza;
import org.factorypattern.order.OrderPizza;
import org.factorypattern.simplefactory.PizzaSimpleFactory;

/**
 * apps
 *
 */
public class PizzaApp {
    public static void main( String[] args ) {
        // 普通方式
        //OrderPizza orderPizza = new OrderPizza();
        //orderPizza.orderPizza();
        // 简单工厂方式
        PizzaSimpleFactory simplePizzaFactory = new PizzaSimpleFactory();
        new FOrderPizza(simplePizzaFactory);

    }
}
