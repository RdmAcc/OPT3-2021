package com.company;

import java.util.Scanner;

class Smartphone extends Telephone {
    private String software;

    public Smartphone(String brand, String model, String software) {
        super(brand, model);
        this.software = software;
    }

    void getSoftware() {
        System.out.println(software);
    }
    @Override
    void Dialing(){
        System.out.println("Smartphone is dialing : ");
    }
    @Override
    void Connecting(){

        System.out.println("Smartphone is connecting... \nConnected");
    }
    @Override
    void Ending(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Smartphone call has ended");
    }
}