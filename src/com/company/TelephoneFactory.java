package com.company;

public class TelephoneFactory {

    public Telephone getTelephone(String telephoneType) {
        if (telephoneType == null)
            return null;

        else if(telephoneType.equalsIgnoreCase("Smartphone"))
            return new Smartphone("Samsung", "S8", "Android 10");

        else if(telephoneType.equalsIgnoreCase("DesktopTelephone"))
            return new DesktopTelephone("Sony","X1900","2 meters");

        return null;

    }
}