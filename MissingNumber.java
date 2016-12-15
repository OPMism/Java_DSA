package com.example;

/**
 * Created by omprakash on 11/18/16.
 *
 * Sum the first array & then start subtracting elements from second array
 *
 * Another approach is to use XOR.
 * 1 XOR 1 & 0 XOR 0 => 0
 * 0 XOR 1 & 1 XOR 0 => 1
 *
 * Number XOR 0 => Number
 * Number XOR Number => 0
 */
public class MissingNumber {
    public static void main(String args[]){
        int[] arr1 = {1, 45, 5 ,6 ,7};
        int[] arr2 = {6, 7, 5, 1};
        int sum = 0, num=0;
        int result = arr1[0];
        if((arr1.length - arr2.length==1)||(arr2.length-arr1.length==1)){
            for(int i=1;i<arr1.length;i++)
                //sum = sum + arr1[i];
                result = result ^ arr1[i];
            num = sum;
            for(int j =0;j<arr2.length;j++){
                //num = num - arr2[j];
                result = result ^ arr2[j];
            }
            System.out.print(result);
        }
        else
            System.out.print("Difference between array length is more than 1");
    }
}
