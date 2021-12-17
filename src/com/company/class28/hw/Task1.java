package com.company.class28.hw;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Ukraine", "Kyiv");
        countries.put("Italy", "Rome");
        countries.put("France", "Paris");
        countries.put("Poland", "Warsaw");

        System.out.println("Printing the keys using for each loop");
        Set<String> keys = countries.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("Printing the keys using iterator");
        Iterator<String> iterator = countries.keySet().iterator();
        while (iterator.hasNext()) {
            String k = iterator.next();
            System.out.println(k);
        }
        System.out.println("Printing the values using for each loop");

        Collection <String> values = countries.values();
        for(String value: values){
            System.out.println(value);
        }
        System.out.println("Printing the values using the iterator");

        Iterator<String> it = countries.values().iterator();
        while(it.hasNext()){
            String v = it.next();
            System.out.println(v);
        }
        System.out.println("Printing all keys and values using for each loop");

        Set<Map.Entry<String, String>> allValues = countries.entrySet();
        for(Map.Entry<String, String> all : allValues){
            System.out.println(all.getKey() + " : "+all.getValue());
        }
        System.out.println("Printing all keys and  values using iterator");
        Iterator<Map.Entry<String, String>> i = countries.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry<String, String> a = i.next();
            System.out.println(a.getKey()+" : "+a.getValue());


        }


    }
}



