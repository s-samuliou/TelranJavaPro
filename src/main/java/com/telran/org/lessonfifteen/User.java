package com.telran.org.lessonfifteen;

public class User {
    private String name;
    private String role;

    private int age;

    public User(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}';
    }
}
