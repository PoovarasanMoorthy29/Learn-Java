package com.java.oops.exceptionHandling;

public class Intro {
    public static int divide(int n1, int n2){
        try{
            int res=n1/n2;
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        return 0;

    }

    public static void main(String[] args) {
        var n=10;
        int m=0;
        System.out.println(Intro.divide(n,m));
    }

}
