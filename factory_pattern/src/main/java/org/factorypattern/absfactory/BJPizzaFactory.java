package org.factorypattern.absfactory;

import org.factorypattern.common.Pizza;
import org.factorypattern.common.SHCheesePizza;
import org.factorypattern.common.SHGreekPizza;

/**
 * @ClassName BJPizzaFactory
 * @Description 方法工厂
 * @Author Axel
 * @Date 2021/1/3 21:41
 * @Version 1.0
 */

public class BJPizzaFactory implements AbsPizzaFactory {
    Pizza pizza = null;

    @Override
    public Pizza createPizza(String orderType) {
        if ("Cheese".equals(orderType)) {
            pizza = new SHCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if ("Greek".equals(orderType)) {
            pizza = new SHGreekPizza();
            pizza.setName("北京希腊披萨");
        }
        return pizza;
    }
}
