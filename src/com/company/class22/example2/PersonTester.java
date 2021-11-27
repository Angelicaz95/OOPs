package com.company.class22.example2;

public class PersonTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Asghar");
        Person person=new Teacher("Asel");
        person.eat();
        Person p=new Student("Mike");
        Person[] array={new Student("Farhad"), new Teacher("Asel"), new Employee("Angie")};
        for(Person person2: array){
            person2.performDailyTasks();
            if(person2 instanceof Teacher){
                ((Teacher)person2).designClasses();

            }
        }

    }

}
