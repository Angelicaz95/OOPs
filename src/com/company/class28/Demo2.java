package com.company.class28;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> fruit=new HashMap<>();
        fruit.put("Apple", 10);
        fruit.put("Mango", 15);
        fruit.put("Orange", 20);
        fruit.put("Kiwi", 25);
        fruit.put("Apricot", 18);
        System.out.println(fruit.get("Kiwi")); // returns the corresponding value
        System.out.println(fruit.remove("Orange")); //returns the value it removes
        System.out.println(fruit);
        System.out.println(fruit.containsKey("cow"));
        System.out.println(fruit.containsKey("Mango"));
        System.out.println(fruit.containsValue(25));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.replace("Mango", 35));
        System.out.println(fruit);





    }

}
