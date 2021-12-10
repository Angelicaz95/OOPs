package com.company.class26.homework;

import java.util.TreeSet;

public class Countries {
    public static void main(String[] args) {
        TreeSet<String>countries=new TreeSet<>();
        countries.add("Ukraine");
        countries.add("Norway");
        countries.add("Italy");
        countries.add("France");
        countries.add("Serbia");
        countries.add("Montenegro");

        System.out.println(countries);

        for(String c: countries){
            System.out.print(c+" ");
        }


    }
}
