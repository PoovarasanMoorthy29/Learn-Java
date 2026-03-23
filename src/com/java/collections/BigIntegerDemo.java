package com.java.collections;

import java.math.BigInteger;
public class BigIntegerDemo {
    public static void main(String [] args){
        String str1="2";
        String str2="6";

        BigInteger num1=new BigInteger(str1);
        BigInteger num2=new BigInteger(str2);
        num1=num1.multiply(num2);
        System.out.println(num1);
    }
}
