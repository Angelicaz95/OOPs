package com.company.class26;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {


        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("GIT");
        subjects.add("Selenium");
        subjects.add("TestNg");
        System.out.println(subjects);
        subjects.set(2,"Python"); // will replace Java
        System.out.println(subjects);



    }
}
