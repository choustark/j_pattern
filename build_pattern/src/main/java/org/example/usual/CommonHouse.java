package org.example.usual;

/**
 * @ClassName CommonHouse
 * @Description 普通的房子
 * @Author Axel
 * @Date 2021/3/20 23:09
 * @Version 1.0
 */

public class CommonHouse extends AbstractHouse{
    @Override
    public void builderBasic() {
       System.out.println("普通的房子打地基");
    }

    @Override
    public void builderWall() {
        System.out.println("普通的房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通的封顶");
    }
}
