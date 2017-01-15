package com.company;
import java.util.*;
/**
 * Created by nini on 1/5/2017.
 */
    public class Mem extends Custom

    {
        Scanner input= new Scanner(System.in);
        public Mem(double amount)
        {
            super(amount);
        }
        public void classCostM()
        {
            double mCla=8;
            classCost((int) mCla);
        }


        public void retailCostM()

        {
            System.out.println("What is the price  of your purchase");
            int price=input.nextInt();
            double mRet= price - (price * 1/5);
            retailCost((int) mRet);
        }

        public void aquaticsCostM()
        {
            double mAqua=10;
            aquaticsCost((int)mAqua);
        }

        public void ptCostM()
        {
            System.out.print("How many hours are you taking this class for");
            int hrs=input.nextInt();
            double mPT=20 * hrs;
            ptCost((int)mPT);
        }
}
