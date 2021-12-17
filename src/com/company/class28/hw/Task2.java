package com.company.class28.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> items = new HashMap<>();
        items.put(7664847, "Printer");
        items.put(8709476, "TV");
        items.put(9373635, "Laptop");
        items.put(9375654, "Phone");
        items.put(2345677, "Speaker");

        System.out.println("Printing all keys and values using for each loop");
        Set<Map.Entry<Integer, String>> values = items.entrySet();
        for(Map.Entry<Integer, String> value: values){
            System.out.println(value.getKey()+" : "+value.getValue());
        }

        System.out.println("Printing all keys and values using iterator");

        Iterator<Map.Entry<Integer, String>> iterator = items.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> all = iterator.next();
            System.out.println(all.getKey()+" : "+ all.getValue());
        }

    }
}
