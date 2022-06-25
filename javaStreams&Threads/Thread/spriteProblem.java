package Thread;
import jdk.jfr.internal.tool.Main;

import java.util.Scanner;

class MainProcess
{
    public int totalAmount,sPrice,bPrice,sp,bp,day=1,totalBottles,numBottles = 0;
    public boolean flag = true;
    public Thread t1,t2;
    public MainProcess(int totalAmount,int bPrice,int sPrice,int bp,int sp)
    {
        this.totalAmount = totalAmount;
        this.bPrice = bPrice;
        this.sPrice = sPrice;
        this.sp = sp;
        this.bp = bp;
    }

    public void buying() throws InterruptedException {
        while(flag)
        {
            int buyingAmount = (totalAmount * bp)/100;
            numBottles = buyingAmount / bPrice;
            totalBottles += numBottles;
            totalAmount = totalAmount - buyingAmount;
//            System.out.println("Total Amount "+buyingAmount+" Day "+day+" Number of Bottles buy: "+numBottles);
            if(day > 10){
                flag = false;
            }
            Thread.sleep(500);
        }
    }

    public void selling() throws InterruptedException {
        while(flag)
        {
            numBottles = (totalBottles * sp)/100;
            totalBottles = totalBottles - numBottles;
            totalAmount = totalAmount + (numBottles * sPrice);
            System.out.println("Total Amount:  "+totalAmount+" Day:  "+day+" Number of Bottles sold: "+numBottles);
            day = day+1;
            if(day > 10){
                flag = false;
            }
            Thread.sleep(500);
        }
    }

}

public class spriteProblem {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        MainProcess m = new MainProcess(1000,20,25,80,20);
        Thread t1 = new Thread(() -> {
            try {
                m.buying();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                m.selling();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();

    }
}
