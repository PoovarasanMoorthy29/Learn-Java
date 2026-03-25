package com.java.Matrix;

import java.util.Arrays;

public class FirstCode {
    public static void main(String[] args) {
        //int [rows][columns] matrix=new int[rows][columns]
        int i = 1;
        int[][] arr = new int[3][3];
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr.length; cols++) {
                arr[rows][cols] = i++;
            }
            // printing the matrix..
        }
        for (int num[] : arr) {
            System.out.println(Arrays.toString(num));
        }
    }
}
