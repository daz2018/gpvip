package com.gpvip.pattern.factory.simplefactory;

import com.gpvip.pattern.factory.HuaweiPhone;
import com.gpvip.pattern.factory.IPhone;
import com.gpvip.pattern.factory.Phone;

public class FactoryTest {
    public static void main(String[] args) {
//        Factory factory=new Factory();
//        Phone phone=factory.CreatePhone("iphone");
//        phone.sendMessage();
//        phone=factory.CreatePhone("huawei");
//        phone.sendMessage();

        Factory factory=new Factory();
        Phone phone=factory.CreatePhone(IPhone.class);
        phone.sendMessage();
        phone=factory.CreatePhone(HuaweiPhone.class);
        phone.sendMessage();
    }
}
