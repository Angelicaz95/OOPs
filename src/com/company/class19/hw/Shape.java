package com.company.class19.hw;

public class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;

    }
}
class Circle extends Shape{
    public Circle(double radius){
        super(radius);
    }
    double area;

    public void calculate(){
        area=super.radius*super.radius*Math.PI;
        System.out.println(area);

    }
    public static void main(String[] args) {
        Circle a=new Circle(12.0);
        a.calculate();

    }
}
