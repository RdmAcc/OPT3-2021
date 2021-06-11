package com.company;

import java.util.Scanner;

abstract class Telephone {
    private String brand;
    private String model;
    public String number;

    public Telephone(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    void getBrand() { System.out.println(brand); }
    void getModel() { System.out.println(model); }

    public void Dialing(){
        System.out.println("Type in the phone number you want the smartphone to call :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextLine();
        if(!isNumberCorrect(number))
            Dialing();
    }
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
        Scanner sc = new Scanner(System.in);

        Telephone smartphone = TelephoneFactory.SMARTPHONE_FACTORY.createTelephone();
        Telephone desktopTelephone = TelephoneFactory.DESKTOP_TELEPHONE_FACTORY.createTelephone();

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
    public boolean isNumberCorrect(String n){
        boolean isNumeric = true;
        int length = String.valueOf(n).length();
        try {
            Double d = Double.parseDouble(n);
        } catch (NumberFormatException ex) {
            isNumeric = false;
        }
        if (!isNumeric) {
            System.out.println("Invalid number : The number can only contain numbers");
            return false;
        }else if (length <= 9) {
            System.out.println("Invalid number : The number is too short");
            return false;
        }else if (!n.trim().startsWith("06")) {
            System.out.println("Invalid number : The number need to start with '06' ");
            return false;
        }
        return true;
    }
}

