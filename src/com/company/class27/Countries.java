package com.company.class27;


import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Countries {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        Collections.addAll(countries, "Ukraine", "USA", "Italy", "Spain", "Peru", "Indonesia");

        for(String c: countries){
            System.out.println(c);
        }
        // simple for loop is not possible because get() method is not present in Set


        Iterator<String> iterator=countries.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
