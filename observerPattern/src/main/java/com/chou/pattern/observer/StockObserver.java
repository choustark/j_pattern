package com.chou.pattern.observer;

import com.chou.pattern.subject.Subject;

/**
 * @Author Chou
 * @Description 看股票的同事
 * @ClassName StockOberver
 * @Date 2023/5/2 22:06
 * @Version 1.0
 **/
public class StockObserver extends Observer{

    private String name;
    private Subject subject;

    public StockObserver(){}

    public StockObserver(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    public void update(){
        System.out.println(String.format("%s,%s 关闭股票行情网页，继续搬砖.....", subject.getAction(), name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
