package com.telran.org.lessonseventeen.homeworkseventeen.taskthree;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int Id;
    private int age;
    private String name;
    private List<Phone> phones;

    public Client(int id, int age, String name) {
        Id = id;
        this.age = age;
        this.name = name;
        this.phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public int getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
