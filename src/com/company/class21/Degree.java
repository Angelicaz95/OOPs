package com.company.class21;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a Degree, you need a high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Master's degree, you need a Bachelor's degree");
    }

}
class Tester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors b=new Bachelors();
        b.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();
    }
}
