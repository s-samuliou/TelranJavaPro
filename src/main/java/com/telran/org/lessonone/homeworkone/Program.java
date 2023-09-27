package com.telran.org.lessonone.homeworkone;

public class Program {
    public static void main(String[] args) {
        showPersonExample();
        showPhoneExample();
    }

    public static void showPersonExample() {
        Person leonel = new Person();
        leonel.setName("Leonel");
        leonel.setFullName("Messi");
        leonel.setAge(36);

        Person stsiapan = new Person("Stsiapan", "Samuliou", 21);

        System.out.println(leonel);
        leonel.move();
        leonel.talk();

        System.out.println(stsiapan);
        stsiapan.move();
        stsiapan.talk();
    }

    public static void showPhoneExample() {
        Phone iphone = new Phone("+375 44 555-00-44", "15 Pro Max", 172);
        Phone google = new Phone("+375 33 777-00-33", "Pixel 6a", 178);
        Phone samsung = new Phone("+375 29 111-00-66", "Galaxy S23 Ultra", 233);

        System.out.println("Number: " +  iphone.getNumber() + '\''
                + " Model: " + iphone.getModel() + '\''
                + " Weight: " + iphone.getWeight());

        System.out.println("Number: " +  google.getNumber() + '\''
                + "Model: " + google.getModel() + '\''
                + "Weight: " + google.getWeight());

        System.out.println("Number: " +  samsung.getNumber() + '\''
                + "Model: " + samsung.getModel() + '\''
                + "Weight: " + samsung.getWeight());

        iphone.receiveCall("Boss");
        google.receiveCall("Honey");
        samsung.receiveCall("Tel-Ran");
    }
}
