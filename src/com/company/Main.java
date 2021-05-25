package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startUp();
    }
    public static void startUp(){
        TelephoneFactory telephoneFactory = new TelephoneFactory();
        Scanner sc = new Scanner(System.in);

        Telephone smartphone = telephoneFactory.getTelephone("smartphone");
        Telephone desktopTelephone = telephoneFactory.getTelephone("desktoptelephone");

        System.out.println("Choose what do device you want to use: \n 1. Desktoptelephone \n 2. Smartphone \n 3. Exit");
        int choice = sc.nextInt();
        if(choice==1)
            desktopTelephone.mainMenu();
        else if(choice==2)
            smartphone.mainMenu();
        else
            return;
    }
}
