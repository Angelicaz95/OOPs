package com.company.class28;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo8 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery= new LinkedHashMap<>();
        grocery.put("eggs", 3.99);
        grocery.put("rice", 2.99);
        grocery.put("tomato", 2.99);
        System.out.println(grocery);

        Set<Map.Entry<String, Double>> entrySet =  grocery.entrySet(); // both keys and values

        for(Map.Entry<String, Double> entry: entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
