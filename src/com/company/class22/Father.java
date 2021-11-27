package com.company.class22;

public class Father {
    String name;
    Father(String name){
        this.name=name;
    }
    void sleep(){
        System.out.println(name+" likes to sleep");
    }
    void eat(){
        System.out.println(name+" likes to eat a lot");
    }
}
