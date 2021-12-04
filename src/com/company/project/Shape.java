package com.company.project;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();

}
class Circle implements Shape{
    double area;
    double perimeter;
    double radius=5.5;

    @Override
    public void calculateArea() {
        area=radius*radius*Math.PI;
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter=2*radius*Math.PI;
        System.out.println(perimeter);

    }
}
class Square implements Shape{
    double area;
    double perimeter;
    double side=10.5;

    @Override
    public void calculateArea() {
        area=side*side;
        System.out.println(area);

    }

    @Override
    public void calculatePerimeter() {
        perimeter=side*4;
        System.out.println(perimeter);

    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea();
        c.calculatePerimeter();

        Square s=new Square();
        s.calculateArea();
        s.calculatePerimeter();

    }
}