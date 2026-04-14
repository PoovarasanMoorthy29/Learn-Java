package com.java.RegexFolder;
import java.util.regex.*;
public class DotRegexDemo {
    public static void main(String[] args) {
        String str="Ram is a rat";
        String regex="R.m";
        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(str);
        System.out.println(match);



    }
}
