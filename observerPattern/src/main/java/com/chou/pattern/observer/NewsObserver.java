package com.chou.pattern.observer;

import com.chou.pattern.subject.Subject;

/**
 * @Author Chou
 * @Description 摸鱼看实时咨询的同事
 * @ClassName NewsObserver
 * @Date 2023/5/3 12:40
 * @Version 1.0
 **/
public class NewsObserver extends Observer {

    private String name;
    private Subject subject;

    public NewsObserver() {
        super();
    }

    public NewsObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(String.format("%s,%s 关闭了其他和工作无关的网页，开始继续搬砖....", subject.getAction(), name));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Subject getSubject() {
        return subject;
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
