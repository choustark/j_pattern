package org.factorypattern.simplefactory.dependency.interfaces;

/**
 * @author by Axel
 * @since 2024/6/4 上午9:54
 */
interface Woman {

    String freeLevel = "";

    void toPlay(String feelLevel);

    default void startDo(){
        toPlay("Woman is" + freeLevel  + " is good");
    }
}
