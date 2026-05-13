package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("cat.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cat cat=(Cat)ois.readObject();
        System.out.println("Cat color:"+cat.color);
        System.out.println("Cat age:"+cat.age);
        fis.close();
        ois.close();
        System.out.println("Deserialization is completed..");

    }
}
