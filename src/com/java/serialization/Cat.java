package com.java.serialization;

import java.io.Serializable;

public class Cat implements Serializable {
    String color;
    int age;

    public Cat(String color, int age) {
        this.age = age;
        this.color = color;
    }
}
