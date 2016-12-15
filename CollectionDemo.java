package com.example;

/**
 * Created by omprakash on 12/9/16.
 */
import java.util.*;
public class CollectionDemo {
    // Implement LRU cache
    public static void main(String[] args) {
        HashSet h1= new HashSet();
        h1.add("4");
        h1.add("96");
        h1.add("50");
        //h1.remove("1");
        System.out.println();
        System.out.println("Hashset Cache contents");
        System.out.print("\t" + h1);
        System.out.println();
        System.out.println("Hashset contains check " + h1.contains("4"));
    }
}
