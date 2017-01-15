package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("How much money do you have in your account?");

        Scanner input= new Scanner(System.in);;

        int bal1=input.nextInt();
        Custom bill= new Custom(bal1);
        System.out.print("Welcome to the gym! Are you a walk-in, member, or employee?");
        String type=input.next();
        System.out.print("Are you purchasing anything from the retail section or any classes?");
        String purchase= input.next();

        if(type.equals("walk-in")){
            System.out.println("Here's your bill:");
        }
    }
}
