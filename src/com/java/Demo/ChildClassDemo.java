package com.java.Demo;

public class ChildClassDemo extends AbstractSuperDemo{
    @Override
    void greet() {
        System.out.println("Welcome");

    }

    @Override
    void gratitude() {
        System.out.println("Thank you ");

    }

    public static void main(String[] args) {
        AbstractSuperDemo obj= new ChildClassDemo();
//        obj.getMsg();
//        obj.greet();
//        obj.gratitude();
    }


}
