package org.chou.pattern;

/**
 * @ClassName HouseDirector
 * @Description 指挥者
 * @Author Axel
 * @Date 2021/3/21 11:20
 * @Version 1.0
 */

public class HouseDirector {
    HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseDirector() {
    }

    public void setHouseBuilder(HouseBuilder builder){
        this.houseBuilder =builder;
    }

    public  House constructHouse(){
        houseBuilder.builderWall();
        houseBuilder.builderBasic();
        houseBuilder.builderRoofed();
        return houseBuilder.builder();
    }
}
