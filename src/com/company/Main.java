package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        checkAge();
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
    public static void checkAge(){
        System.out.println("Type in your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<7){
            System.out.println("You are too young to use this device");
        }
        else if(age<12 && age>6){
            System.out.println("Do you have permission from your parents \n 1. yes \n 2. no");
            int perm = sc.nextInt();
            if(perm==2) {
                System.out.println("You cant use this device");
            }else
                startUp();

        }else
            startUp();
    }
}
