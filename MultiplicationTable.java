package com.example;

/**
 * Created by omprakash on 11/7/16.
 */
import java.io.*;
public class MultiplicationTable{
    public static void main(String args[]) {
        int[][] data = new int[5][5];
        int l;
        data = Multiplier(5,5);
        for (int m =0; m<data.length; m++)
        {
            System.out.print(m + "\t");        //Prints the X axis
        }
        for (int k=1; k<data.length; k++) {
            for(l =1; l<data.length; l++)
            {
                System.out.print(data[k][l] + "\t");
            }
            System.out.print(l + "\t");        //Prints the Y axis
            System.out.println();
        }
    }
    public static int[][] Multiplier(int row, int column) {
        int[][] out = new int[row][column];
        for (int i=1; i<row; i++) {
            for(int j =1; j<column; j++)
            {
                out[i][j] = (i * j);
            }
        }
        return out;
    }
}