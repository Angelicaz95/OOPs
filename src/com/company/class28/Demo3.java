package com.company.class28;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students= new LinkedHashMap<>();
        students.put(10, "Alexey");
        students.put(10, "Mirjana"); // will replace Alexey
        students.put(15, "Anastasia"); // keys should always be unique
        students.put(45, "Margarita");
        students.put(78, "Julia");
        System.out.println(students);





    }
}
