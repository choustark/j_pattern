package com.chou.generic.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 可观察的对象或者数据抽象
 *
 * @author by Axel
 * @since 2024/6/19 下午10:38
 * <S> 可观察的事务的抽象
 * <O> 观察者
 * <A> 参数
 */
public abstract class Observable<S extends Observable<S,O,A>, O extends Observer<S,O,A>,A> {

    protected final List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        observers.add(observer);
    }

    public void removeObserver(O observer) {
        observers.remove(observer);
    }

    public void notifyObservers(A args) {
        for (O observer : observers) {
            observer.update((S) this, args);
        }
    }
}
