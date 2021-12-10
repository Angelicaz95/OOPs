package com.company.class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("GIT");
        subjects1.add("TestNg");
        subjects1.add("Cucumber");
        subjects1.add("SQL");
        subjects1.add("APIs");



        ArrayList<String>subjects2=new ArrayList<>();
        subjects2.add("TestNg");
        subjects2.add("Cucumber");
        subjects2.add("SQL");
        subjects2.add("APIs");
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects1.retainAll(subjects2); // will print what is present in subjects1 and subjects2
        System.out.println(subjects1);


    }
}
