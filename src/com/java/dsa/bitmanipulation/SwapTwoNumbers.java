package com.java.dsa.bitmanipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("Before => A: "+a +" ; B: "+b);
        a=a^b;
        System.out.println("a:"+a);
        b=a^b;
        System.out.println("b:"+b);
        a=a^b;
        System.out.println("After => A:"+a+" ; B:"+b);

    }
}
