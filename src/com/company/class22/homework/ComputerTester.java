package com.company.class22.homework;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple("Apple", "macOS"), new Lenovo("Lenovo","Microsoft Windows"), new Dell("Dell", "Microsoft Windows"), new HP("HP", "Microsoft Windows")};

        for(Computer c:computers){
            c.printInfo();
            if(c instanceof Apple){
                ((Apple)c).chip();
            }else if(c instanceof Lenovo){
                ((Lenovo)c).quality();
            }else if(c instanceof Dell){
                ((Dell)c).variety();
            }else if(c instanceof HP){
                ((HP)c).performance();
            }
        }
    }
}
