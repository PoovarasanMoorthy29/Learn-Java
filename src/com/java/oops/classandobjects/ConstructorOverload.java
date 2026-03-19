package com.java.oops.classandobjects;

// What is constructor?
// Constructor are a special method to initialize the state of a class.
// object creation = constructor invoked .
public class ConstructorOverload {
    int roll;
    String name;
    ConstructorOverload(){
        this (0,"Undefined");

    }
    ConstructorOverload(int rollNo,String name){
        this.roll=rollNo;
        this.name=name;
        System.out.println("RollNo: "+this.roll+"\n"+"Name: "+this.name);
    }

    public static void main(String[] args) {
        ConstructorOverload obj=new ConstructorOverload();

    }
}
