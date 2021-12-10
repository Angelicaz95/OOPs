package com.company.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("JAVA");
        Iterator<String> iterator=subjects.iterator();
        System.out.println(iterator.hasNext()); // tells you if they are any elements left inside the iterator
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext()); // tells you if they are any elements left inside the iterator
        System.out.println(iterator.next());// goes inside the iterator one by one and moves the pointer by one location
        iterator.remove();
        System.out.println(subjects);


    }
}
