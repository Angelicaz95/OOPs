package com.company.class28.hw;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task5 {
    public static void main(String[] args) {
        Collection<String> objects= new LinkedHashSet<>();
        objects.add("Book");
        objects.add("Pencil");
        objects.add("Phone");
        objects.add("Laptop");
        for(String obj: objects){
            System.out.print(obj);
        }




    }
}
