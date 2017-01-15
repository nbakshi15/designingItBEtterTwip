package com.company;
import java.util.*;

/**
 * Created by nini on 1/6/2017.
 */
public class Custom {
    Scanner input= new Scanner(System.in);
        public Custom(double amt)
        {
            balance = amt;
        }
        public double getBalance()
        {
            return balance;
        }
        public void classCost(int cla)
        {
            cla=10;
        }
        public void retailCost(int ret)
        {
            System.out.println("What is the price  of your purchase");
            int price=input.nextInt();
            ret=price;
        }
        public void aquaticsCost(int aqua)
        {
            aqua=0;
        }
        public void ptCost(int pt)
        {
            System.out.print("How many hours are you taking this class for");

            int hrs=input.nextInt();

            pt=25*hrs;

        }

        private double balance;

    }
