package com.company;

public class MathTeacher extends Teacher{
    String topic;
    String branch;
    void lesson() {
        System.out.println("The topic of today's math lesson is "+topic);
    }

    public static void main(String[] args) {
        MathTeacher a=new MathTeacher();
        a.subject="Math";
        a.branch="Algebra";
        a.topic="Square roots";
        a.name="Maria Ivanivna";
        a.subjectIsComplicated=true;
        a.lesson();
        a.teach();






    }


}
