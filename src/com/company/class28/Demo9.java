package com.company.class28;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery= new LinkedHashMap<>();
        grocery.put("eggs", 3.99);
        grocery.put("rice", 2.99);
        grocery.put("tomato", 2.99);
        System.out.println(grocery);

        Iterator<Map.Entry<String, Double>> iterator =  grocery.entrySet().iterator(); // both keys and values
        while(iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            if(entry.getKey().equals("rice") && entry.getValue()==2.99){
                iterator.remove();
            }
        }
        System.out.println(grocery);


    }
}
