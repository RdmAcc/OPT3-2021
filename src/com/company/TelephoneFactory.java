package com.company;

public abstract class TelephoneFactory {

    public static final SmartphoneFactory SMARTPHONE_FACTORY = new SmartphoneFactory();
    public static final DesktopTelephoneFactory DESKTOP_TELEPHONE_FACTORY = new DesktopTelephoneFactory();

    public abstract Telephone createTelephone();
}