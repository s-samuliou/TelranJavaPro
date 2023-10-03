package com.telran.org.lessontwo.homeworktwo;

public class ButtonPhone extends Phone {
    private String ownNumber;

    public ButtonPhone(String phoneName, String ownNumber) {
        super(phoneName);
        this.ownNumber = ownNumber;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public String call(String phoneNumber) {
        return "The phone " + getPhoneName() +
                " " + this.ownNumber + super.call(phoneNumber);
    }

    @Override
    public String receiveCall(String callerNumber) {
        return "The phone " + getPhoneName() +
                " " + this.ownNumber + super.receiveCall(callerNumber);
    }
}
