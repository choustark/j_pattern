package org.factorypattern.absfactory;

import org.factorypattern.common.Pizza;

/**
 * @ClassName AbsPizzaFactory
 * @Description 抽象工厂,对一些制作披萨的主要要素过程进行抽象
 * @Author Axel
 * @Date 2021/1/3 19:51
 * @Version 1.0
 */

public interface AbsPizzaFactory {

       Pizza createPizza(String orderType);
}
