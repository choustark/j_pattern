package com.chou.normal.subject;

import com.chou.normal.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chou
 * @Description 主题，对应着前台
 * @ClassName Secretary
 * @Date 2023/5/2 22:15
 * @Version 1.0
 **/
public class Secretary {

    /**
     * 查看股票同事的集合
     */
    private static final List<StockObserver> observers = new ArrayList<>();

    // 前台小姐姐做出的动作，可以看成是一个状态的改变
    private String action;

    public Secretary(){}

    public Secretary(String action) {
        this.action = action;
    }

    public void notice(){
        for (StockObserver observer : observers) {
            observer.update();
        }
    }

    public void attach(StockObserver observer){
        observers.add(observer);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
