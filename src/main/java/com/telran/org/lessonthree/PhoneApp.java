package com.telran.org.lessonthree;

public class PhoneApp {
    public static void main(String[] args) {

        Phone radioPhone = new RadioPhone();
        Phone setPhone = new SetPhone();

        Phone[] phones = {radioPhone, setPhone};

        for (Phone phone : phones) {
            phone.call();
            phone.receiveCall();
        }
    }
}
