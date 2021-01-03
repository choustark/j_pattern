package org.factorypattern.absfactory;

import org.factorypattern.normal.pizza.Pizza;
import org.factorypattern.normal.pizza.SHCheesePizza;
import org.factorypattern.normal.pizza.SHGreekPizza;

/**
 * @ClassName SHpizzaFactory
 * @Description TODO
 * @Author Axel
 * @Date 2021/1/3 21:41
 * @Version 1.0
 */

public class SHpizzaFactory implements AbsPizzaFactory {
    Pizza pizza = null;

    @Override
    public Pizza createPizza(String orderType) {
        if ("Cheese".equals(orderType)) {
            pizza = new SHCheesePizza();
            pizza.setName("上海奶酪披萨");
        } else if ("Greek".equals(orderType)) {
            pizza = new SHGreekPizza();
            pizza.setName("上海希腊披萨");
        }
        return pizza;
    }
}
