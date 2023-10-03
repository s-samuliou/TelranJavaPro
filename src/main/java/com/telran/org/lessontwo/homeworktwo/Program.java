package com.telran.org.lessontwo.homeworktwo;

public class Program {
    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone(
                "iPhone",
                "+375 44 555-00-44");

        System.out.println(buttonPhone.call("+375 00 000-00-00"));
        System.out.println(buttonPhone.receiveCall("+375 00 000-00-00"));

        SmartPhone smartPhone = new SmartPhone(
                "Google",
                "+375 44 666-00-55");

        System.out.println(smartPhone.call("+375 11 111-11-11"));
        System.out.println(smartPhone.receiveCall("+375 11 111-11-11"));

        RadioPhone radioPhone = new RadioPhone(
                "Samsung",
                "+375 44 777-00-66");

        System.out.println(radioPhone.call("+375 22 222-22-22"));
        System.out.println(radioPhone.receiveCall("+375 22 222-22-22"));

        System.out.println("\n" + makeCall(buttonPhone, "+375 00 tes-ti-ng")); //Task with * (makeCall)
        System.out.println(makeCall(smartPhone, "+375 11 tes-ti-ng"));
        System.out.println(makeCall(radioPhone, "+375 22 tes-ti-ng"));

        System.out.println("\n" + receiveCall(buttonPhone, "+375 99 tes-ti-ng")); //Task with * (receiveCall)
        System.out.println(receiveCall(smartPhone, "+375 88 tes-ti-ng"));
        System.out.println(receiveCall(radioPhone, "+375 77 tes-ti-ng"));
    }

    public static String makeCall(Phone phone, String number) { //task with * part A
        return phone.call(number);
    }

    public static String receiveCall(Phone phone, String number) { //task with * part B
        return phone.receiveCall(number);
    }
}
