package org.factorypattern.functionfactory;

import org.factorypattern.common.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author Axel
 * @Date 2021/1/3 16:14
 * @Version 1.0
 */

public abstract class FunOrderPizza {

    /**
     * 创建pizza抽象类
     * @param orderType pizza类型
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    public FunOrderPizza(){
        Pizza pizza = null;
        do {
            pizza = createPizza(getType()); // 具体由子类实现
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    /**
     * 由控制台输入pizza 类型
     * @return 类型
     */
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
