package org.chou.objectadapter;

/**
 * @ClassName Phone
 * @Description 手机充电 标准电压 220 需要 适配 5v 的电压
 * @Author Axel
 * @Date 2021/4/14 23:14
 * @Version 1.0
 */


public class Phone {

    public void charging(Voltage5V voltage5V){
        if(voltage5V.outputVoltage5v() == 5){
            System.out.println("手机开始充电....");
        }else {
            System.out.println("手机不能充电...");
        }

    }
}
