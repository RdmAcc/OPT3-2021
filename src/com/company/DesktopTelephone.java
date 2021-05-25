package com.company;

import java.util.Scanner;

class DesktopTelephone extends Telephone {
    private String cableLenght;


    public DesktopTelephone(String brand, String model, String cableLenght) {
        super(brand, model);
        this.cableLenght = cableLenght;
    }

    void getCableLenght() {
        System.out.println(cableLenght);
    }
    @Override
    void Dialing(){
        System.out.println("Desktop telephone is dialing : ");
    }
    @Override
    void Connecting(){
        System.out.println("Desktop telephone is connecting... \nConnected");
    }
    @Override
    void Ending(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desktop telephone call has ended");
    }
}