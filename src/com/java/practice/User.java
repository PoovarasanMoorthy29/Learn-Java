package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int age;
    public User(String name,int age){
        this.name=name;
        this.age=age;

    }
    List<User> list=new ArrayList<>();

    public void addUser(User user){
       list.add(user);

    }
    public static void main(String [] args) {
        User user=new User("Hello",24);
        user.addUser(user);
        System.out.println(user.list.getFirst());
    }
}
