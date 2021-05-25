package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type in your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(checkAge(age)>0)
            startUp();
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
        Scanner sc = new Scanner(System.in);
        if(age<7){
            System.out.println("You can't use this device");
            return 0;
        }
        else if(age<12 && age>6){
            System.out.println("You can use this device for 60 minutes");
                return 60;
        }else{
            System.out.println("You can use this device for 240 minutes");
            return 240;}
    }
}
