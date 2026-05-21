package com.java.dsa.bitmanipulation;

public class FindSetBitCount {
    //brute force
    public int countSetBit(int n){
        String bin="";
        int count=0;
        while(n>0){
            bin+=((n%2==0)?0:1);
            n/=2;

        }
        for (int i=0 ;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=13;
        FindSetBitCount obj=new FindSetBitCount();
        System.out.println(obj.countSetBit(n));
    }
}
