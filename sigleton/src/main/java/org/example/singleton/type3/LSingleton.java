package org.example.singleton.type3;

/**
 * Description: 懒汉式 懒加载的但是线程不安全
 * Author:      Axel
 * Date:        2020-12-16 23:10
 * Version:     V1.0.0<br>
 * Update:     <br>
 *  
 */

public class LSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton {
    private Singleton() {
    }

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;
    }
}
