package com.example;

/**
 * Created by omprakash on 11/6/16.
 */
public class BubbleSort {
    public static void main(String args[]){
        BubbleSort b1 = new BubbleSort();
        int[] a1 = {1, 94, 56, 67, 7, 90};
        b1.BubbleSorting(a1);
    }
    public void BubbleSorting(int[] array){
        int n = array.length;
        int i, j, iMin;
        for (i =0; i<n-1; i++){
            iMin = i;
            for (j=i+1; j<n; j++){
                if(array[j]<array[iMin]){
                    iMin=j;
                }
            }
            int temp = array[i];
            array[i] = array[iMin];
            array[iMin] = temp;
        }
        Printarray(array);
    }
    public void Printarray(int[] arr){
        for(int k=0; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
