package com.telran.org.lessonthree;

public class Whale extends SeaAnimal implements Flyable, Eatable{

    private boolean hasTail;

    public Whale(String name) {
        super(name);
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public void eat() {

    }

    @Override
    public void see() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {
        System.out.println("I am whale & I can fly");
    }

    @Override
    public boolean canEat() {
        return false;
    }
}
