package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type in your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(Telephone.checkAge(age)>0)
            Telephone.startUp();
    }


}
