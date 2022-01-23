package deepcopy;

import java.io.*;

/**
 * @ClassName DeepPrototype
 * @Description 深拷贝是实现方式1：重写clone方法来实现深拷贝
 * 实现深拷贝方式2：通过对象序列化实现深拷贝
 * @Author Axel
 * @Date 2021/3/8 22:46
 * @Version 1.0
 */

public class DeepPrototype implements Serializable, Cloneable {
    private String name;
    private DeepCloneableTarget target;

    public DeepPrototype() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getTarget() {
        return target;
    }

    public void setTarget(DeepCloneableTarget target) {
        this.target = target;
    }

    // 第一种方式实现深拷贝，通过重写clone 方法
    @Override
    public Object clone() {
        //先处理基本数据类型，再处理引用数据类型
        DeepPrototype deep = null;
        try {
            deep = (DeepPrototype) super.clone();
            deep.target = (DeepCloneableTarget) deep.getTarget().clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deep;
    }

    // 第二种方式 通过序列化和反序列化实现深拷贝
    public Object serialDeepClone() {
        // 定义流对象
        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this); // 当前这个对象以对象流的方式传出
            // 反序列化
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
           return  (DeepPrototype) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if(null != bais){
                    bais.close();
                }
                if(null != oos){
                    oos.close();
                }
                if(null != ois){
                    ois.close();
                }
                if(null != bais){
                    bais.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
