package com.company.class22.hwrecap;

public class StudentTester {
    public static void main(String[] args) {

    Student[] students={new SyntaxStudent()};
    for(Student s:students){
        s.study();
        s.doHomeWork();
        s.practice();
        if(s instanceof SyntaxStudent){
            ((SyntaxStudent)s).doResearch();
        }
    }
}
}
