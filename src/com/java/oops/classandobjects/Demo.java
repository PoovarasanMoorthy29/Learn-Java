package com.java.oops.classandobjects;

public class Demo {
    static int a=10;
    int index=0;
    static{
        a*=5;
        System.out.println("After: "+a);
        System.out.println("I am Static block!");
    }
    static int i=1;
    {
        index++;
        System.out.println("I am block "+ (index++));
        System.out.println("After increment: "+index);
    }

    Demo(){
        System.out.println("I am from constructor!"+ i);
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
    }

}
