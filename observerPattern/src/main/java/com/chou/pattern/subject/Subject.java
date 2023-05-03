package com.chou.pattern.subject;

import com.chou.pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chou
 * @Description 被观察者的抽象
 * @ClassName Subject
 * @Date 2023/5/3 11:50
 * @Version 1.0
 **/
public abstract class Subject {

    private static  final List<Observer> observer = new ArrayList<>();
    private String action;
    public Subject(){
    }

    public Subject(String action){
        this.action = action;
    }

    abstract void attach(Observer observer);

    abstract void delete(Observer observer);

    public void notice(){
        for (Observer obs : observer) {
            obs.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
