package com.java.myEvaluation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindAllAnagram {
    private ArrayList<Integer> anagramIndex(String s,String p){
        //Brute force and time : 20:34
        ArrayList<Integer> result=new ArrayList<>();
        int left=0;
        int right=p.length();
        int [] pFreq=new int[26];
        for(int index=0;index<p.length();index++){
            pFreq[p.charAt(index)-'a']++;
        }
        while(right<=s.length()){
            String curStr=s.substring(left,right);
            int [] curFreq=new int[26];
            for(int index=0;index<curStr.length();index++){
                curFreq[curStr.charAt(index)-'a']++;
            }
            if(Arrays.equals(curFreq,pFreq)){
                result.add(left);
                left++;
                right++;
            }
            else {
                left++;
                right++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        FindAllAnagram obj=new FindAllAnagram();
        System.out.println(obj.anagramIndex(s,p));
    }
}
