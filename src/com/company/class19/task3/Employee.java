package com.company.class19.task3;

public class Employee {
    String name;
    int salary=30000;
    int baseNoDaysOff=20;
    void printSalary(){
        System.out.println(salary);
    }
void printNoDaysOff(){
    System.out.println(baseNoDaysOff);
}

}
class Manager extends Employee{
    int salary=50000; // will use the variable from the parent class because we use super keyword
    int bonus=10;
    int travellingAllowance=200;
    void printSalary(){
        super.printSalary();
        System.out.println(bonus+travellingAllowance+super.salary);
    }

}
