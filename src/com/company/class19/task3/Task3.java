package com.company.class19.task3;

public class Task3 {
    public static void main(String[] args) {
        MathTeacher a=new MathTeacher();
        a.name="Demir";
        ChemistryTeacher b=new ChemistryTeacher();
        b.name="Alona";
        PianoTeacher c=new PianoTeacher();
        c.name="Julia";

    }
}
class Teacher{
    String name;
    void teach() {
        System.out.println("Teachers teach subjects");
    }
}
class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name+" is teaching math");
    }
}
class PianoTeacher extends Teacher{
    void teachPiano(){
        System.out.println(name+" is teaching piano");
    }
}
class ChemistryTeacher extends Teacher{
    void teachChemistry(){
        System.out.println(name+" is teaching chemistry");
    }
}