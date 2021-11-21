package com.company;

public class PianoTeacher extends Teacher{
    int yearsOfExperience;

    public static void main(String[] args) {

        PianoTeacher a=new PianoTeacher();
        a.name="Alex";
        a.subjectIsComplicated=false;
        a.yearsOfExperience=6;
        a.teach();


    }

}
