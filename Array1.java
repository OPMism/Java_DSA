package com.example;
import java.io.*;
import java.util.*;
/**
 * Created by omprakash on 12/3/16.
 */
public class Array1 {
    public static void main(String args[]){
        int MAX_SIZE = 10;
        int[] array = new int[MAX_SIZE];
        int sum=0;
        Scanner input = new Scanner(System.in);
        for (int i=0;i<MAX_SIZE;i++)
        {            array[i] = input.nextInt();
            sum = sum + array[i];}
        System.out.println("Sum is "+ sum);
    }
}
