package com.example;

/**
 * Created by omprakash on 12/12/16.
 */
public class Stack {
    public static void main(String args[]){
        int[] array1 = {1, 3, 5};
        int MAX_SIZE = 3;
        String xAxis="";
        System.out.println(array1[MAX_SIZE -1]);
        for (int i =0; i<=10; i++)
            xAxis+=i + " ";
        //for (int j=0; j<=10; j++)

        //System.out.format("| %2s", array1[1]);
        System.out.println(xAxis);
        String test = "";
        for (int j =0; j<array1.length;j++)
            test+= array1[j] + " ";
        System.out.println(test);
    }
}
