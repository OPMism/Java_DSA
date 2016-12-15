package com.example;

/**
 * Created by omprakash on 11/20/16.
 */
public class StaticExample {
    static{
        int x = 10;
    }
    public static int returnX(int x){
        return x;
    }
    public static void main(String args[]){
        System.out.print(returnX(14));
    }
}
