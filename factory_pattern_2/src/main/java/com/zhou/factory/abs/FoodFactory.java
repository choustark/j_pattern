package com.zhou.factory.abs;

import com.zhou.bean.abs.Dessert;
import com.zhou.bean.abs.Dish;

/**
 * @author Axel
 * @version 1.0
 * @className FoodFactory
 * @description 食物工厂，定义
 * @date 2022/9/18 22:27
 */

public interface FoodFactory {

    Dish createDish();

    Dessert createDessert();
}
