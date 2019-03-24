package com.gpvip.pattern.factory.factorymethod;

import com.gpvip.pattern.factory.IPhone;
import com.gpvip.pattern.factory.Phone;

public class IPhoneFactory implements PhoneFactory {

    public Phone CreatePhone() {
        return new IPhone();
    }
}
