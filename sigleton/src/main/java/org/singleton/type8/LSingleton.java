package org.singleton.type8;

import static org.singleton.type8.Singleton.INSTANCE;

/**
 * Description: 静态内部类 避免了线程安全问题 利用静态内部特点实现延迟加载，效率高
 * Author:      Axel
 * Date:        2020-12-16 23:10
 * Version:     V1.0.0<br>
 * Update:     <br>
 *  
 */

public class LSingleton {
    public static void main(String[] args) {
        Singleton instance = INSTANCE;
        Singleton instance1 = INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.sayOk();
    }
}

enum  Singleton {
    INSTANCE;

    public void sayOk(){
        System.out.println("ok~~");
    }
}
