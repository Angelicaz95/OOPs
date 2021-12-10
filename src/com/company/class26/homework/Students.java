package com.company.class26.homework;

import java.util.HashSet;
import java.util.Iterator;

public class Students {
    String name;
    String studentID;
   public Students(String name, String studentID){
       this.name=name;
       this.studentID=studentID;
   }
}
class CollegeStudent extends Students{

    public CollegeStudent(String name, String studentID) {
        super(name, studentID);
    }
}
class UniversityStudent extends Students{

    public UniversityStudent(String name, String studentID) {
        super(name, studentID);
    }
}
class StudentsTester{
    public static void main(String[] args) {


        HashSet<Students> students = new HashSet<>();
        students.add(new CollegeStudent("Oliver", "ID968486"));
        students.add(new UniversityStudent("Anastasia", "ID386548389"));

        Iterator<Students> s= students.iterator();
        while(s.hasNext()) {
            Students st = s.next();
            System.out.println(st.name);


        }


        }




}

