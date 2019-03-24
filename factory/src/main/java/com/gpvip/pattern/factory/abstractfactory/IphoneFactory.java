package com.gpvip.pattern.factory.abstractfactory;

import com.gpvip.pattern.factory.IPhone;
import com.gpvip.pattern.factory.Phone;

public class IphoneFactory implements PhoneFactory {

    public Phone CreatePhone() {
        return  new IPhone();
    }


    public Earphone CreateEarphone() {
       return  new IPhoneEarphone();
    }
}
