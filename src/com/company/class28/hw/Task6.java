package com.company.class28.hw;

import java.util.ArrayList;
import java.util.Collection;

public class Task6 {
    public static void main(String[] args) {
        Collection<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(25);
        numbers.add(30);

        int sum=0;
        for(Integer num: numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
