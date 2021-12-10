package com.company.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Monday");
        words.add("Spring");
        words.add("Coffee");
        words.add("Sunshine");
        words.add("Friday");
        words.add("Winter");
        words.add("Mother");

        Iterator<String> iterator=words.iterator();
        while(iterator.hasNext()) {
            String element=iterator.next();
            if(element.endsWith("e")){
                iterator.remove();
            }


        }

        System.out.println(words);

    }
}
