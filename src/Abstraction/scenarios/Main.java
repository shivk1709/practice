package Abstraction.scenarios;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Paypal paypal = new Paypal();
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        paypal.money = sc.nextInt();
        paypal.initiate();
        paypal.validate();
        paypal.processPayment(paypal.money);
    }
}
