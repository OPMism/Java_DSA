package com.example;

import java.io.IOException;

/**
 * Created by omprakash on 12/8/16.
 */
public class StackSample {
    int top = -1;
    int MAX_SIZE = 10;
    int[] stack1 = new int[MAX_SIZE];

    public static void main(String args[]) throws IOException, Exception{
        StackSample s1 = new StackSample();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.push(10);
        s1.push(11);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (top == MAX_SIZE)
            return true;
        else
            return false;
    }
    public void peep(){
        for (int i =0; i< top; i++)
            System.out.print(stack1[i] + " ");
        System.out.println();
    }

    public void pop() throws Exception{
        try {
            if (isEmpty())
                System.out.println("Stack is empty");
            else
                System.out.println("Popped the last element" + stack1[top]);
            top--;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            peep();
        }
    }

    public void push(int n) throws Exception {
        try {
            if (isFull())
                System.out.println("Stack is full");
            else {
                top++;
                stack1[top] = n;
                System.out.println("Pushed the last element" + stack1[top]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            peep();
        }
    }
}
