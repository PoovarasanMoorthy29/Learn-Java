package com.java.Demo;

abstract public class AbstractSuperDemo {
    AbstractSuperDemo(){
        System.out.println("Abstract constructor called!!");
        greet();
        gratitude();
        getMsg();
    }
    void greet(){
        System.out.println("Greetings from the abstract class!");
    }
    abstract void gratitude();
    void getMsg(){
        System.out.println("Hello");
    }


}
