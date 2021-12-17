package com.company.reviewclass10;

public interface Drawable {
    void draw(); // java compiler automatically adds public and abstract keywords
    // private void draw(); private and protected access modifiers are not allowed
    // static void draw(); static keyword is not allowed.

    int paperSize=10; // variables must be initialized when declared
    // interface fields are public static and final by default
 static void staticMethod(){
     System.out.println("i am  a static method inside the interface");
 }
 default void defaultMethod(){
     System.out.println("I am a default method inside the interface ");
 }
}
class Rectangle implements Drawable{


    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");

    }
}
class Circle implements Drawable{

    @Override
    public void draw() {

    }
}
class DrawableTester{
    public static void main(String[] args) {
        Drawable drawable=new Rectangle();
        drawable.draw();
        Drawable.staticMethod();
    }

}
