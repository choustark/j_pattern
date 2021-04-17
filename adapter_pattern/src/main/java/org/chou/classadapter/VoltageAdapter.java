package org.chou.classadapter;


/**
 * @ClassName VoltageAdapter
 * @Description TODO
 * @Author Axel
 * @Date 2021/4/14 23:21
 * @Version 1.0
 */

public class VoltageAdapter  extends Voltage220V implements Voltage5V{

    @Override
    public Integer outputVoltage5v() {
        Integer integer = super.output220V();
        if(null != integer){
            return integer/44;
        }else {
            return 0;
        }
    }
}
