package com.zhou.factory.abs;

import com.zhou.bean.abs.Dessert;
import com.zhou.bean.abs.Dish;
import com.zhou.bean.abs.DongbozhouziDish;
import com.zhou.bean.abs.MiHuatangDessert;

/**
 * @author Axel
 * @version 1.0
 * @className SichuanFoodFactory
 * @description 四川风味的饭店
 * @date 2022/9/18 22:29
 */

public class SichuanFoodFactory implements FoodFactory {
    @Override
    public Dish createDish() {
        DongbozhouziDish dongbozhouziDish = new DongbozhouziDish();
        dongbozhouziDish.setName("东波肘子");
        return dongbozhouziDish;
    }

    @Override
    public Dessert createDessert() {
        MiHuatangDessert miHuatangDessert = new MiHuatangDessert();
        miHuatangDessert.setName("米花糖");
        return miHuatangDessert;
    }
}
