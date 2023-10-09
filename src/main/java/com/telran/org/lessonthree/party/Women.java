package com.telran.org.lessonthree.party;

public class Women extends Guest implements LikeDance{
    public Women(String name, int age) {
        super(name, "F", age);
    }

    @Override
    public void dance() {
        System.out.println("I am " + super.getName() + " and I wanna dance");
    }
}
