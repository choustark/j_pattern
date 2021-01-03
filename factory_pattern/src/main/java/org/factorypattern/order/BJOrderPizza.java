package org.factorypattern.order;

import org.factorypattern.functionfactory.FunOrderPizza;
import org.factorypattern.normal.pizza.*;

/**
 * @ClassName BJOrderPizza
 * @Description TODO
 * @Author Axel
 * @Date 2021/1/3 16:41
 * @Version 1.0
 */

public class BJOrderPizza extends FunOrderPizza {
    Pizza pizza = null;
    @Override
    public Pizza createPizza(String orderType) {
        if("Cheese".equals(orderType)){
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        }else if("Greek".equals(orderType)){
            pizza = new BJGreekPizza();
            pizza.setName("北京芝士披萨");
        }else {
            System.out.println("-----");
        }
        return pizza;
    }
}
