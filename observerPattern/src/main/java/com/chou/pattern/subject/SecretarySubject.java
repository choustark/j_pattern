package com.chou.pattern.subject;

import com.chou.pattern.observer.Observer;
import com.chou.pattern.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chou
 * @Description 主题，对应着前台
 * @ClassName Secretary
 * @Date 2023/5/2 22:15
 * @Version 1.0
 **/
public class SecretarySubject extends Subject {

    /**
     * 查看股票同事的集合
     */
    private static final List<Observer> observers = new ArrayList<>();

    // 前台小姐姐做出的动作，可以看成是一个状态的改变
    private String action;

    public SecretarySubject(){}

    public SecretarySubject(String action) {
        this.action = action;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notice(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
