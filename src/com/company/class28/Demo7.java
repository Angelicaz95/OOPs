package com.company.class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery= new LinkedHashMap<>();
        grocery.put("eggs", 3.99);
        grocery.put("rice", 2.99);
        grocery.put("tomato", 2.99);
        System.out.println(grocery);
        Iterator<Double> iterator= grocery.values().iterator();
        while(iterator.hasNext()){
            Double value= iterator.next();
            if(value.equals(2.99)){
                iterator.remove();
            }
            System.out.println(value);

        }
        System.out.println(grocery);

    }
}
