package com.company;
import java.util.Scanner;

public class bank {

    public static void main(String[] args) {
        int choice,a=0;
        float x, y, amount = 0;
        while (a != 3) {
            System.out.println("enter your choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System. out.println("enter the amount");
                    x = sc.nextFloat();
                    amount = amount + x;
                    System.out.println("your deposited amount is" + amount);

                    break;

                case 2:
                    System.out.println("your available is" + amount);
                    System.out.println("enter your amount for withdrawal");
                    y = sc.nextFloat();
                    if(amount<y) {
                        System.out.println("your balance is insufficient");
                    }
                    else {
                        amount = amount - y;
                        System.out.println("your cur balance is" + amount);
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

            }

        }
    }
}


