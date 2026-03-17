package com.java.staticFiles;

public class StaticClassDemo {
    private int a=10;


    // Nested Static class
    public static class Demo{
        static int getValue(){
           return 10;
        }

    }

    public static void main(String[] args) {
        StaticClassDemo.Demo obj=new StaticClassDemo.Demo();
        System.out.println(Demo.getValue());
    }
}
