package org.factorypattern.simplefactory.dependency.interfaces;

/**
 * @author by Axel
 * @since 2024/6/4 上午9:54
 */
class BeautifulWoman implements Woman {

    @Override
    public void toPlay(String feelLevel) {
        System.out.println(feelLevel);
    }
}
