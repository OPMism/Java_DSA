package com.example;

/**
 * Created by omprakash on 11/6/16.
 */
public class BubbleSorting {
    public static void main(String args[]){
        BubbleSorting b1 = new BubbleSorting();
        int[] a1 = {1, 94, 56, 67, 7, 90};
        b1.BubbleSort(a1);
    }
    public void BubbleSort(int[] array) {
        int n = array.length;
        int k, i;
        for (k = 0; k < n; k++) {
            for (i = 0; i < n-k-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }
        PrintArray(array);
    }
    public void PrintArray(int[] arr){
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
