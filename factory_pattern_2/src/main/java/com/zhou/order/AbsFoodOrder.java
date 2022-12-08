package com.zhou.order;

import com.zhou.bean.abs.Dessert;
import com.zhou.bean.abs.Dish;
import com.zhou.bean.common.Food;
import com.zhou.factory.abs.FoodFactory;
import com.zhou.factory.abs.GuangdongFoodFactory;
import com.zhou.factory.abs.SichuanFoodFactory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Axel
 * @version 1.0
 * @className AbsFoodOrder
 * @description TODO
 * @date 2022/9/18 22:20
 */

public class AbsFoodOrder {

    private FoodFactory foodFactory;

    public AbsFoodOrder() {}

    public AbsFoodOrder(FoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }

    public FoodFactory getFoodFactory() {
        return foodFactory;
    }

    public void setFoodFactory(FoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }


    public Dish orderDish(){
        String type = getType();
        if(null == type){
            throw new RuntimeException("错误的类型");
        }
        if("Guangdong".equals(type)){
            this.foodFactory = new GuangdongFoodFactory();
        }else if("Sichuan".equals(type)){
            this.foodFactory = new SichuanFoodFactory();
        }else {
            throw new RuntimeException("无效的type");
        }
        Dish dish = foodFactory.createDish();
        dish.wash();
        dish.cook();
        dish.addFlavor();
        dish.finish();
        return dish;

    }

    public Dessert orderDessert(){
        String type = getType();
        if(null == type){
            throw new RuntimeException("错误的类型");
        }
        if("Guangdong".equals(type)){
            this.foodFactory = new GuangdongFoodFactory();
        }else if("Sichuan".equals(type)){
            this.foodFactory = new SichuanFoodFactory();
        }else {
            throw new RuntimeException("无效的type");
        }
        Dessert dessert = foodFactory.createDessert();
        dessert.mix();
        dessert.mix();
        return dessert;
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
