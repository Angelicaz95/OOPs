package com.company.class22;

public class Son extends Father{
    Son(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name+" likes to sleep for 10 hours");
    }
    void eat(){
        System.out.println(name+" likes to eat kebabs");
    }

}
