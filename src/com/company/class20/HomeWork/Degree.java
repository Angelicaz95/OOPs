package com.company.class20.HomeWork;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }

}
class Bachelor extends Degree{

}
class Master extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("You need a bachelor's degree to get a master's degree ");
    }

}
class DegreeTester{
    public static void main(String[] args) {
        Degree a=new Degree();
        a.getPrerequisite();

        Bachelor b=new Bachelor();
        b.getPrerequisite();

        Master c=new Master();
        c.getPrerequisite();
    }
}
