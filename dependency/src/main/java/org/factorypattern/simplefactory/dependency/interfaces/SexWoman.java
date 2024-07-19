package org.factorypattern.simplefactory.dependency.interfaces;



class SexWoman implements Woman {


    @Override
    public void toPlay(String s) {
        System.out.println(s);
    }
}
