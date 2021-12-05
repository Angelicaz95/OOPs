package com.company.class25;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
       //  ArrayList<String> names1=new ArrayList<>(Arrays.asList("Bekki", "Yuliya", "Ira")); 


        ArrayList<String> names=new ArrayList<>();
        names.add("Alona");
        names.add("Julia");
        names.add("Margo");
        names.add("Mirjana");
        names.add("Natalia");

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Alona"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
