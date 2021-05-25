package com.company;

public class Main {

    public static void main(String[] args) {
        TelephoneFactory telephoneFactory = new TelephoneFactory();

        Telephone smartphone = telephoneFactory.getTelephone("smartphone");
        Telephone desktopTelephone = telephoneFactory.getTelephone("desktoptelephone");

        smartphone.Call();
        desktopTelephone.Call();
    }
}
