package com.chou.normal.observer;

import com.chou.normal.subject.Secretary;

/**
 * @Author Chou
 * @Description 看股票的同事
 * @ClassName StockOberver
 * @Date 2023/5/2 22:06
 * @Version 1.0
 **/
public class StockObserver  {

    private String name;
    private Secretary secretary;

    public StockObserver(){}

    public StockObserver(String name,Secretary secretary){
        this.name = name;
        this.secretary = secretary;
    }

    public void update(){
        System.out.println(String.format("%s,%s 关闭股票行情网页，继续搬砖.....", secretary.getAction(), name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
}
