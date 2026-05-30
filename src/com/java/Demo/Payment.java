package com.java.Demo;

import java.util.Scanner;
public class Payment implements IPayment{
    private double amount;
    @Override
    public void setAmount(double amount) {
        this.amount=amount;
    }


    @Override
    public double  getAmount() {
        return this.amount;

    }

    public String  inputGetter(){
        System.out.println("Enter your amount:");
        Scanner scanner = new Scanner(System.in);
        amount=scanner.nextInt();
        return ("Amount :" +amount);
    }
}
