package com.company.class22.hwrecap;

public class Student {
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Students must do home work");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Students must study 25 hours a week");
    }
    @Override
    void doHomeWork(){
        System.out.println("Students must solve repls");
    }
    void doResearch(){
        System.out.println("Students have to do additional research");
    }

}
