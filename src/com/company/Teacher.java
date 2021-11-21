package com.company;

public class Teacher {
    String name;
    String subject;
    boolean subjectIsComplicated;

    void teach(){
        System.out.println(name+" is teaching a class at the moment");
    }
    void experience(){
        System.out.println(name+" has years of experience teaching this "+subject);
    }

}
