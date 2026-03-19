package com.java.basics;

public class MainMethodOverload {
    public static void main(String[] args) {
        System.out.println("parameterized main method");
        main(0);



    }
 // It is legal but not recommended
    public static void main(int n) {
        System.out.println("Hi i am Main method with N as input ");

    }

}
