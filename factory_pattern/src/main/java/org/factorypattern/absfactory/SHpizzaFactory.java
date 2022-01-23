package org.factorypattern.absfactory;

import org.factorypattern.common.Pizza;
import org.factorypattern.common.SHCheesePizza;
import org.factorypattern.common.SHGreekPizza;

/**
 * @ClassName SHpizzaFactory
 * @Description 简单工厂
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
