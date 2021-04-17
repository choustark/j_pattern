package org.chou.pattern;

/**
 * @ClassName CommonHouse
 * @Description TODO
 * @Author Axel
 * @Date 2021/3/21 11:21
 * @Version 1.0
 */

public class CommonHouse extends HouseBuilder {
    @Override
    void builderBasic() {
        System.out.println("普通的房子打地基5米");
    }

    @Override
    void builderWall() {
        System.out.println("普通砌墙 4 米");
    }

    @Override
    void builderRoofed() {
        System.out.println("普通房子封顶");
    }
}
