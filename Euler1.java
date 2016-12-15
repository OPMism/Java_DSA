package com.example;

/**
 * Created by omprakash on 12/11/16.
 */
public class Euler1 {
    public static void main(String args[]){
        int sum = 0;
        int n = 1000;
        for (int i =0; i< n; i++){
            if(i%3==0)
                sum = sum + i;
            else if(i%5==0)
                sum = sum + i;
        }
        System.out.println("Sum is "+sum);
    }
}
