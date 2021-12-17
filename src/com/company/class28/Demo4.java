package com.company.class28;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<String,  Double> groceries1 =new TreeMap<>();
        groceries1.put("Eggs", 3.99);
        groceries1.put("Tomato", 3.2);
        groceries1.put("Potato", 10.5); // auto conversion doesn't waork in the wrapper classes
        groceries1.put("Milk", 2.99);
        groceries1.put("Steak", 15.99);

        TreeMap<String,  Double> groceries2 =new TreeMap<>();
        groceries2.put("Soap", 5.99);
        groceries2.put("Shampoo", 12.99);
        groceries2.put("Beer", 11.99);

        TreeMap<String,  Double> groceriesList =new TreeMap<>(); // null keys are not allowed in TreeMap
        groceriesList.putAll(groceries1);
        groceriesList.putAll(groceries2);
        System.out.println(groceriesList);







    }
}
