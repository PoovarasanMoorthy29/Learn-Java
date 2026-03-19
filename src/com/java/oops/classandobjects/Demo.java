package com.java.oops.classandobjects;

public class Demo {
    // First execute
    static{
        System.out.println("I am Static block!");
    }
    // second excutes
    {
        System.out.println("I am block");
    }
    //third execute
    Demo(){
        System.out.println("I am from constructor!");
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
    }

}
