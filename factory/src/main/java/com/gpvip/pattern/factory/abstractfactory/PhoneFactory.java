package com.gpvip.pattern.factory.abstractfactory;

import com.gpvip.pattern.factory.Phone;

public interface PhoneFactory {
    Phone CreatePhone();
    Earphone CreateEarphone();
}
