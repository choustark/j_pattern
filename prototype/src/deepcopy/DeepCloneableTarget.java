package deepcopy;

import java.io.Serializable;

/**
 * @ClassName DeepCloneableTarget
 * @Description TODO
 * @Author Axel
 * @Date 2021/3/8 22:34
 * @Version 1.0
 */

public class DeepCloneableTarget implements Serializable,Cloneable {
    private final static Long serialVersionUid = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public static Long getSerialVersionUid() {
        return serialVersionUid;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName=" + cloneName +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
