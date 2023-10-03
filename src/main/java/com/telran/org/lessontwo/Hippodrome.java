package com.telran.org.lessontwo;

public class Hippodrome {

    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Cat catTree = new Cat();

        WildCat wildCat = new WildCat();
        SeaCat seaCat = new SeaCat();

        Cat[] cats = {catOne, catTwo, catTree, wildCat, seaCat};
        run(cats);
    }

    private static void run(Cat[] cats) {
        for (Cat cat : cats) {
            cat.voice();
        }
    }
}
