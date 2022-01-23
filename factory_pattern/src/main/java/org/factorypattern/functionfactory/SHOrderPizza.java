package org.factorypattern.functionfactory;

import org.factorypattern.common.Pizza;
import org.factorypattern.common.SHCheesePizza;
import org.factorypattern.common.SHGreekPizza;

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
