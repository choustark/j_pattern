package org.factorypattern;

import org.factorypattern.order.OrderPizza;

/**
 * apps
 *
 */
public class PizzaApp {
    public static void main( String[] args ) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.orderPizza();
    }
}
