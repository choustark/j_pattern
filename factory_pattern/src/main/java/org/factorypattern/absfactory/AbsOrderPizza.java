package org.factorypattern.absfactory;

import org.factorypattern.common.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName AbsOrderPizza
 * @Description  制作披萨的方式，可以有多种可以在进行抽象。需要要抽象工厂，
 * 不同产品族会有不同生产方式需要用到不同的工厂
 * @Author Axel
 * @Date 2021/1/3 21:47
 * @Version 1.0
 */

public class AbsOrderPizza {

    private AbsPizzaFactory absPizzaFactory;

    public AbsOrderPizza(AbsPizzaFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsPizzaFactory factory) {
        this.absPizzaFactory = factory;
        do {
            Pizza pizza = factory.createPizza(getType());
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("披萨制作失败...");
                break;
            }
        }while (true);
    }

    /**
     * 控制台输入pizza类型
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
