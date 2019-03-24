package com.gpvip.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PhoneFactory iphoneFactory=new IPhoneFactory();
        iphoneFactory.CreatePhone().sendMessage();
    }
}
