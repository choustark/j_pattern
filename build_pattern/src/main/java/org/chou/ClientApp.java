package org.chou;

import org.chou.pattern.House;
import org.chou.pattern.HouseDirector;
import org.chou.usual.AbstractHouse;
import org.chou.usual.CommonHouse;

/**
 * Hello world!
 * 需要建造各种各样的房子
 *
 */
public class ClientApp {
    public static void main( String[] args ) {
        // 优点 简单易懂
        // 缺点没有把产品（房子） 和 产品的创建过程封装到一起，耦合性强
        AbstractHouse house = new CommonHouse();
        house.builder();
        System.out.println( "Hello World!" );

        // 使用建造者模式
        org.chou.pattern.CommonHouse house1 = new org.chou.pattern.CommonHouse();
        HouseDirector director = new HouseDirector(house1);
        House house2 = director.constructHouse();

    }
}
