package com.example;

/**
 * Created by omprakash on 11/19/16.
 */
public class PalindromeFinder {
    public static void main(String args[]){
        String test1 = "Madam";
        String test2 = "Madame";
        String result="False";
        int n = test2.length();
        for(int i=0; i<n;i++){
            if (test2.charAt(i)==test2.charAt(n-i-1)){
                result = "True";
            }
            else
                result="False";
        }
        if(result=="True")
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
    }
}
