package org.example.usual;

/**
 * @ClassName AbstractHouse
 * @Description 使用简单的方法建造房子
 * @Author Axel
 * @Date 2021/3/20 23:06
 * @Version 1.0
 */

public abstract class AbstractHouse {
    abstract void builderBasic();

    abstract void builderWall();

    abstract void roofed();

    public void builder(){
        this.builderBasic();
        this.builderWall();
        this.roofed();
    }
}
