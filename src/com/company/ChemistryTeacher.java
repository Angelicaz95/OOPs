package com.company;

public class ChemistryTeacher extends Teacher{
    String degree;


    public static void main(String[] args) {
        ChemistryTeacher c=new ChemistryTeacher();
        c.name="Olivia";
        c.degree="Bachelor";
        c.subject="Chemistry";

        c.subjectIsComplicated=true;
        c.experience();
        c.teach();




    }

}
