package com.zhou.factory.abs;

import com.zhou.bean.abs.Dessert;
import com.zhou.bean.abs.Dish;
import com.zhou.bean.abs.LaohuoLiangtangDish;
import com.zhou.bean.abs.ShuangpinaiDessert;

/**
 * @author Axel
 * @version 1.0
 * @className GuangdongFoodFactory
 * @description 广东风味的饭店
 * @date 2022/9/18 22:28
 */

public class GuangdongFoodFactory implements FoodFactory {
    @Override
    public Dish createDish() {
        LaohuoLiangtangDish liangtangDish = new LaohuoLiangtangDish();
        liangtangDish.setName("老火靓汤");
        return liangtangDish;
    }

    @Override
    public Dessert createDessert() {
        ShuangpinaiDessert shuangpinaiDessert = new ShuangpinaiDessert();
        shuangpinaiDessert.setName("双皮奶");
        return shuangpinaiDessert;
    }
}
