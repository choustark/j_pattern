package com.zhou.factory.function;

import com.zhou.bean.common.Food;
import com.zhou.bean.common.SichuanFood;

/**
 * @author Axel
 * @version 1.0
 * @className SichuanFoodFactory
 * @description TODO
 * @date 2022/9/18 11:27
 */

public class SichuanFoodFactory extends AbstractFoodFactory{
    @Override
    public Food createFood() {
        SichuanFood food = new SichuanFood();
        food.setName("四川菜");
        return food;
    }
}
