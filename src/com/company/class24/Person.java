package com.company.class24;

public interface Person {
    void eat();
    void sleep();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee, Person{
    void teach();

}
class SDETInstructor implements SyntaxEmployee{
    @Override
    public void eat(){
        System.out.println("Syntax Employee is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Syntax Employee is sleeping");
    }
    @Override
    public void work(){
        System.out.println("Syntax Employee is working");
    }
    @Override
    public void teach(){
        System.out.println("Syntax Employee is teaching");
    }


}