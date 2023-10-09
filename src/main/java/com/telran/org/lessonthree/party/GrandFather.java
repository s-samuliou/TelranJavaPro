package com.telran.org.lessonthree.party;

public class GrandFather extends Guest implements DrinkAlcohol{


    public GrandFather(String name, int age) {
        super(name, "M", age);
    }

    @Override
    public void drink() {
        System.out.println("I am " + super.getName() + " and I am the best drinker in the world!!!");
    }
}
