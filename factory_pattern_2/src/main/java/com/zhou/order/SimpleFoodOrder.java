package com.zhou.order;

import com.zhou.bean.common.Food;
import com.zhou.factory.simple.FoodSimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Axel
 * @version 1.0
 * @className SimpleOrderFood
 * @description 点餐操作
 * @date 2022/9/17 21:29
 */

public class SimpleFoodOrder {

    // 工厂用于生产菜肴
    private FoodSimpleFactory factory;

    // 客户需要的菜系
    private String foodType;


    public SimpleFoodOrder() {
    }

    public SimpleFoodOrder(FoodSimpleFactory factory) {
        this.factory = factory;
    }

    public FoodSimpleFactory getFactory() {
        return factory;
    }

    public void setFactory(FoodSimpleFactory factory) {
        this.factory = factory;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Food orderFood() {
        factory = new FoodSimpleFactory();
        // 生产菜肴的方法
        Food food = factory.createFood(getType());
        // 不同的菜肴制作过程不一样调用改菜肴的制造方法
        food.wash();
        food.cook();
        food.addFlavor();
        food.finish();
        return food;
    }

    /**
     * 获取用户选择的菜系
     *
     * @return
     */
    public String getType() {
        String foodType = null;
        System.out.println("请输出你需要的菜肴口味：");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            foodType = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foodType;
    }
}
