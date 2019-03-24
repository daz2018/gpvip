package com.gpvip.pattern.factory.abstractfactory;

public class AbstractfactoryTest {
    public static void main(String[] args) {
        PhoneFactory factory=new IphoneFactory();
        factory.CreatePhone().sendMessage();
        factory.CreateEarphone().listenMusic();
    }
}
