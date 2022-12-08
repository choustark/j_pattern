package com.zhou;

import com.zhou.bean.common.Food;
import com.zhou.order.FunctionFoodOrder;
import com.zhou.order.SimpleFoodOrder;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        simple();
        //function();
    }

    private static void function() {
        FunctionFoodOrder foodOrder = new FunctionFoodOrder();
        Food food = foodOrder.orderFood();
        System.out.println(food);
    }

    private static void simple() {
        SimpleFoodOrder order = new SimpleFoodOrder();
        Food food = order.orderFood();
    }
}
