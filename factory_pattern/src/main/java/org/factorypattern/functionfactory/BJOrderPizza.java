package org.factorypattern.functionfactory;

import org.factorypattern.common.BJCheesePizza;
import org.factorypattern.common.BJGreekPizza;
import org.factorypattern.common.Pizza;

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
