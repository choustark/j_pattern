import common.Sheep;
import deepcopy.DeepCloneableTarget;
import deepcopy.DeepPrototype;

/**
 * @ClassName Client
 * @Description 需要生成十个相同的Sheep对象 1 直接new 十个对象 2 使用原型模式
 * @Author Axel
 * @Date 2021/3/7 22:10
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {

        // 解决方法一：
        Sheep sheep = new Sheep();
        sheep.setName("肖恩");
        sheep.setAge(3);
        sheep.setColor("red");

        Sheep sheep1 = new Sheep();
        sheep.setName("肖恩");
        sheep.setAge(3);
        sheep.setColor("red");

        Sheep sheep2 = new Sheep();
        sheep.setName("肖恩");
        sheep.setAge(3);
        sheep.setColor("red");

        Sheep sheep3 = new Sheep();
        sheep.setName("肖恩");
        sheep.setAge(3);
        sheep.setColor("red");

        // ...

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);


        // 解决方式二 实现Cloneable接口，重写clone 方法
        Sheep s1 = new Sheep();

        // ------------------------- 以上是浅拷贝 ----------------------

        // 深拷贝克隆
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setName("温迪");
        deepPrototype.setTarget(new DeepCloneableTarget("弓箭","风系"));
        DeepPrototype deep = (DeepPrototype) deepPrototype.clone();


        System.out.println(deepPrototype.getName() + deepPrototype.getTarget().toString());
        System.out.println(deep.getName() + deep.getTarget().toString());


    }
}
