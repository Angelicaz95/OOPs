package com.company.project;

public abstract class Marks {
    double math;
    double biology;
    double history;
    double art;
    Marks(double math, double biology, double history){
        this.math=math;
        this.biology=biology;
        this.history=history;

    }

    public abstract double getPercentage();

}
class A extends Marks{
    A(double math, double biology, double history){
        super(math, biology, history);

    }



    @Override
    public double getPercentage() {
        return (math+biology+history)/3;
    }
}
class B extends Marks{
    B(double math, double biology, double history, double art){
        super(math, biology, history);
        this.art=art;

    }

    @Override
    public double getPercentage() {
        return (math+biology+history+art)/4;
    }
}

class MarksTester{
    public static void main(String[] args) {
        A a=new A(89, 77, 95);
        System.out.println(a.getPercentage());

        B b=new B(98, 96, 78, 82);
        System.out.println(b.getPercentage());

    }
}