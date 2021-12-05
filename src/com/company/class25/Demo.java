package com.company.class25;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> listOfNames=new ArrayList<>();
        System.out.println(listOfNames.size());
        listOfNames.add("Natalia");
        listOfNames.add("Mirjana");
        listOfNames.add("Bekki");
        System.out.println(listOfNames.size());
        listOfNames.remove("Bekki");

    }



}
