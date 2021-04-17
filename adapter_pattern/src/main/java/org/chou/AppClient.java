package org.chou;

import org.chou.classadapter.Phone;
import org.chou.classadapter.Voltage220V;
import org.chou.classadapter.VoltageAdapter;

/**
 * Hello world!
 *
 */
public class AppClient {
    public static void main( String[] args ) {
        System.out.println("类适配模式....");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
        System.out.println("对象适配器模式....");
        org.chou.objectadapter.Phone phone1 = new org.chou.objectadapter.Phone();
        phone1.charging(new org.chou.objectadapter.VoltageAdapter(new Voltage220V()));
    }
}
