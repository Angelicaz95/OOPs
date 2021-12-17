package com.company.class28.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> employees=new HashMap<>();
        employees.put("Mark Harris", 89000);
        employees.put("Alison Oh", 98678);
        employees.put("Carmen Bowen", 78000);
        employees.put("John Smith", 100000);

        int largestSalary=Integer.MIN_VALUE;


        Iterator<Integer> iterator= employees.values().iterator();
        while(iterator.hasNext()){
            Integer value= iterator.next();
            if(value>largestSalary){
               largestSalary= value;
            }
        }
        Set<Map.Entry<String, Integer>> entrySet= employees.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            if(entry.getValue()==largestSalary){
                System.out.println(entry.getKey()+" =$ "+entry.getValue());
            }
        }












    }
}
