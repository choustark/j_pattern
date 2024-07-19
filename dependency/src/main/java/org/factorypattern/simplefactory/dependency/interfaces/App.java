package org.factorypattern.simplefactory.dependency.interfaces;

/**
 * app
 *
 * @author by Axel
 * @since 2024/6/4 上午9:55
 */
public class App {
    public static void main(String[] args) {
        FuckAction fuckAction = new FuckAction();
        SexWoman sexWoman = new SexWoman();
        fuckAction.fuck(sexWoman);
    }

}
