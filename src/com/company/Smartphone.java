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
        }else if (length < 9) {
            System.out.println("Invalid number : The number is too short");
            return false;
        }else if (!n.trim().startsWith("06")) {
            System.out.println("Invalid number : The number need to start with '06' ");
            return false;
        }
        return true;
    }
    @Override
    void Dialing(){
        System.out.println("Type in the phone number you want to call :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextLine();
        if(!isNumberCorrect(number))
            Dialing();

    }
    @Override
    void Connecting(){
        System.out.println("Smartphone is dialing : " + number );
        System.out.println("Smartphone is connecting... \nConnected");
    }
    @Override
    void Ending(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Smartphone call has ended");

        System.out.println();
        System.out.println("press enter to go back");
        String a = sc.nextLine();
        mainMenu();
    }
    @Override
    void Info(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Brand : "); getBrand();
        System.out.print("Model : "); getModel();
        System.out.print("Software : "); getSoftware();
        System.out.println();
        System.out.println("press enter to go back to go back");
        String a = sc.nextLine();
        mainMenu();

    }

    @Override
    void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Using Smartphone");
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