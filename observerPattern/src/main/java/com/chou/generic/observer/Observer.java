package com.chou.generic.observer;

/**
 * 观察者抽象
 *
 * @author by Axel
 * @since 2024/6/19 下午10:44
 * <S> 可观察的事务的抽象
 * <O> 观察者
 * <A> 参数
 */
public interface Observer<S extends Observable<S,O,A>,O extends Observer<S,O,A>,A> {

    public void update(S subject,A argument);
}
