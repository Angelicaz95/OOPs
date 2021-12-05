package com.company.projecttasks;

public interface Shape {
    void calculateArea(double a);
    void calculatePerimeter(double a);
}
class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of the circle "+(Math.round(Math.PI*Math.pow(radius,2))));

    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle "+(2*Math.PI*radius));

    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double length) {
        System.out.println("Area of the square "+(length*length));
    }

    @Override
    public void calculatePerimeter(double length) {
        System.out.println("Perimeter of circle "+(4*length));

    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);
    }

}