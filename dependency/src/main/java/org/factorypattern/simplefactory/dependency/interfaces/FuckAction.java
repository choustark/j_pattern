package org.factorypattern.simplefactory.dependency.interfaces;

/**
 * @author by Axel
 * @since 2024/6/4 上午9:54
 */
class FuckAction implements Action {

    @Override
    public void fuck(Woman woman) {
        woman.startDo();
    }
}
