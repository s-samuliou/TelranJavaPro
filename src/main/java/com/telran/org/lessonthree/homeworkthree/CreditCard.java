package com.telran.org.lessonthree.homeworkthree;

public class CreditCard {
    private String cardNumber;
    private int pin;
    private int balance;
    private String currencyType;

    public CreditCard(String cardNumber, int pin, int balance, String currencyType) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", currencyType='" + currencyType + '\'' +
                '}';
    }
}
