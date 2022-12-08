package com.zhou.order;

import com.zhou.bean.common.Food;
import com.zhou.factory.function.AbstractFoodFactory;
import com.zhou.factory.function.GuangdongFoodFactory;
import com.zhou.factory.function.SichuanFoodFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Axel
 * @version 1.0
 * @className FunctionFoodOrder
 * @description 点餐类 （方法工厂方式）
 * @date 2022/9/18 11:29
 */

public class FunctionFoodOrder {

    private AbstractFoodFactory foodFactory;

    public FunctionFoodOrder(AbstractFoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }

    public FunctionFoodOrder() {
    }

    public AbstractFoodFactory getFoodFactory() {
        return foodFactory;
    }

    public void setFoodFactory(AbstractFoodFactory foodFactory) {
        this.foodFactory = foodFactory;
    }



    /**
     *
     * @return
     */
    public Food orderFood(){
        String type = getType();
        if(null == type){
            throw new RuntimeException("错误的类型");
        }
        if("Guangdong".equals(type)){
            this.foodFactory = new GuangdongFoodFactory();
            Food food = foodFactory.createFood();
            food.wash();
            food.cook();
            food.addFlavor();
            food.finish();
            return food;
        }else if("Sichuan".equals(type)){
            this.foodFactory = new SichuanFoodFactory();
            Food food = foodFactory.createFood();
            food.wash();
            food.cook();
            food.addFlavor();
            food.finish();
            return food;
        }else {
            throw new RuntimeException("无效的type");
        }
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
