package org.factorypattern.normal.pizza;

import lombok.Data;

/**
 * Description: pizza基类
 * Author:      Axel
 * Date:        2020-12-27 22:19
 * Version:     V1.0.0<br>
 * Update:     <br>
 *  
 */
@Data
public class Pizza {
    private String name;
    public void prepare(){
        System.out.println("给"+name+"准备制作披萨材料");
    }

    public void bake(){
        System.out.println("烤"+name+"披萨");
    }

    public void cut(){
        System.out.println("切"+name+"披萨");
    }

    public void box(){
        System.out.println("打包"+name+"披萨");
    }

}
