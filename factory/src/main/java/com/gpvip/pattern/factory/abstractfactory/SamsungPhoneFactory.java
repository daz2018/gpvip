package com.gpvip.pattern.factory.abstractfactory;

import com.gpvip.pattern.factory.Phone;
import com.gpvip.pattern.factory.SamsungPhone;

public class SamsungPhoneFactory implements PhoneFactory {

    public Phone CreatePhone() {
        return new SamsungPhone();
    }


    public Earphone CreateEarphone() {
        return new SamsungEarphone();
    }
}
