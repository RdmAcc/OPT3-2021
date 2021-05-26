package com.company;

import java.util.Scanner;

abstract class Telephone {
    private String brand;
    private String model;
    public String number;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void getBrand() {
        System.out.println(brand);
    }
    void getModel() { System.out.println(model); }

    abstract void Dialing();
    abstract void Connecting();
    abstract void Ending();
    abstract void Info();
    abstract void mainMenu();

    public final void Call(){
        Dialing();
        Connecting();
        Ending();
    }
    public static void startUp(){
        TelephoneFactory telephoneFactory = new TelephoneFactory();
        Scanner sc = new Scanner(System.in);

        Telephone smartphone = telephoneFactory.getTelephone("smartphone");
        Telephone desktopTelephone = telephoneFactory.getTelephone("desktoptelephone");

        System.out.println("Choose what device you want to use: \n 1. Desktoptelephone \n 2. Smartphone \n 3. Exit");
        int choice = sc.nextInt();
        if(choice==1)
            desktopTelephone.mainMenu();
        else if(choice==2)
            smartphone.mainMenu();
        else
            return;
    }
    public static int checkAge(int age){
        if(age<7){
            System.out.println("You can't use this device");
            return 0;
        }
        else if(age<12 && age>=7){
            System.out.println("You can use this device for 60 minutes");
            return 60;
        }else{
            System.out.println("You can use this device for 240 minutes");
            return 240;}
    }
}

