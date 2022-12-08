package com.zhou.factory.function;

import com.zhou.bean.common.Food;
import com.zhou.bean.common.GuangdongFood;

/**
 * @author Axel
 * @version 1.0
 * @className GuandongFoodFactory
 * @description TODO
 * @date 2022/9/18 11:25
 */

public class GuangdongFoodFactory extends AbstractFoodFactory {
    @Override
    public Food createFood() {
        GuangdongFood food = new GuangdongFood();
        food.setName("广东菜");
        return food;
    }
}
