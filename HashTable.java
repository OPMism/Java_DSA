package com.example;
import java.util.*;
/**
 * Created by omprakash on 12/10/16.
 */
public class HashTable {

    public static void main(String args[]) {
            // Create a hash map
            Hashtable balance = new Hashtable();
            Enumeration names;
            String str;
            int rank;
            balance.put("Zara", new Double(3434.34));
            balance.put("Mahnaz", new Double(123.22));
            balance.put("Ayan", new Double(1378.00));
            balance.put("Daisy", new Double(99.22));
            balance.put("Qadir", new Double(-19.08));

            // Show all balances in hash table.
            names = balance.keys();

            while(names.hasMoreElements()) {
                str = (String) names.nextElement();
                System.out.println(str + ": " + balance.get(str));
            }
            System.out.println();
            System.out.println("Zara's new balance: " + balance.get("Zara"));
        }
    }