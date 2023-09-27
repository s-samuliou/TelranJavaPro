package com.telran.org.lessonone;

public class LessonOneApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setColor("white");
        dog1.setAge(30);
        dog1.setBreed("shepard");

        Dog dog2 = new Dog();
        dog2.setColor("black");
        dog2.setAge(18);
        dog2.setBreed("Angry");

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
