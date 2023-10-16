package com.telran.org.lessonfour;

public class PrentTest {

    public static void main(String[] args) {
        Parent parent;

        parent = ChildOne.create();
        parent.printGreetings();

        parent = new ChildTwo();
        parent.printGreetings();

        parent = new MiddleChild();
        parent.printGreetings();
        parent.printThanks();
        parent.printWishes();
        parent.name = "Stsiapan";


    }
}
