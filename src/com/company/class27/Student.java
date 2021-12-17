package com.company.class27;

import java.util.HashSet;
import java.util.Set;

public class Student {

        String name;
        String studentID;
        public Student(String name, String studentID){
            this.name=name;
            this.studentID=studentID;
        }
        void printName(){
            System.out.println(name);
        }



}
class StudentTester{
    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();
        students.add(new Student("Alexey", "56798"));
        students.add(new Student("Sebastian", "98765"));

        for(Student s: students){
            s.printName();
        }



    }
}
