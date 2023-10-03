package com.telran.org.lessontwo.homeworktwo;

public class Phone {
    private String phoneName;

    public Phone(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String call(String phoneNumber) {
        return " try to make a call to number " + phoneNumber;
    }

    public String receiveCall(String callerNumber) {
        return " try to receive a call from number " + callerNumber;
    }
}
