package com.telran.org.lessontwo;

public class LessonTwoApp {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        cat.setColor("Red");

        WildCat wildCat = new WildCat();
        wildCat.voice();
        wildCat.setColor("White");

        LittleCat littleCat = new LittleCat();
        littleCat.voice();
        littleCat.jump();
        littleCat.setColor("Black");

        LittleCat littleCatTwo = new LittleCat();
        littleCatTwo.voice();
        littleCatTwo.setColor("Yellow");

        SeaCat seaCat = new SeaCat();
        seaCat.voice();
        seaCat.setColor("Blue");
        seaCat.setAge(35);
        seaCat.setHeight(20);
        seaCat.swim();

        System.out.println("\nCat color = " + cat.getColor());
        System.out.println("WildCat color = " + wildCat.getColor());
        System.out.println("LittleCat color = " + littleCat.getColor());
        System.out.println("LittleCatTwo color = " + littleCatTwo.getColor());
        System.out.println("SeaCat color = " + seaCat.getColor());
    }
}
