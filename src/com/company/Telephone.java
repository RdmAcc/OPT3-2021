package com.company;

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
        mainMenu();

    }
}

