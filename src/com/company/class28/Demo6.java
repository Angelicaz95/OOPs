package com.company.class28;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery= new LinkedHashMap<>();
        grocery.put("eggs", 3.99);
        grocery.put("rice", 2.99);
        grocery.put("tomato", 2.99);

        Set<String> keys= grocery.keySet(); // will print keys only
        System.out.println(keys);

        Collection<Double> values = grocery.values(); // will print values only
        System.out.println(values);

        Iterator<String> iterator= grocery.keySet().iterator(); //from the map we get a set and then we get the iterator
        while(iterator.hasNext()){
            String key =iterator.next();
            if(key.contains("e")){
                iterator.remove();

            }

        }

        System.out.println(grocery);

    }
}
