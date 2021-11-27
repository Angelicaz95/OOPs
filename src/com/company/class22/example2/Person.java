package com.company.class22.example2;

public class Person {
    String name;
    Person(String name){
        this.name=name;

    }
    void eat(){
        System.out.println("Person is eating");
    }
    void performDailyTasks(){
        System.out.println("Eat, sleep, repeat");
    }

}
class Employee extends Person{
    Employee(String name){
        super(name);
    }
    void performDailyTasks(){
        System.out.println("Working all day in the office and answering emails at night");
    }
}
class Student extends Person{
    Student(String name){
        super(name);

    }
    void performDailyTasks(){
        System.out.println("Attending classes during the day and studying at night");
    }
}
class Teacher extends Person{
    Teacher(String name){
        super(name);
    }
    void performDailyTasks(){
        System.out.println("Giving homework");
    }
    void designClasses(){
        System.out.println("creating repls");
    }

}

