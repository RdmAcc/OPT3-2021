package com.company;

public class DesktopTelephoneFactory extends TelephoneFactory {
    @Override
    public Telephone createTelephone() {
        return new DesktopTelephone("Sony","X1900","2 meters");
    }
}
