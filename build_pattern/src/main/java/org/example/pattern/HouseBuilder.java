package org.example.pattern;

/**
 * @ClassName HouseBuilder
 * @Description Builder(抽象建造者)
 * @Author Axel
 * @Date 2021/3/21 10:59
 * @Version 1.0
 */

public abstract class HouseBuilder {
    House house = new House();

    abstract void builderBasic();
    abstract void builderWall();
    abstract void builderRoofed();
    public House builder(){
        return  house;
    }

}
