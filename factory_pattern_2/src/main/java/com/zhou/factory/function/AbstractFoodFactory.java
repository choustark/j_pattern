package com.zhou.factory.function;

import com.zhou.bean.common.Food;

/**
 * @author Axel
 * @version 1.0
 * @className AbstractFoodFactory
 * @description 将原有的简单工厂进行抽象，方便后期扩展
 * @date 2022/9/18 10:46
 */

public abstract class AbstractFoodFactory {

    /**
     * 提供一个抽象的创建菜肴方法
     * @return
     */
    public abstract Food createFood();

}
