package com.telran.org.lessonthree.party;

public class Man extends Guest implements DrinkAlcohol{

    public Man(String name, int age) {
        super(name, "M", age);
    }

    @Override
    public void drink() {
        System.out.println("I am " + super.getName() + " and I wanna drink");
    }
}
