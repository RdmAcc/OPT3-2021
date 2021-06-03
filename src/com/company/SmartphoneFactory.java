package com.company;

public class SmartphoneFactory extends TelephoneFactory {
    @Override
    public Telephone createTelephone() {
        return new Smartphone("Samsung", "S8", "Android 10");
    }
}
