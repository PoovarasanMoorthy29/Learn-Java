package com.java.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("brown", 4);
        try (FileOutputStream fileOutputStream = new FileOutputStream("cat.txt"); ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream)) {
            objectOutput.writeObject(cat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
