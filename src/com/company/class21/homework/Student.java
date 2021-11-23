package com.company.class21.homework;

public class Student {
    public void attendClasses(){
        System.out.println("All students have to attend classes in order to learn");
    }
    public void studyTillMidnight(){
        System.out.println("Students have to stay up super late to study everything ");
    }
    public void cryBeforeExam(){
        System.out.println("You have to cry before exam in order to pass it");
    }
    public void submittAssignments(){
        System.out.println("Students have to submitt assignments before deadline");
    }

}
class SyntaxStudent extends Student{
    @Override
    public void studyTillMidnight(){
        System.out.println("Study till midnight? How about all night?");
    }
    public void solveRepls(){
        System.out.println("Repls are fun, they said.");
    }


}
class CollegeStudent extends Student{
    @Override
    public void cryBeforeExam(){
        System.out.println("All you have to do before exam is study");
    }
    public void gainExperience(){
        System.out.println("In order to find a job, you have to have an experience. In order to have an experience, you have to have a job");
    }

}
class SchoolStudent extends Student{

    public void wakeUpEarly(){
        System.out.println("Student have to wake up early to go to school ");

    }
    @Override
    public void submittAssignments(){
        System.out.println("Teachers are nice. I'll do it later");
    }

}
class Tester{
    public static void main(String[] args){
        Student a=new Student();
        a.attendClasses();
        a.cryBeforeExam();
        SyntaxStudent b=new SyntaxStudent();
        b.attendClasses();
        b.solveRepls();
        b.studyTillMidnight();
        CollegeStudent c=new CollegeStudent();
        c.attendClasses();
        c.cryBeforeExam();
        c.gainExperience();
        SchoolStudent d=new SchoolStudent();
        d.attendClasses();
        d.wakeUpEarly();
        d.submittAssignments();

    }
}