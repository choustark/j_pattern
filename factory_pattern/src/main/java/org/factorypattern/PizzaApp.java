package org.factorypattern;

import org.factorypattern.absfactory.AbsPizzaFactory;
import org.factorypattern.absfactory.BJPizzaFactory;
import org.factorypattern.absfactory.AbsOrderPizza;
import org.factorypattern.simplefactory.FOrderPizza;
import org.factorypattern.simplefactory.OrderPizza;
import org.factorypattern.simplefactory.PizzaSimpleFactory;

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
        FOrderPizza fOrderPizza = new FOrderPizza(simplePizzaFactory);


        // 使用抽象工厂方式
        AbsPizzaFactory absPizzaFactory = new BJPizzaFactory();
        new AbsOrderPizza(absPizzaFactory);

    }
}
