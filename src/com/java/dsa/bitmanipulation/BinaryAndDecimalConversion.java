package com.java.dsa.bitmanipulation;

public class BinaryAndDecimalConversion {
    public static void main(String [] args) {
        int n=13;
        String binary="";
        while(n>0){
            binary=(n%2==0?0:1) + binary;
            n/=2;
        }
        System.out.println(binary);
    }
}
