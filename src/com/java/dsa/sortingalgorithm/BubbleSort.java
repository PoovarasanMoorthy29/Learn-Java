package com.java.dsa.sortingalgorithm;

import java.util.Arrays;
public class BubbleSort {
    public void sortArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            System.out.println("-----Next step------");
        }
    }
    public static void main(String [] args){
        int[]arr={3,4,5,1,2};
        BubbleSort obj=new BubbleSort();
        obj.sortArray(arr);
        System.out.println("Sorted list: " +Arrays.toString(arr));
    }
}
