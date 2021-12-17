package com.company.class28.hw;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
        public String printInfo(){
            return name+" "+ lastName+" "+age+" "+salary;
        }
}
class PersonTester{
    public static void main(String[] args) {
        Map<Integer, Person> person = new TreeMap<>();
        person.put(001, new Person("Peter", "Parker", 21, 50000));
        person.put(002, new Person("Tony", "Stark", 45, 400000));
        person.put(007, new Person("James", "Bond", 38, 100000));
        Collection<Person> values = person.values();
        for(Person v: values){
            System.out.println(v.printInfo());

        }





    }
}
