package com.java.oops.staticMembers;

public class StaticDemo {
    int a=10;
    void getValue(){
        System.out.println(a);
        getMsg();
    }
    static void getMsg(){
        System.out.println();
    }
}
