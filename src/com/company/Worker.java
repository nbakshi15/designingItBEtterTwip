package com.company;
import java.util.*;
/**
 * Created by nini on 1/6/2017.
 */
    public class Worker extends Custom

    {
        Scanner input= new Scanner(System.in);
        public Worker(double amountE)
        {
            super(amountE);
        }
        public void classCostE()
        {
            double eCla=3;
            classCost((int) eCla);
        }
        public void retailCostE()
        {
            System.out.println("What is the price  of your purchase");
            int price=input.nextInt();
            double eRet= price - (price * 1/10);
            retailCost((int) eRet);
        }
        public void aquaticsCostE()
        {
            double eAqua=7;
            aquaticsCost((int)eAqua);
        }
        public void ptCostE()
        {
            System.out.print("How many hours are you taking this class for");
            int hrs=input.nextInt();
            double ePT=15 * hrs;
            ptCost((int)ePT);
        }
}
