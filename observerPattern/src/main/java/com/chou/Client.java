package com.chou;

import com.chou.generic.observer.*;
import com.chou.normal.subject.Secretary;
import com.chou.pattern.observer.NewsObserver;
import com.chou.pattern.observer.Observer;
import com.chou.pattern.observer.StockObserver;
import com.chou.pattern.subject.SecretarySubject;

public class Client {
    public static void main(String[] args) {
        //normalAction();
        //observerAction();

        User user = new User("张三", "123213@foxmail.com", "13982124217", "12311");
        UserRegisterAction action = new UserRegisterAction(UserAction.ADD,user);
        action.addObserver(new PlusEmailMsg());
        action.addObserver(new PlusSmsMsg());
        action.register();
    }

    /**
     * 使用观察者模式完成摸鱼报警系统
     * 与之前的代码相比这里把被观察者和观察者进行了抽象，针对不同的被观察者和观察者只需要继承或者实现对应类即可。
     */
    private static void observerAction() {
        SecretarySubject xiaoJiang = new SecretarySubject();
        StockObserver tongShi1 = new StockObserver("老六",xiaoJiang);
        NewsObserver tongShi2 = new NewsObserver("王五",xiaoJiang);
        xiaoJiang.attach(tongShi1);
        xiaoJiang.attach(tongShi2);
        xiaoJiang.setAction("老板回来啦！！！");
        xiaoJiang.notice();
    }

    /**
     * 普通的方式实现摸鱼通知程序，主要缺点
     * 1、Observer类 和 subject类 高度耦合。如果需要在做其他事情的同事，则需要更改 secretary 中的变量，并且还需要需求notice() 方法，来通知。
     * 其中 subject类状态也是存在多种的，所以在Observer 类中update() 方法也需要修改，违背了 开闭原则 （对软件程序的修改关闭，对程序的扩展开发）
     * 2、在编程中应该是面对抽象或者说是接口编程，在update(),和 attach() 的入参进行修改。
     */
    private static void normalAction() {
        Secretary xiaoJiang = new Secretary();
        com.chou.normal.observer.StockObserver tongShi1 = new com.chou.normal.observer.StockObserver("张三", xiaoJiang);
        com.chou.normal.observer.StockObserver tongShi2 = new com.chou.normal.observer.StockObserver("李四", xiaoJiang);
        xiaoJiang.attach(tongShi1);
        xiaoJiang.attach(tongShi2);
        xiaoJiang.setAction("老板回来啦！！！！");
        xiaoJiang.notice();
    }
}