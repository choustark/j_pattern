package org.factorypattern.simplefactory;

import org.factorypattern.common.CheesePizza;
import org.factorypattern.common.ChinaPizza;
import org.factorypattern.common.GreekPizza;
import org.factorypattern.common.Pizza;

/**
 * Description: 简单工厂类，
 * Author:      Axel
 * Date:        2020-12-27 23:42
 * Version:     V1.0.0<br>
 * Update:     <br>
 * 使用简单工厂模式，将创建、实例化pizza的工作，写到另一个类中（工厂），如果有新增其他类型的pizza口味我们可以在该类中修改即可。
 * 不同的订购类可以通过该类进行获取pizza,对外开放扩展，对内关闭修改。
 */

public class PizzaSimpleFactory {
    Pizza pizza = null;
    public Pizza createPizza(String pizzaType){
        if("Cheese".equals(pizzaType)){
            pizza = new CheesePizza();
            pizza.setName("奶酪");
        }else if("Greek".equals(pizzaType)){
            pizza = new GreekPizza();
            pizza.setName("希腊");
        }else if("China".equals(pizzaType)){
            pizza = new ChinaPizza();
            pizza.setName("中国");
        }else {
            System.out.println("输入错误....");
        }
        return pizza;
    }
}
