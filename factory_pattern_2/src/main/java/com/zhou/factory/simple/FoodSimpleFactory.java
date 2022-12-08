package com.zhou.factory.simple;

import com.zhou.bean.common.Food;
import com.zhou.bean.common.GuangdongFood;
import com.zhou.bean.common.SichuanFood;

/**
 * @author Axel
 * @version 1.0
 * @className FoodSimpleFactory
 * @description 一个简单的创建菜
 * @date 2022/9/12 19:07
 */

public class FoodSimpleFactory {

    private Food food;

    public FoodSimpleFactory() {
    }

    public FoodSimpleFactory(Food food) {
        this.food = food;
    }

    public Food createFood(String type) {
        if (null == type) {
            throw new RuntimeException("需要的食物类型不能为null");
        }
        if (type.equals("Guangdong")) {
            food = new GuangdongFood();
            food.setName("广东菜");
        } else if (type.equals("Sichuan")) {
            food = new SichuanFood();
            food.setName("四川菜");
        } else {
            throw new RuntimeException("还没有这种菜系.....");
        }
        return food;
    }
}
