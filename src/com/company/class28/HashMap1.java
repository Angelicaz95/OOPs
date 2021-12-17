package com.company.class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        int[] numbers={10, 20, 30};
        for(int number: numbers){
            if(number==10){
                System.out.println("Found");
            }
        }
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        integerArrayList.contains(20);

        Map<Integer, String> studentsInfo=new HashMap<>();
        studentsInfo.put(10, "Alexey");
        studentsInfo.put(100, "Alona");

        System.out.println(studentsInfo.get(100));

    }
}
