package com.chou.pattern.observer;

import com.chou.pattern.subject.Subject;

/**
 * @Author Chou
 * @Description 观察者的抽象
 * @ClassName Observer
 * @Date 2023/5/3 11:50
 * @Version 1.0
 **/
public abstract class Observer {

   private String name;

   private Subject subject;

   Observer(){};

   Observer(String name,Subject subject){
      this.name=name;
      this.subject = subject;
   }
   public abstract void update();

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
