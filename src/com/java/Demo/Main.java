package com.java.Demo;

public class Main {
    public static void main(String[] args) {
        IPayment payment = new Payment();
        ((Payment) payment).inputGetter();
        System.out.println(payment.getAmount());

    }
}
