package org.factorypattern;

import org.factorypattern.absfactory.AbsPizzaFactory;
import org.factorypattern.absfactory.BJPizzaFactory;
import org.factorypattern.order.AbsOrderPizza;
import org.factorypattern.order.FOrderPizza;
import org.factorypattern.order.OrderPizza;
import org.factorypattern.simplefactory.PizzaSimpleFactory;

import java.util.Calendar;

/**
 * apps
 *
 */
public class PizzaApp {
    public static void main( String[] args ) {
        // 普通方式
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.orderPizza();
        // 简单工厂方式
        PizzaSimpleFactory simplePizzaFactory = new PizzaSimpleFactory();
        new FOrderPizza(simplePizzaFactory);

        // 使用抽象工厂方式
        AbsPizzaFactory absPizzaFactory = new BJPizzaFactory();
        new AbsOrderPizza(absPizzaFactory);

        Calendar instance = Calendar.getInstance();
    }
}
