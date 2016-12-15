package com.example;
/**
 * Created by omprakash on 11/19/16.
 */
    import java.util.Arrays;
    public class SelectionSort {
        public static void selectionSort(int[] array) {
            if(array == null || array.length < 2) {
                return;
            }
            int n = array.length;
            for(int i = 0; i < n-1; i++) {
                int minIndex = i;   // Index of minimum element from elements between i to n
                for(int j = i+1; j < n; j++) {
                    if(array[minIndex] > array[j]) {
                        minIndex = j;
                    }
                }
                if(i != minIndex && array[i] != array[minIndex]) {
                    swap(array, i, minIndex);
                    System.out.println("Pass " + i + ": " + Arrays.toString(array));
                }
            }
        }
        private static void swap(int[] array, int i, int j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        public static void main(String[] args) {
            int[] array = {12, 35, 87, 26, 9, 28, 7};
            selectionSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }