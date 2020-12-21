package org.example.singleton.type2;

/**
 * Description:
 * Author:      Axel
 * Date:        2020-12-16 23:05
 * Version:     V1.0.0<br>
 * Update:     <br>
 *  
 */

public class HSSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton{
    private Singleton(){}
    private final static Singleton instance;
    static{
         instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
