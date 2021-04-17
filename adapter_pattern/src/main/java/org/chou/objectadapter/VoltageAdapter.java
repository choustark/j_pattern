package org.chou.objectadapter;

/**
 * @ClassName VoltageAdapter
 * @Description TODO
 * @Author Axel
 * @Date 2021/4/14 23:21
 * @Version 1.0
 */

public class VoltageAdapter  implements Voltage5V {
    private org.chou.classadapter.Voltage220V voltage220V;

    public VoltageAdapter(){}

    public VoltageAdapter(org.chou.classadapter.Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public Integer outputVoltage5v() {
        if(null != voltage220V){
            Integer integer = voltage220V.output220V();
            return integer/44;
        }else {
            System.out.println("没有适配的电源");
            return 0;
        }
    }
}
