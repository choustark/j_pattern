package org.factorypattern.order;

import org.factorypattern.functionfactory.FunOrderPizza;
import org.factorypattern.normal.pizza.*;

/**
 * @ClassName SHOrderPizaa
 * @Description TODO
 * @Author Axel
 * @Date 2021/1/3 16:42
 * @Version 1.0
 */

public class SHOrderPizza extends FunOrderPizza {
    Pizza pizza = null;
    @Override
    public Pizza createPizza(String orderType) {
        if("Cheese".equals(orderType)){
            pizza = new SHCheesePizza();
            pizza.setName("上海奶酪披萨");
        }else if("Greek".equals(orderType)){
            pizza = new SHGreekPizza();
            pizza.setName("上海芝士披萨");
        }else {
            System.out.println("-----");
        }
        return pizza;
    }
}
