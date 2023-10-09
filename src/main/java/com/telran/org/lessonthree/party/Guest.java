package com.telran.org.lessonthree.party;

public abstract class Guest {

    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Guest(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printGreetings() {
        System.out.println("Hello I am " + this.name);
    }
}
