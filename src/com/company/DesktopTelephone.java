package com.company;

import java.util.Scanner;

class DesktopTelephone extends Telephone {
    private String cableLenght;


    public DesktopTelephone(String brand, String model, String cableLenght) {
        super(brand, model, cableLenght);
        this.cableLenght = cableLenght;
    }

    void getCableLenght() {
        System.out.println(cableLenght);
    }
    @Override
    void Dialing(){
        System.out.println("Type in the phone number you want the desktop telephone to call :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextLine();
        if(!isNumberCorrect(number))
            Dialing();
    }
    @Override
    void Connecting(){
        System.out.println("Desktop telephone is dialing : " + number);
        System.out.println("Desktop telephone is connecting... \nConnected");
    }
    @Override
    void Ending(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desktop telephone call has ended");
        System.out.println();
        System.out.println("press enter to go back");
        String a = sc.nextLine();
        mainMenu();
    }
    @Override
    void Info() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Brand : "); getBrand();
        System.out.print("Model : "); getModel();
        System.out.print("Cable length : "); getCableLenght();
        System.out.println();
        System.out.println("press enter to go back to go back");
        String a = sc.nextLine();
        mainMenu();
    }

    @Override
    void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Using DesktopTelephone");
        System.out.println(" 1. Call\n 2. Info \n 3. Choose another device");
        int choice = sc.nextInt();
        if(choice==1)
            Call();
        else if(choice==2)
            Info();
        else
            startUp();

    }
}