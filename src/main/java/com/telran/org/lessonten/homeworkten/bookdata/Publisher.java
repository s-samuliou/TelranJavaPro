package com.telran.org.lessonten.homeworkten.bookdata;

public class Publisher {
    private String name;
    private int foundationYear;

    public Publisher(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    @Override
    public String toString() {
        return "PublishingHouse{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + foundationYear +
                '}';
    }
}
